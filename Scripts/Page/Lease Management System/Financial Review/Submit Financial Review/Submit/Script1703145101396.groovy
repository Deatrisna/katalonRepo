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

WebUI.click(findTestObject('Homepage/chooseMenu', [('menu') : menu]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnCreateNew'))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/dropdownNewFR', 
	[('field') : 'FR Project']))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : FRProject]))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/dropdownNewFR', 
	[('field') : 'FR Type']))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : FRType]))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnBulkSubmit'))

WebUI.setText(findTestObject('Lease Management System/Financial Review/Create Financial Review/inpFRName'), FRName)

if (FRProject == 'Lease Network Facility') {
	
	WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnDropdown',
		[('field') : 'LNF Type']))
	
} else {
	
	WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnDropdown',
		[('field') : 'Tower Type']))
}

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : TowerType]))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnDropdown', 
	[('field') : 'Vendor Name']))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : vendorName]))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnDropdown', 
	[('field') : 'Currency']))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : currency]))

if (FRProject == 'Macro') {
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Supporting Document ']),
		supDoc_Macro)
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Upload Template to search']),
		docMacro)
	
} else if (FRProject == 'Lease Network Facility') {
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Supporting Document ']),
		supDoc_LNF)
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Upload Template to search']),
		docLNF)
	
} else if (FRProject == 'Pico') {
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Supporting Document ']),
		supDoc_Pico)
	
	WebUI.uploadFile(findTestObject('Lease Management System/Financial Review/Create Financial Review/uploadFile', [('upload') : 'Upload Template to search']),
		docPico)
}

WebUI.delay(3)

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnOK'))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/btnDropdown', 
	[('field') : 'Approval Rute']))

WebUI.click(findTestObject('Lease Management System/Financial Review/Create Financial Review/01 Macro/selectItemDropdown', 
        [('item') : approvalRute]))

