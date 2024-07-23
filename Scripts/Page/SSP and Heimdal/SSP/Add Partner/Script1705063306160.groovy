import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/Menu', 
	[('menu') : menu]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnAddPartner'))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpPartnerName'), partnerName)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/rbNationality', 
	[('nationality') : nationality]))

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpPartnerName'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Partner Type']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), partnerType)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : partnerType]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/btnAdd'))

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Partner Type']), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Currency']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), currency)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : currency]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpSDC'), SDC)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpSAPID'), SAPID)

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpSDC'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Time Zone']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), timeZone)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : timeZone]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpAgreementNumber'), agreementNumber)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/clickDate', 
	[('date') : 'Agreement Start']))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/dropdownMonthYear'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseYear', 
	[('year') : year_AgreementStart]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseMonth', 
	[('month') : month_AgreementStart]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseDate', 
	[('tanggal') : tanggal_AgreementStart]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/clickDate', 
	[('date') : 'Agreement Expires in']))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/dropdownMonthYear'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseYear', 
	[('year') : year_AgreementExpire]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseMonth', 
	[('month') : month_AgreementExpire]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/chooseDate', 
	[('tanggal') : tanggal_AgreementExpire]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpAgreementType'), agreementType)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpVendorDummy'), vendorDummy)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/inpVendorPayment'), vendorPayment)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/About Partnership/btnNext_CompanyInfo'))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpPhysicalAddress'), physicalAddress)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpPostalCode'), postalCode)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpCompanyEmail'), companyEmail)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpCompanyWebsite'), companyWebsite)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpOfficeTelephone'), officeTelephone)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/inpVATNumber'), VATNumber)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Company Info/btnNextContact'))

WebUI.selectOptionByIndex(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Contact/selectContact'), 1)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Contact/btnAdd'))

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Contact/btnNext'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/01 Main Info/Contact/btnNext'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Master Platform']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), masterPlatform)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : masterPlatform]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Comparison Platform']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), comparisonPlatform)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : comparisonPlatform]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/inpMaxThreshold'), maxThreshold)

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/inpMaxThreshold'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Reconciliation Rule']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), recRule)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : recRule]))

if (cbUploadData == 'Yes') {
	
    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/cbUploadData'))
}

if (cbDefaultData == 'Yes') {
	
    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/cbDefaultData'))
}

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/btnNext'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Settlement Period']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), settlementPeriod)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : settlementPeriod]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Business Model']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), businessModel)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : businessModel]))

if (businessModel == 'Revenue Share Standard') {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpUniqueShare'), uniqueShare)
	
} else if ((businessModel == 'Revenue Share Per Tier') || (businessModel == 'Revenue Share On Incremental')) {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpTransaction'), transaction)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpShare'), share)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpAboveLastSlab'), lastSlab)
	
} else if (businessModel == 'Fixed Fee Standard') {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpFeeAmount'), feeAmount)
	
} else if (businessModel == 'Fixed Fee + Revenue Share') {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpFeeAmount'), feeAmount)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpUniqueShare'), uniqueShare)
	
} else if (businessModel == 'Fixed Fee + Revenue Share + Per Tier') {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpFeeAmount'), feeAmount)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpTransaction'), transaction)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpShare'), share)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpAboveLastSlab'), lastSlab)
	
} else if (businessModel == 'Unit Cost') {
	
    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpUniqueCost'), uniqueCost)
}

if (MinGuarantee == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbMinGuarantee'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpMinGuarantee'), minGuarantee)
}

if (Ceiling == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbCeiling'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCeiling'), ceiling)
}

if (CostofSales == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbCostofSales'))

    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/btnNext'), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/rbCostOfSales', 
		[('cbCOS') : cbCostOfSales]))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpValue'), value)
}

if (TeleTaxRules == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbTeleTaxRules'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpBHP'), BHP)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpUSO'), USO)
}

if (VAT == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbVAT'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpVAT'), inpVAT)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpDigitalVAT'), digitalVAT)
}

if (BadDebt == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbBadDebt'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_BadDebt'), percentageBadDebt)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCap_BadDebt'), capBedDebt)
}

if (RefundRule == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbRefundRule'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_RefundRule'), percentageRefund)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCap_RefundRule'), capRefund)
}

if (HealtIndex == 'Yes') {
	
    WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Business Model']), 0)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbHealtIndex'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpIndex'), index)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpMarkup'), markup)

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPenalty'), penalty)
}

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/btnNext'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/btnNext'))

if (needApproval == 'Yes') {
	
    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/rbYes'))

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
		[('fieldMenu') : 'Workflow Route']))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), workFlowRoute)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
		[('item') : workFlowRoute]))
	
} else if (needApproval == 'No') {
	
    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/rbNo'))
}

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/btnNext'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/btnNext'))

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/btnSubmit'), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnSubmit'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnYesConfirm'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Partner/verifySuccess'), 'success')

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnOK'))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/inpPartnerName'), partnerName)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Partner Type']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), partnerType)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : partnerType]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField', 
	[('fieldMenu') : 'Business Model']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), businessModel)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem', 
	[('item') : businessModel]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/btnSearch'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/iconView'))

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Partner Name', 
		('verify') : partnerName]), 0)

if (nationality == 'National') {
	
	vNationality = 'national'
	
} else {
	
	vNationality = 'international'
}

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Nationality', 
		('verify') : vNationality]), 0)

//WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
//	[('field') : 'Partner Type', 
//		('verify') : partnerType]), 0)

//WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
//	[('field') : 'Currency', 
//		('verify') : currency]), 0)

//WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
//	[('field') : 'SDC', 
//		('verify') : SDC]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'SAP ID', 
		('verify') : SAPID]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Time Zone', 
		('verify') : timeZone]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Agreement Number', 
		('verify') : agreementNumber]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Agreement Type', 
		('verify') : agreementType]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Vendor Dummy', 
		('verify') : vendorDummy]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Vendor Payment', 
		('verify') : vendorPayment]), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/tabMainInfo', 
	[('tab'): 'Company Info']))

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Physical Address', 
		('verify') : physicalAddress]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Postal Code', 
		('verify') : postalCode]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Company Email', 
		('verify') : companyEmail]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Company Website', 
		('verify') : companyWebsite]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Office Telephone', 
		('verify') : officeTelephone]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'VAT Number', 
		('verify') : VATNumber]), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/tabMainInfo', 
	[('tab'): 'Contacts']))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/dropdownSection', 
	[('section'): 'Main Info']))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/dropdownSection', 
	[('section'): 'Reconcilation Rules']))

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Master Platform', 
		('verify') : masterPlatform]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Comparison Platform', 
		('verify') : comparisonPlatform]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Maximum Threshold(%)', 
		('verify') : maxThreshold]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Reconciliation Rule', 
		('verify') : recRule]), 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/dropdownSection', 
	[('section'): 'Reconcilation Rules']))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/dropdownSection', 
	[('section'): 'Business Model']))

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement', 
	[('field') : 'Settlement Period', 
		('verify') : settlementPeriod]), 0)

WebUI.verifyElementPresent(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/verifyElement2', 
	[('field') : 'Business Model', 
		('verify') : businessModel]), 0)

