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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

autoit_prj = 'C:\\Users\\User\\Katalon Studio\\XLC Online\\xl-automation-ess\\xl-automation-ess\\Test Data\\Auth Login\\auth_custom.exe'
Runtime.getRuntime().exec(autoit_prj)
Thread.sleep(1000);

WebUI.navigateToUrl('https://stagingcomet-xlcenter.xl.co.id/')

WebUI.waitForElementVisible(findTestObject('Login/XL Center Online/btnLogin'), 30)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login/XL Center Online/btnLogin'))

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Login/XL Center Online/inpUsername'), username)

WebUI.sendKeys(findTestObject('Login/XL Center Online/inpUsername'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Login/XL Center Online/inpPassword'), password)

WebUI.sendKeys(findTestObject('Login/XL Center Online/inpPassword'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Login/XL Center Online/btnYesSignIn'))

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot()

