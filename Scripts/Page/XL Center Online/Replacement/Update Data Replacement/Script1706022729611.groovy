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

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/btnUpdateData'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('XL Center Online/Replacement/Update Data/inputNewICCID'), newIccid)

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectICCIDCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : iccidCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectNIKKKCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : nikCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectNameCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : nameCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectCardImageCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : cardImageCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectSelfieImageCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : selfieImageCheck]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectICCIDImageCheck'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : iccidImageCheck]))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/selectSignatureImageCheck'))

WebUI.click(findTestObject('XL Center Online/Replacement/Update Data/optionLabel', [('label') : signatureImageCheck]))

WebUI.sendKeys(findTestObject('XL Center Online/Replacement/Update Data/inputNote'), Keys.chord(Keys.CONTROL, 'A', Keys.BACK_SPACE))

WebUI.setText(findTestObject('XL Center Online/Replacement/Update Data/inputNote'), notes)

WebUI.takeScreenshot()

