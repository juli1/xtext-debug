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
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.naming.QualifiedName

@ImplementedBy (ProcessLogicDefault)
interface IProcessLogic{
	def void process(PackageDeclaration pkg)
}

class ProcessLogicDefault implements IProcessLogic
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	
	@Inject XbaseInterpreter interpreter
	
	
	override process(PackageDeclaration pkg) {
		println ("package" + pkg)
		pkg.elements.filter(Entity).forEach[e | processEntity (e)]
	}
	
	def processEntity(Entity entity) {
				println ("entity" + entity.name)
		
		entity.features.forEach[f | processFeature (f)]
		
		val ctx = new DefaultEvaluationContext()
		entity.vars.forEach[v | processVar (v as XVariableDeclaration, ctx)]
		
//		entity.vars.
//		entity.vars.expressions.filter(XVariableDeclaration).forEach[v | processVar(v, ctx)]
	}
	

	
	def processVar(XVariableDeclaration v, IEvaluationContext ctx) {
		try {
			val IEvaluationResult r = interpreter.evaluate(v, ctx, CancelIndicator.NullImpl)
			val o = ctx.getValue(QualifiedName.create(v.name))
			println(v.name + " = " + o)
		} catch(Exception e) {
			e.printStackTrace
		}
		
	}
	 
	def getJvmType(PackageDeclaration decl) {
		val declaredType = TypesFactory::eINSTANCE.createJvmGenericType
		declaredType.setSimpleName(decl.class.name)
		declaredType.setPackageName(decl.class.package.name)
		declaredType
	}
	
	
	
	
	
	def processFeature(Feature feature) {
		println ("feature" + feature)
	}
	

	
}