/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNumberLiteral;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DESCRIPTION_ELEMENT:
      {
        DescriptionElement descriptionElement = (DescriptionElement)theEObject;
        T result = caseDescriptionElement(descriptionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RATIONALE:
      {
        Rationale rationale = (Rationale)theEObject;
        T result = caseRationale(rationale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNCERTAINTY:
      {
        Uncertainty uncertainty = (Uncertainty)theEObject;
        T result = caseUncertainty(uncertainty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPUTE_DECLARATION:
      {
        ComputeDeclaration computeDeclaration = (ComputeDeclaration)theEObject;
        T result = caseComputeDeclaration(computeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SHOW_VALUE:
      {
        ShowValue showValue = (ShowValue)theEObject;
        T result = caseShowValue(showValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMAGE_REFERENCE:
      {
        ImageReference imageReference = (ImageReference)theEObject;
        T result = caseImageReference(imageReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.APROPERTY_REFERENCE:
      {
        APropertyReference aPropertyReference = (APropertyReference)theEObject;
        T result = caseAPropertyReference(aPropertyReference);
        if (result == null) result = caseXExpression(aPropertyReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.XNUMBER_LITERAL_UNIT:
      {
        XNumberLiteralUnit xNumberLiteralUnit = (XNumberLiteralUnit)theEObject;
        T result = caseXNumberLiteralUnit(xNumberLiteralUnit);
        if (result == null) result = caseXNumberLiteral(xNumberLiteralUnit);
        if (result == null) result = caseXExpression(xNumberLiteralUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptionElement(DescriptionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRationale(Rationale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUncertainty(Uncertainty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComputeDeclaration(ComputeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowValue(ShowValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageReference(ImageReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AProperty Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AProperty Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAPropertyReference(APropertyReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XNumber Literal Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XNumber Literal Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXNumberLiteralUnit(XNumberLiteralUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XNumber Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XNumber Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXNumberLiteral(XNumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
