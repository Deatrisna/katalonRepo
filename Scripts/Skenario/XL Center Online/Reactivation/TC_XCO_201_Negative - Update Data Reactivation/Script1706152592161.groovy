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

WebUI.callTestCase(findTestCase('Page/XL Center Online/Reactivation/Search Reactivation'), [('TicketID') : '2103', ('ServiceType') : 'Reactivation'
        , ('Status') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page/XL Center Online/Reactivation/Update Reactivation'), [('ICCIDCheckStatus') : 'Validation ICCID OK'
        , ('NIKKKCheckStatus') : 'Validation NIK and KK OK', ('NameCheckStatus') : 'Validation NAME OK', ('CardImageCheck') : 'Validation Image OK'
        , ('SelfieImageCheck') : 'Validation Image OK', ('ICCIDImageCheck') : 'Validation Image OK', ('SignatureImageCheck') : 'Validation Image OK'
        , ('Note') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.verifyElementNotPresent(findTestObject('XL Center Online/Reactivation/Update Data/btnUpdateData'), 5)
