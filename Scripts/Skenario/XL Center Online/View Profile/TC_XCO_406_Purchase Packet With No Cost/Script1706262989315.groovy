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
import internal.GlobalVariable

import org.junit.runner.notification.Failure
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

WebUI.callTestCase(findTestCase('Page/Login/Login XL Center Online'),
	[('username') : 'xl.test2@xl.co.id',
		('password') : '2yd739u67HQE'], FailureHandling.STOP_ON_FAILURE)

WebUI.disableSmartWait()

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/Menu',
	[('menu'): 'Customer Support']))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/subMenu',
	[('subMenu'): 'View Profile']))

phoneNumber = '6287809493101'

WebUI.setText(findTestObject('XL Center Online/View Profile/inp_NIK_PhoneNumber'), phoneNumber)

WebUI.click(findTestObject('XL Center Online/View Profile/dropdownSearchOption'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem',
	[('item'): 'MSISDN']))

WebUI.click(findTestObject('XL Center Online/View Profile/btnSearch'))

WebUI.delay(3)

WebUI.click(findTestObject('XL Center Online/View Profile/03 Add Additional Offer/btnAddAdditionalOffer'))

WebUI.click(findTestObject('XL Center Online/View Profile/03 Add Additional Offer/dropdownCategory'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem',
	[('item'): 'DATA']))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/XL Center Online/View Profile/03 Add Additional Offer/dropdownOffer'))

WebUI.delay(3)

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem',
	[('item'): '8214444-Akrab_Mini_2GB_7hr-617808']))

WebUI.delay(1)

WebUI.click(findTestObject('XL Center Online/View Profile/03 Add Additional Offer/cbWithCost'))

WebUI.click(findTestObject('Object Repository/XL Center Online/View Profile/03 Add Additional Offer/btnSubmit'))
	
WebUI.verifyElementVisible(findTestObject('XL Center Online/View Profile/03 Add Additional Offer/verifySuccess'))



 
