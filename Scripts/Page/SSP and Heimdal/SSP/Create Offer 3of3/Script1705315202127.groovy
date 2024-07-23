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