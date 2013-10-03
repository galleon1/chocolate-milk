package org.chocolate_milk.controller.jacob;

import com.jacob.com.*;

public class IAuthPreferencesE extends Dispatch {

	//public static final String componentName = "QBXMLRP2ELib.IAuthPreferencesE";
        public static final String componentName = "clsid:{45F5708E-3B43-4FA8-BE7E-A5F1849214CB}";
	public IAuthPreferencesE() {
		super(componentName);
	}

	/**
	* This constructor is used instead of a case operation to
	* turn a Dispatch object into a wider object - it must exist
	* in every wrapper class whose instances may be returned from
	* method calls wrapped in VT_DISPATCH Variants.
	*/
	public IAuthPreferencesE(Dispatch d) {
		// take over the IDispatch pointer
		m_pDispatch = d.m_pDispatch;
		// null out the input's pointer
		d.m_pDispatch = 0;
	}

	public IAuthPreferencesE(String compName) {
		super(compName);
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean wasAuthPreferencesObeyed(String lastParam) {
		return Dispatch.call(this, "WasAuthPreferencesObeyed", lastParam).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type String
	 * @return the result is of type boolean
	 */
	public boolean getIsReadOnly(String lastParam) {
		return Dispatch.call(this, "GetIsReadOnly", lastParam).getBoolean();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type boolean
	 */
	public void putIsReadOnly(boolean lastParam) {
		Dispatch.call(this, "PutIsReadOnly", new Variant(lastParam));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type String
	 * @return the result is of type int
	 */
	public int getUnattendedModePref(String lastParam) {
		return Dispatch.call(this, "GetUnattendedModePref", lastParam).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type int
	 */
	public void putUnattendedModePref(int lastParam) {
		Dispatch.call(this, "PutUnattendedModePref", new Variant(lastParam));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type String
	 * @return the result is of type int
	 */
	public int getPersonalDataPref(String lastParam) {
		return Dispatch.call(this, "GetPersonalDataPref", lastParam).getInt();
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type int
	 */
	public void putPersonalDataPref(int lastParam) {
		Dispatch.call(this, "PutPersonalDataPref", new Variant(lastParam));
	}

	/**
	 * Wrapper for calling the ActiveX-Method with input-parameter(s).
	 * @param lastParam an input-parameter of type int
	 */
	public void putAuthFlags(int lastParam) {
		Dispatch.call(this, "PutAuthFlags", new Variant(lastParam));
	}

}
