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
import java.awt.Robot
import java.awt.event.KeyEvent

WebUI.delay(2)

Robot robot = new Robot()

for (int i = 0; i < 2; i++) { // how many times you want CRTL+'-' pressed
	robot.keyPress(KeyEvent.VK_CONTROL)
	robot.keyPress(KeyEvent.VK_SUBTRACT)
	robot.keyRelease(KeyEvent.VK_SUBTRACT)
	robot.keyRelease(KeyEvent.VK_CONTROL)
}

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/btnLeaseManagementSystem'))

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/btnTowerAndPico'))

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/btnNewTowerLease'))

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/btnUpdateTower'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/btnUpdateTowerInformation'))

WebUI.delay(2)

if (towerId != "") {
	WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/inpTowerID'), towerId)
}

if (towerName != "") {
	WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/inpTowerName'), towerName)
}

if (towerStatus != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectTowerStatus'),towerStatus) 
} 

if (region != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectRegion'), region)
}

if (province != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectProvince'), province)
}

if (towerType != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectTowerType'), towerType)
}

if (techPartnerTNP != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectTechPartnerTNP'),techPartnerTNP)
}

if (projectStatus != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectProjectStatus'),projectStatus)
}

if (towerCategory != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectTowerCategory'),towerCategory)
}

if (siteID != "") {
	WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/inpSiteID'), siteID)
}

if (techPartnerRNP != "") {
	WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/selectTechPartnerRNP'),techPartnerRNP)
}

if (projectName != "") {
	WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Search Filter/inpProjectName'), projectName)
}

