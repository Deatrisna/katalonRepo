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

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/menuOffer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/submenuOffer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnAddOffer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnPartnerName'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : PartnerName]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnProductName'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : ProductName]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpOfferName'), OfferName)

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/inpOfferName'), 2)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnOfferType'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : OfferType]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnPricePoint'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : PricePoint]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnChargingMethod'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : ChargingMethod]))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnMainSDC'))

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/dropdown_value', [('value') : MainSDC]), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpSID'), SID, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpServiceKey'), ServiceKey, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpCDMID'), CDMID, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpChargeCode'), ChargeCode, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpTarifExVAT'), TarifExVAT)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpTarifVAT'), TarifVAT)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnNext_1'))



//
WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
	[('fieldMenu') : 'Settlement Period']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), settlementPeriod)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem',
	[('item') : settlementPeriod]))

//WebUI.scrollToElement(findTestObject, 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
	[('fieldMenu') : ' Business Model']))

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

//WebUI.scrollToElement(findTestObject, 0)

if (MinGuarantee == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbMinGuarantee'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpMinGuarantee'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpMinGuarantee'), minGuarantee)
}

if (Ceiling == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbCeiling'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCeiling'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCeiling'), ceiling)
}

if (CostofSales == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbCostofSales'))
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/rbCostOfSales',
		[('cbCOS') : cbCostOfSales]))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpValue'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpValue'), value)
}

if (TeleTaxRules == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbTeleTaxRules'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpBHP'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpBHP'), BHP)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpUSO'), USO)
}

if (VAT == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbVAT'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpVAT'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpVAT'), inpVAT)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpDigitalVAT'), digitalVAT)
}

if (BadDebt == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbBadDebt'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_BadDebt'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_BadDebt'), percentageBadDebt)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCap_BadDebt'), capBedDebt)
}

if (RefundRule == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbRefundRule'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_RefundRule'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPercentage_RefundRule'), percentageRefund)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpCap_RefundRule'), capRefund)
}

if (HealtIndex == 'Yes') {
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/scrollBusinessModel'), 3)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/cbHealtIndex'))
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpIndex'), 3)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpIndex'), index)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpMarkup'), markup)
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/03 Business Model/inpPenalty'), penalty)
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnNext_1'))


//
WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
	[('fieldMenu') : 'Master Platform']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), masterPlatform)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem',
	[('item') : masterPlatform]))

//WebUI.scrollToElement(findTestObject, 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
	[('fieldMenu') : 'Comparison Platform']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), comparisonPlatform)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem',
	[('item') : comparisonPlatform]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/inpMaxThreshold'), maxThreshold)

//WebUI.scrollToElement(findTestObject, 0)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
	[('fieldMenu') : 'Reconciliation Rule']))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), recRule)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem',
	[('item') : recRule]))

//if (cbUploadData == 'Yes') {
//	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/cbUploadData'))
//}
//
//if (cbDefaultData == 'Yes') {
//	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/02 Reconcilation Rules/cbDefaultData'))
//}

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnNext_1'))



//WorkFlow
if (needApproval == 'Yes') {
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/rbYes'))
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/dropdownField',
		[('fieldMenu') : ' Workflow Route']))
	
	WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Partner/inpSearchItem'), workFlowRoute)
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/selectItem',
		[('item') : workFlowRoute]))
	
	WebUI.takeScreenshot()
	
	WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/btnNext_2'), 3)
	
} else if (needApproval == 'No') {
	
	WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/04 Workflow/rbNo'))
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnNext_2'))


//Review & Submit

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('SSP and Heimdal/SSP/Create Offer/btnSubmit'), 3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnSubmit'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnYesConfirm'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Partner/verifySuccess'), 'success')

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/btnOK'))


//verify Offer Detail
WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Offer/inpOfferName'), OfferName)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Partner/05 Verify/btnSearch'))

WebUI.click(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Offer/btnView'))

def actualPartnerName = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 2]), 'value')
WebUI.verifyMatch(actualPartnerName, PartnerName, false)

def actualProductName = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 3]), 'value')
WebUI.verifyMatch(actualProductName, ProductName, false)

def actualOfferName = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 4]), 'value')
WebUI.verifyMatch(actualOfferName, OfferName, false)

def actualOfferType = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 5]), 'value')
WebUI.verifyMatch(actualOfferType, OfferType, false)

def actualPricePoint = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 6]), 'value')
WebUI.verifyMatch(actualPricePoint, PricePoint, false)

def actualChargingMethod = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 7]), 'value')
WebUI.verifyMatch(actualChargingMethod, ChargingMethod, false)

def actualMainSDC = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 8]), 'value')
WebUI.verifyMatch(actualMainSDC, MainSDC, false)

def actualSID = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 9]), 'value')
WebUI.verifyMatch(actualSID, MainSDC+SID, false)

def actualServiceKey = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 10]), 'value')
WebUI.verifyMatch(actualServiceKey, ServiceKey, false)

def actualCDMID = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 11]), 'value')
WebUI.verifyMatch(actualCDMID, CDMID, false)

def actualChargeCode = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 12]), 'value')
WebUI.verifyMatch(actualChargeCode, ChargeCode, false)

def actualTarifExVAT = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 13]), 'value')
WebUI.verifyMatch(actualTarifExVAT, TarifExVAT, false)

def actualTarifVAT = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyElement', ['index' : 14]), 'value')
WebUI.verifyMatch(actualTarifVAT, TarifVAT, false)


//verify Business Model
WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnBusinessModel'))

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Offer/spanText', ['text' : settlementPeriod]), settlementPeriod)

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Offer/spanText', ['text' : businessModel]), businessModel)



//verify Reconciliation
WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Offer/btnReconciliation'))

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Offer/spanText', ['text' : masterPlatform]), masterPlatform)

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Offer/spanText', ['text' : comparisonPlatform]), comparisonPlatform)

def actualmaxThreshold = WebUI.getAttribute(findTestObject('SSP and Heimdal/SSP/Create Offer/verifyMaxTresh'), 'value')
WebUI.verifyMatch(actualmaxThreshold, maxThreshold, false)

WebUI.verifyElementText(findTestObject('SSP and Heimdal/SSP/Create Offer/spanText', ['text' : recRule]), recRule)
