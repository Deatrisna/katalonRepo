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

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnEMR'))

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnMR_request'))

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnCreateSOW'))

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpProjectName'), ProjectName)

WebUI.selectOptionByLabel(findTestObject('Supercharged Dimensioing/E-MR/selectPeriod'), Period, false)

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/inpStartProject'))

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/inpStartProject_value', [('date') : StartProject] ))

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpTotalResource'), TotalResource)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpProjectPurpose'), ProjectPurpose)

WebUI.uploadFile(findTestObject('Supercharged Dimensioing/E-MR/fileUpL1Approval'), L1Approval)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnNext'))

