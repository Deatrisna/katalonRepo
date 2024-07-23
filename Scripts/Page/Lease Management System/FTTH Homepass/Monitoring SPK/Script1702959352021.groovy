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

WebUI.setText(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/inputSPKDesignId'), spkDesignId)

if(WebUI.verifyElementVisible(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/modalTimeOut'), FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/modalTimeOut'))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectCity'))

if(city != '') {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): city]))
} else {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): '-- Select City --']))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectFTTHPartner'))

if(ftthPartner != '') {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): ftthPartner]))
} else {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): '-- Select FTTH Partner --']))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectSPKStatus'))

if(spkStatus != '') {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): spkStatus]))
} else {
	WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Monitoring SPK/selectLabel', [('label'): '-- Select SPK Status --']))
}

WebUI.takeScreenshot()

