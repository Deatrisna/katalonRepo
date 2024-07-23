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

WebUI.callTestCase(findTestCase('Page/Login/Login XL Center Online'), [('username') : 'xl.test2@xl.co.id', ('password') : '2yd739u67HQE'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.disableSmartWait()

WebUI.callTestCase(findTestCase('Page/XL Center Online/Reactivation/Search Reactivation'), 
	[('TicketID') : '1499', 
		('ServiceType') : 'Reactivation',
		('Status') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('XL Center Online/Reactivation/btnAction_1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/Reactivation/Reject Data/btnReject'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Reject Data/selectReason'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : 'NIK Validation Not OK']))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : 'Canceled Over 60 Days']))

WebUI.click(findTestObject('XL Center Online/Reactivation/Reject Data/selectReason'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/Reactivation/Reject Data/btnRejectContainers'))

WebUI.takeScreenshot()

WebUI.verifyElementNotClickable(findTestObject('XL Center Online/Reactivation/Reject Data/btnReject'))

WebUI.takeScreenshot()