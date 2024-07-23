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

WebUI.click(findTestObject('XL Center Online/Reactivation/btnAction_1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/btnUpdateData'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectICCIDCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : ICCIDCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectNIKKKCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : NIKKKCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectNameCheckStatus'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : NameCheckStatus]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectCardImageCheck'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : CardImageCheck]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectSelfieImageCheck'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : SelfieImageCheck]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectICCIDImageCheck'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : ICCIDImageCheck]))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/selectSignatureImageCheck'))

WebUI.click(findTestObject('XL Center Online/Reactivation/Update Data/inpValue', [('click') : SignatureImageCheck]))

WebUI.sendKeys(findTestObject('XL Center Online/Reactivation/Update Data/inpNotes'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('XL Center Online/Reactivation/Update Data/inpNotes'), Note)

WebUI.takeScreenshot()

WebUI.click(findTestObject('XL Center Online/Reactivation/btnSearch'))



