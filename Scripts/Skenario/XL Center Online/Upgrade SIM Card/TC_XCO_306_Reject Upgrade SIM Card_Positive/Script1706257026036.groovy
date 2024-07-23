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

WebUI.callTestCase(findTestCase('Page/Login/Login XL Center Online'),
	[('username') : 'xl.test2@xl.co.id',
		('password') : '2yd739u67HQE'], FailureHandling.STOP_ON_FAILURE)

WebUI.disableSmartWait()

ticketID = '2120'
serviceType = 'Upgrade SIM Card'

WebUI.callTestCase(findTestCase('Page/XL Center Online/Upgrade SIM Card/Search Data'),
	[('menu') : 'Customer Support',
		('subMenu') : 'XL Center Approval',
		
	//Search Data
		('ticketID') : ticketID,
		('serviceType') : serviceType], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/verifyTicketID',
	[('verifyTicketIID'): ticketID]))

WebUI.focus(findTestObject('XL Center Online/Upgrade SIM Card/btnAction'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/btnAction'))

WebUI.focus(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/btnReject'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/btnReject'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/dropdown_RejectReason'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/choose_RejectReason',
	[('rejectReason'): 'NIK Validation Not OK']))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/dropdown_RejectReason'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/03 Reject Data/btnConfirmReject'))

WebUI.verifyElementVisible(findTestObject('Object Repository/XL Center Online/Upgrade SIM Card/03 Reject Data/verifyReject'))

WebUI.takeScreenshot()