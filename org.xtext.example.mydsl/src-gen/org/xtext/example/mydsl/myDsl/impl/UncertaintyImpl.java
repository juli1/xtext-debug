/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Uncertainty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getVolatility <em>Volatility</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getCostimpact <em>Costimpact</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getScheduleimpact <em>Scheduleimpact</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getFamiliarity <em>Familiarity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getTimecriticality <em>Timecriticality</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getRiskindex <em>Riskindex</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UncertaintyImpl#getMaturityindex <em>Maturityindex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UncertaintyImpl extends MinimalEObjectImpl.Container implements Uncertainty
{
  /**
   * The default value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatility()
   * @generated
   * @ordered
   */
  protected static final String VOLATILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatility()
   * @generated
   * @ordered
   */
  protected String volatility = VOLATILITY_EDEFAULT;

  /**
   * The default value of the '{@link #getCostimpact() <em>Costimpact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCostimpact()
   * @generated
   * @ordered
   */
  protected static final String COSTIMPACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCostimpact() <em>Costimpact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCostimpact()
   * @generated
   * @ordered
   */
  protected String costimpact = COSTIMPACT_EDEFAULT;

  /**
   * The default value of the '{@link #getScheduleimpact() <em>Scheduleimpact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheduleimpact()
   * @generated
   * @ordered
   */
  protected static final String SCHEDULEIMPACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScheduleimpact() <em>Scheduleimpact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheduleimpact()
   * @generated
   * @ordered
   */
  protected String scheduleimpact = SCHEDULEIMPACT_EDEFAULT;

  /**
   * The default value of the '{@link #getFamiliarity() <em>Familiarity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamiliarity()
   * @generated
   * @ordered
   */
  protected static final String FAMILIARITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFamiliarity() <em>Familiarity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamiliarity()
   * @generated
   * @ordered
   */
  protected String familiarity = FAMILIARITY_EDEFAULT;

  /**
   * The default value of the '{@link #getTimecriticality() <em>Timecriticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimecriticality()
   * @generated
   * @ordered
   */
  protected static final String TIMECRITICALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimecriticality() <em>Timecriticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimecriticality()
   * @generated
   * @ordered
   */
  protected String timecriticality = TIMECRITICALITY_EDEFAULT;

  /**
   * The default value of the '{@link #getRiskindex() <em>Riskindex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskindex()
   * @generated
   * @ordered
   */
  protected static final String RISKINDEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRiskindex() <em>Riskindex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskindex()
   * @generated
   * @ordered
   */
  protected String riskindex = RISKINDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getMaturityindex() <em>Maturityindex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturityindex()
   * @generated
   * @ordered
   */
  protected static final String MATURITYINDEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaturityindex() <em>Maturityindex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturityindex()
   * @generated
   * @ordered
   */
  protected String maturityindex = MATURITYINDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UncertaintyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.UNCERTAINTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVolatility()
  {
    return volatility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolatility(String newVolatility)
  {
    String oldVolatility = volatility;
    volatility = newVolatility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__VOLATILITY, oldVolatility, volatility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCostimpact()
  {
    return costimpact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCostimpact(String newCostimpact)
  {
    String oldCostimpact = costimpact;
    costimpact = newCostimpact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__COSTIMPACT, oldCostimpact, costimpact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScheduleimpact()
  {
    return scheduleimpact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScheduleimpact(String newScheduleimpact)
  {
    String oldScheduleimpact = scheduleimpact;
    scheduleimpact = newScheduleimpact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__SCHEDULEIMPACT, oldScheduleimpact, scheduleimpact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFamiliarity()
  {
    return familiarity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFamiliarity(String newFamiliarity)
  {
    String oldFamiliarity = familiarity;
    familiarity = newFamiliarity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__FAMILIARITY, oldFamiliarity, familiarity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimecriticality()
  {
    return timecriticality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimecriticality(String newTimecriticality)
  {
    String oldTimecriticality = timecriticality;
    timecriticality = newTimecriticality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__TIMECRITICALITY, oldTimecriticality, timecriticality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRiskindex()
  {
    return riskindex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRiskindex(String newRiskindex)
  {
    String oldRiskindex = riskindex;
    riskindex = newRiskindex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__RISKINDEX, oldRiskindex, riskindex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaturityindex()
  {
    return maturityindex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaturityindex(String newMaturityindex)
  {
    String oldMaturityindex = maturityindex;
    maturityindex = newMaturityindex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNCERTAINTY__MATURITYINDEX, oldMaturityindex, maturityindex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.UNCERTAINTY__VOLATILITY:
        return getVolatility();
      case MyDslPackage.UNCERTAINTY__COSTIMPACT:
        return getCostimpact();
      case MyDslPackage.UNCERTAINTY__SCHEDULEIMPACT:
        return getScheduleimpact();
      case MyDslPackage.UNCERTAINTY__FAMILIARITY:
        return getFamiliarity();
      case MyDslPackage.UNCERTAINTY__TIMECRITICALITY:
        return getTimecriticality();
      case MyDslPackage.UNCERTAINTY__RISKINDEX:
        return getRiskindex();
      case MyDslPackage.UNCERTAINTY__MATURITYINDEX:
        return getMaturityindex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.UNCERTAINTY__VOLATILITY:
        setVolatility((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__COSTIMPACT:
        setCostimpact((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__SCHEDULEIMPACT:
        setScheduleimpact((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__FAMILIARITY:
        setFamiliarity((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__TIMECRITICALITY:
        setTimecriticality((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__RISKINDEX:
        setRiskindex((String)newValue);
        return;
      case MyDslPackage.UNCERTAINTY__MATURITYINDEX:
        setMaturityindex((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.UNCERTAINTY__VOLATILITY:
        setVolatility(VOLATILITY_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__COSTIMPACT:
        setCostimpact(COSTIMPACT_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__SCHEDULEIMPACT:
        setScheduleimpact(SCHEDULEIMPACT_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__FAMILIARITY:
        setFamiliarity(FAMILIARITY_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__TIMECRITICALITY:
        setTimecriticality(TIMECRITICALITY_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__RISKINDEX:
        setRiskindex(RISKINDEX_EDEFAULT);
        return;
      case MyDslPackage.UNCERTAINTY__MATURITYINDEX:
        setMaturityindex(MATURITYINDEX_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.UNCERTAINTY__VOLATILITY:
        return VOLATILITY_EDEFAULT == null ? volatility != null : !VOLATILITY_EDEFAULT.equals(volatility);
      case MyDslPackage.UNCERTAINTY__COSTIMPACT:
        return COSTIMPACT_EDEFAULT == null ? costimpact != null : !COSTIMPACT_EDEFAULT.equals(costimpact);
      case MyDslPackage.UNCERTAINTY__SCHEDULEIMPACT:
        return SCHEDULEIMPACT_EDEFAULT == null ? scheduleimpact != null : !SCHEDULEIMPACT_EDEFAULT.equals(scheduleimpact);
      case MyDslPackage.UNCERTAINTY__FAMILIARITY:
        return FAMILIARITY_EDEFAULT == null ? familiarity != null : !FAMILIARITY_EDEFAULT.equals(familiarity);
      case MyDslPackage.UNCERTAINTY__TIMECRITICALITY:
        return TIMECRITICALITY_EDEFAULT == null ? timecriticality != null : !TIMECRITICALITY_EDEFAULT.equals(timecriticality);
      case MyDslPackage.UNCERTAINTY__RISKINDEX:
        return RISKINDEX_EDEFAULT == null ? riskindex != null : !RISKINDEX_EDEFAULT.equals(riskindex);
      case MyDslPackage.UNCERTAINTY__MATURITYINDEX:
        return MATURITYINDEX_EDEFAULT == null ? maturityindex != null : !MATURITYINDEX_EDEFAULT.equals(maturityindex);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (volatility: ");
    result.append(volatility);
    result.append(", costimpact: ");
    result.append(costimpact);
    result.append(", scheduleimpact: ");
    result.append(scheduleimpact);
    result.append(", familiarity: ");
    result.append(familiarity);
    result.append(", timecriticality: ");
    result.append(timecriticality);
    result.append(", riskindex: ");
    result.append(riskindex);
    result.append(", maturityindex: ");
    result.append(maturityindex);
    result.append(')');
    return result.toString();
  }

} //UncertaintyImpl
