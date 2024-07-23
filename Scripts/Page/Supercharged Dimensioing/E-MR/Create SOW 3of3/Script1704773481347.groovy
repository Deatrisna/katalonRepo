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

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpJobPurpose'), JobPurpose)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpJobRole'), JobRole)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpRelationship'), Relationship)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpFinancialImpact'), FinancialImpact)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpNonFinancialImpact'), NonFinancialImpact)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpOther_1'), Other_1)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpEducation'), Education)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpExperience'), Experience)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpSkill'), Skill)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpOther_2'), Other_2)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpSLA'), SLA)

WebUI.selectOptionByLabel(findTestObject('Supercharged Dimensioing/E-MR/selectKPI'), KPI, false)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpKPIBaseline'), KPIBaseline)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpKPIWeight'), KPIWeight)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpKPIBelow'), KPIBelow)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpKPIMeet'), KPIMeet)

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/inpKPIExceed'), KPIExceed)

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/selectIDCard'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/btnSubmit'))

