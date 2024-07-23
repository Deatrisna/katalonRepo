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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.staging.newxlife.xl.co.id/en/auth/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Supercharged Dimensioning/E-MR/btnLoginWithXLAccount'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Login/Supercharged Dimensioning/E-MR/inpUsername'), username)

WebUI.sendKeys(findTestObject('Login/Supercharged Dimensioning/E-MR/inpUsername'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Login/Supercharged Dimensioning/E-MR/inpPassword'), password)

WebUI.sendKeys(findTestObject('Login/Supercharged Dimensioning/E-MR/inpPassword'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Login/Supercharged Dimensioning/E-MR/btnYesSignIn'))

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnTripleDotMenu'))
