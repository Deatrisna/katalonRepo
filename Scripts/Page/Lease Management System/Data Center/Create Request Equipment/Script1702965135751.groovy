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

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Lease Management System/Data Center/inputDataCenterName'), dataCenterName)

WebUI.click(findTestObject('Lease Management System/Data Center/selectDataCenterPartner'))

if (dataCenterPartner != '') {
    WebUI.click(findTestObject('Lease Management System/Data Center/selectLabel', [('label') : dataCenterPartner]))
} else {
    WebUI.click(findTestObject('Lease Management System/Data Center/selectLabel', [('label') : '-- Select Data Center Partner --']))
}

WebUI.click(findTestObject('Lease Management System/Data Center/btnSearch'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Data Center/iconAction'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectRequestType'), requestType, false)

WebUI.click(findTestObject('Object Repository/Lease Management System/Data Center/selectNatureOfProject'))

if (natureOfProject != '') {
    WebUI.click(findTestObject('Lease Management System/Data Center/selectLabel', [('label') : natureOfProject]))
} else {
    WebUI.click(findTestObject('Lease Management System/Data Center/selectLabel', [('label') : '-- Select Nature Of Project --']))
}

WebUI.setText(findTestObject('Lease Management System/Data Center/inputProjectName'), projectName)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputProjectPurpose'), projectPurpose)

WebUI.uploadFile(findTestObject('Lease Management System/Data Center/uploadSurveyResult'), fileSurveyResult)

WebUI.uploadFile(findTestObject('Lease Management System/Data Center/uploadDataSheetTechnical'), fileDataSheet)

WebUI.uploadFile(findTestObject('Lease Management System/Data Center/uploadLayoutRack'), fileLayoutRack)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputExecutionSched'), executionSchedule)

WebUI.takeScreenshot()

