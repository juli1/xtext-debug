/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DESCRIPTION: return createDescription();
      case MyDslPackage.DESCRIPTION_ELEMENT: return createDescriptionElement();
      case MyDslPackage.RATIONALE: return createRationale();
      case MyDslPackage.UNCERTAINTY: return createUncertainty();
      case MyDslPackage.COMPUTE_DECLARATION: return createComputeDeclaration();
      case MyDslPackage.SHOW_VALUE: return createShowValue();
      case MyDslPackage.IMAGE_REFERENCE: return createImageReference();
      case MyDslPackage.APROPERTY_REFERENCE: return createAPropertyReference();
      case MyDslPackage.XNUMBER_LITERAL_UNIT: return createXNumberLiteralUnit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionElement createDescriptionElement()
  {
    DescriptionElementImpl descriptionElement = new DescriptionElementImpl();
    return descriptionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale createRationale()
  {
    RationaleImpl rationale = new RationaleImpl();
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uncertainty createUncertainty()
  {
    UncertaintyImpl uncertainty = new UncertaintyImpl();
    return uncertainty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComputeDeclaration createComputeDeclaration()
  {
    ComputeDeclarationImpl computeDeclaration = new ComputeDeclarationImpl();
    return computeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowValue createShowValue()
  {
    ShowValueImpl showValue = new ShowValueImpl();
    return showValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageReference createImageReference()
  {
    ImageReferenceImpl imageReference = new ImageReferenceImpl();
    return imageReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public APropertyReference createAPropertyReference()
  {
    APropertyReferenceImpl aPropertyReference = new APropertyReferenceImpl();
    return aPropertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNumberLiteralUnit createXNumberLiteralUnit()
  {
    XNumberLiteralUnitImpl xNumberLiteralUnit = new XNumberLiteralUnitImpl();
    return xNumberLiteralUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
