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

WebUI.callTestCase(findTestCase('Page/Login/Login Integrated Planning System'), [('username') : 'ADMIN', ('password') : '0!npFVMQ'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Integrated Planning System/btnMenu'))

WebUI.click(findTestObject('Integrated Planning System/GR Checker/btnGrChecker'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/GR Checker/Confirm Menu/btnUploadConfirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Integrated Planning System/GR Checker/Confirm Menu/btnDownloadTemplate'))

WebUI.uploadFile(findTestObject('Integrated Planning System/GR Checker/Confirm Menu/inpUploadFileConfirm'), uploadFileConfirm)

WebUI.click(findTestObject('Integrated Planning System/GR Checker/Confirm Menu/btnPreviewFile'))

WebUI.delay(3)

WebUI.click(findTestObject('Integrated Planning System/GR Checker/Confirm Menu/btnClosePreview'))

