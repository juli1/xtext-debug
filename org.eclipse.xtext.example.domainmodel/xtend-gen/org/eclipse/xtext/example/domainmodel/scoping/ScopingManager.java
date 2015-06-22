package org.eclipse.xtext.example.domainmodel.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xtext.XtextScopeProvider;

@SuppressWarnings("all")
public class ScopingManager extends XtextScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    return super.getScope(context, reference);
  }
}
