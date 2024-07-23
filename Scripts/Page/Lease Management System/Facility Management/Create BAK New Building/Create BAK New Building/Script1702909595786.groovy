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

WebUI.delay(1)

WebUI.click(findTestObject('Lease Management System/Facility Management/Create BAK New Building/chooseMenu'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu3', [('subMenu3') : subMenu3]))

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpSearchBuildingID'), 
    buildingID)

WebUI.click(findTestObject('Lease Management System/Facility Management/Create BAK New Building/btnSearch'))

WebUI.click(findTestObject('Lease Management System/Facility Management/Create BAK New Building/viewBuildingID', [('ID') : buildingID]))

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpEndDate'), endDate)

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpStartDate'), startDate)

WebUI.uploadFile(findTestObject('Lease Management System/Facility Management/Create BAK New Building/uploadFile'), file)

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/btnDropdown', [('field') : 'Approval L2']))

if (item == '') {
    item = '-- Select Approval L2 --'
}

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectItemDropdown', [('item') : item]))

WebUI.click(findTestObject('Lease Management System/Facility Management/Create BAK New Building/btnAddNew'))


if (conditionType == '') {
	
	conditionType = '-Select Condition Type-'
}

if (conditionPurpose == '') {
	
	conditionPurpose = '-Select Condition Purpose-'
}

if (unitPrice == '') {
	
	unitPrice = '-Select Condition Purpose-'
}

if (payFrequency == '') {
	
	payFrequency = '-Select Payment Frequency-'
}

if (periodType == '') {
	
	periodType = '-Select Period Type-'
}

if (codeWHT == '') {
	
	codeWHT = '-Select WHT Code-'
}

if (partner == '') {
	
	partner = '-Select Partner-'
}

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Condition Type-']), conditionType, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Condition Purpose-']), conditionPurpose, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Condition Purpose-']), unitPrice, false)

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpAmount'), amount)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Payment Frequency-']), payFrequency, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Period Type-']), periodType, false)

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpValidTo'), validTo)

WebUI.setText(findTestObject('Lease Management System/Facility Management/Create BAK New Building/inpValidFrom'), validFrom)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select WHT Code-']), codeWHT, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Facility Management/Create BAK New Building/selectDropdown',
	[('dropdown'): '-Select Partner-']), partner, false)

