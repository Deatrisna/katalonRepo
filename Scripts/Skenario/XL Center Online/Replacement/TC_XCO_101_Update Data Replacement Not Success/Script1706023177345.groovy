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

WebUI.callTestCase(findTestCase('Page/XL Center Online/Replacement/Search Replacement'), [('ticketId') : '90', ('ServiceType') : 'Replacement'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('XL Center Online/Replacement/btnAction_1'))

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Page/XL Center Online/Replacement/Update Data Replacement'), [('newIccid') : '328743264738467384'
        , ('iccidCheckStatus') : 'Validation ICCID OK', ('nikCheckStatus') : 'Validation NIK and KK OK', ('nameCheckStatus') : 'Validation NAME OK'
        , ('cardImageCheckStatus') : 'Validation Image OK', ('selfieImageCheck') : 'Validation Image OK', ('iccidImageCheck') : 'Validation Image OK'
        , ('signatureImageCheck') : 'Validation Image OK', ('notes') : '' //not input notes
    ], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/btnSave'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('XL Center Online/Replacement/Update Data/assertFieldNoteMandatory'), 0)
