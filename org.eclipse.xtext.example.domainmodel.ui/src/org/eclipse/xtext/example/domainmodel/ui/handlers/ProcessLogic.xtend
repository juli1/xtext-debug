package org.eclipse.xtext.example.domainmodel.ui.handlers

import org.eclipse.xtext.example.domainmodel.domainmodel.PackageDeclaration
import com.google.inject.ImplementedBy
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Feature
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.JvmTypeReference
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.compiler.ImportManager

@ImplementedBy (ProcessLogicDefault)
interface IProcessLogic{
	def void process(PackageDeclaration pkg)
}

class ProcessLogicDefault implements IProcessLogic
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject XbaseCompiler xbaseCompiler
	
	
	override process(PackageDeclaration pkg) {
		println ("package" + pkg)
		pkg.elements.filter(Entity).forEach[e | processEntity (e)]
	}
	
	def processEntity(Entity entity) {
		entity.features.forEach[f | processFeature (f)]
		entity.vars.forEach[v | processVar (v)]
	}
	
	def getJvmType(PackageDeclaration decl) {
		val declaredType = TypesFactory::eINSTANCE.createJvmGenericType
		declaredType.setSimpleName(decl.class.name)
		declaredType.setPackageName(decl.class.package.name)
		declaredType
	}
	
	def compile(XExpression xExpression, FakeTreeAppendable ft) {
		
		xbaseCompiler.toJavaStatement(xExpression, ft, true)
		
	}
	
	def processVar(XExpression expression) {
		println ("expression" + expression)
		println ("expression class" + expression.class.toString)
		var xvar = expression as XVariableDeclaration
		if (xvar.type != null)
		{
			println ("var type explicit" + (expression as XVariableDeclaration).type.toString)
		}
		else
		{
			val typeRef = xvar.inferredType
			println ("var type implicit" + typeRef.simpleName)
		}
		
		val im = new ImportManager()
		val ft = new FakeTreeAppendable(im)
		xbaseCompiler.compileAsJavaExpression (xvar.right, ft, xvar.type)
		println("ft=" + ft.toString)
		
	}
	
	def processFeature(Feature feature) {
		println ("feature" + feature)
	}
	

	
}