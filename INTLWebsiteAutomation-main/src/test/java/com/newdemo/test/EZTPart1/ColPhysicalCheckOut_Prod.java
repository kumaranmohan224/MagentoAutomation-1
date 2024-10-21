package com.newdemo.test.EZTPart1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.newdemo.framework.base.ScriptBase;

import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Utils;

public class ColPhysicalCheckOut_Prod extends ScriptBase {
	@Parameters({ "ParameterNValue", "env" })
	@Test(description = "Launching LATAM URL", priority = 1, enabled = true)
	public void IntructorArea(String ParameterNValue, String env) throws Exception {
		try {
			ATUReports.indexPageDescription = "Connect application automation - Create Assignments and Instructor Area scenarios";
			ATUReports.setAuthorInfo("Kumaran M", Utils.getCurrentTime(), "2.2");
			String strDescription = "Launch the Colombia URL in browser for ColPhysicalCheckOut_Prod";
			ATUReports.currentRunDescription = strDescription;
			objHTMLFunctions.ReportPassFail(strDescription, "ModuleName", "ModuleName");
			strDTParametersNValues = ParameterNValue;

			final int defaultDataRow = Integer.parseInt(strDTParametersNValues.split("=>")[1]);

			loginLATAMURL();
		} catch (Exception e) {
			objHTMLFunctions.reportPassFailToATU(e.getMessage(), "Exception", "MESSAGE");
		}

	}

	public void loginLATAMURL() throws Exception {

		connect().INTLLoginPage().launchINTLURL();

		connect().INTLLoginPage().clickAcceptAllButton();
		connect().INTLLoginPage().clickSearchTextBox();
		connect().INTLLoginPage().typeTheTextInSearchBox();
		connect().INTLLoginPage().clickSearchButton();
		connect().INTLLoginPage().clickAcceptAllButton();

		connect().INTLLoginPage().clickCookieCloseButton();
		connect().INTLLoginPage().clickActionPrimaryToCart();
		connect().INTLLoginPage().clickActionPrintPrimaryToCartCol_Prod();

		connect().INTLLoginPage().clickActionShowCartButton();

		connect().INTLLoginPage().clickProceedToCheckoutButton();
		connect().INTLLoginPage().clickAcceptAllButton();
		connect().INTLLoginPage().clickGuestCheckOutButton();
		connect().INTLLoginPage().clickAcceptAllButton();
		connect().INTLLoginPage().clickEmailAddressTextBox();
		connect().INTLLoginPage().typeEmailAddress();
		connect().INTLLoginPage().clickConfirmEmailAddressTextBox();
		connect().INTLLoginPage().typeConfirmEmailAddress();
		connect().INTLLoginPage().clickShippingAddressFirstNameTextBox();
		connect().INTLLoginPage().typeShippingAddressFirstName();
		connect().INTLLoginPage().clickShippingAddressSurNameTextBox();
		connect().INTLLoginPage().typeShippingAddressSurName();
		connect().INTLLoginPage().clickShippingAddressStreetTextBox();
		connect().INTLLoginPage().typeShippingAddressStreet();
		connect().INTLLoginPage().clickShippingAddressCityTextBox();
		connect().INTLLoginPage().typeShippingAddressCity();
		connect().INTLLoginPage().clickShippingAddressRegionIdDropDown();
		connect().INTLLoginPage().selectShippingAddressRegionIdValueCol();
		connect().INTLLoginPage().clickShippingAddressPostCodeTextBox();
		connect().INTLLoginPage().typeShippingAddressPostCode();

		connect().INTLLoginPage().clickShippingAddressTelephoneTextBox();
		connect().INTLLoginPage().typeShippingAddressTelephone();
		connect().INTLLoginPage().clickReviewAndPaymentsButton();

		if ((connect().INTLLoginPage().clickTaxFormCheckBox()) == 1) {
			connect().INTLLoginPage().clickTaxIDTextBox();
			connect().INTLLoginPage().typeTaxID();
			connect().INTLLoginPage().clickTaxNameTextBox();
			connect().INTLLoginPage().typeTaxName();
			connect().INTLLoginPage().clickInvoicePostalCodeTextBox();
			connect().INTLLoginPage().typeInvoicePostalCode();
			connect().INTLLoginPage().clickInvoiceRegimeDropDown();
			connect().INTLLoginPage().selectInvoiceRegimeValue();
			connect().INTLLoginPage().clickInvoiceUseOfCfdiDropDown();
			connect().INTLLoginPage().selectInvoiceUseOfCfdiValue();
		}
		Thread.sleep(10000);
	
		connect().INTLLoginPage().clickNumeroDeIdentificationTextBox();
		connect().INTLLoginPage().typeNumeroDeIdentificationValue();
		connect().INTLLoginPage().selectTipoDePersonaDropDown();
		connect().INTLLoginPage().selectTipoDePersonaDropDownValue();
		connect().INTLLoginPage().selectTipoDeIdentificationDropDown();
		connect().INTLLoginPage().selectTipoDeIdentificationValue();
		connect().INTLLoginPage().selectRegimenDropDown();
		connect().INTLLoginPage().selectRegimenValue();
		connect().INTLLoginPage().clickPrimaryCheckoutButton();
		connect().INTLLoginPage().clickVisaPaymentMethodButton();
		connect().INTLLoginPage().clickCCFullNameTextBox();
		connect().INTLLoginPage().typeCCFullName();
		connect().INTLLoginPage().clickCCDniNumberTextBox();
		connect().INTLLoginPage().typeCCDniNumber();
		connect().INTLLoginPage().clickCCNumberTextBox();
		connect().INTLLoginPage().typeCCNumber();
		connect().INTLLoginPage().clickExpirationDateMonthDropDown();
		connect().INTLLoginPage().selectExpirationDateMonthValue();
		connect().INTLLoginPage().clickExpirationYearDropDown();
		connect().INTLLoginPage().selectExpirationYearValue();
		connect().INTLLoginPage().clickSecurityCodeTextBoxCol();
		connect().INTLLoginPage().typeSecurityCodeCol();
		connect().INTLLoginPage().clickContactPhoneTextBox();
		connect().INTLLoginPage().typeContactPhone();
		connect().INTLLoginPage().clickDeviceRegisterCheckBox();
		connect().INTLLoginPage().clickTandcCheckBox();
		connect().INTLLoginPage().clickPayButton();
		connect().INTLLoginPage().clickResponseButtonContinue();
		connect().INTLLoginPage().clickAcceptAllButton();
		connect().INTLLoginPage().clickContinueButton();
		connect().INTLLoginPage().clickAcceptAllButton();
		connect().INTLLoginPage().clickLogoutButton();

	}
}