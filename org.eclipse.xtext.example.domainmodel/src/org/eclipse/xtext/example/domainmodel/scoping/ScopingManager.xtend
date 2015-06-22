  package org.eclipse.xtext.example.domainmodel.scoping

import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider
import org.eclipse.xtext.xtext.XtextScopeProvider

public class ScopingManager extends XtextScopeProvider
  {
		override getScope(EObject context, EReference reference) {
          
          return super.getScope(context, reference);

		}
      
 }