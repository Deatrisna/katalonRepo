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
	[
		('username') : 'xl.test2@xl.co.id',
		('password') : '2yd739u67HQE'
	], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('XL Center Online/btnCustomerSupport'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/btnXLCenterApproval'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('XL Center Online/Replacement/inputTicketID'), ticketId)

WebUI.click(findTestObject('XL Center Online/Replacement/btnServiceType'))

WebUI.click(findTestObject('XL Center Online/Replacement/inputServiceType', [('ServiceType') : ServiceType]))

WebUI.click(findTestObject('XL Center Online/Replacement/btnSearch'))

WebUI.takeScreenshot()

