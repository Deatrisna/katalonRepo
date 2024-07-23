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

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Lease Management System/ECRF/Create/inpSearchTowerID'), searchTID)

WebUI.click(findTestObject('Lease Management System/ECRF/Create/btnSearch'))

WebUI.click(findTestObject('Lease Management System/ECRF/Create/viewTowerID', [('vTowerID') : searchTID]))

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Lease Management System/ECRF/Create/selectECRFType'), type, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/ECRF/Create/selectECRFProject'), project, false)

WebUI.setText(findTestObject('Lease Management System/ECRF/Create/inpNewSiteID'), siteID)

WebUI.setText(findTestObject('Lease Management System/ECRF/Create/inpProjdef'), projDef)

WebUI.setText(findTestObject('Lease Management System/ECRF/Create/inpProjectName'), projectName)

WebUI.setText(findTestObject('Lease Management System/ECRF/Create/inpPurpose'), purpose)

WebUI.uploadFile(findTestObject('Lease Management System/ECRF/Create/uploadDRM'), DRM)

WebUI.uploadFile(findTestObject('Lease Management System/ECRF/Create/uploadSupport'), support)
	