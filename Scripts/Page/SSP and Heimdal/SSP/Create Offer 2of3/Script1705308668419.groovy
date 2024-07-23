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