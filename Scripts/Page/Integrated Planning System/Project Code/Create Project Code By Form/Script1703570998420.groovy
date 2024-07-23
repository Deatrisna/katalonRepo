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

WebUI.callTestCase(findTestCase('Page/Login/Login Integrated Planning System'), 
	[
		('username') : 'ADMIN', 
		('password') : '0!npFVMQ'
	], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Code/btnMenu'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Code/linkProjectCode'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Code/btnNew'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectYear'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionYear', [('year'): year]))

WebUI.setText(findTestObject('Integrated Planning System/Project Code/New Project Code/inputProjectName'), projectName)

WebUI.setText(findTestObject('Integrated Planning System/Project Code/New Project Code/inputBusinessCase'), businessCase)

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectSoftwareGR'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionSoftwareGR', [('softwareGR'): softwareGR]))

WebUI.setText(findTestObject('Integrated Planning System/Project Code/New Project Code/inputProjectCode'), projectCode)

WebUI.scrollToElement(findTestObject('Integrated Planning System/Project Code/New Project Code/selectSoftwareGR'), 1)

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectProjectCategory'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionProjectCategory', [('projectCategory'): projectCategory]))

WebUI.setText(findTestObject('Integrated Planning System/Project Code/New Project Code/inputProjectOwner'), projectOwner)

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectMaterialGR'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionMaterialGR', [('materialGR'): materialGR]))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectServiceGR'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionServiceGR', [('serviceGR'): serviceGR]))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/selectHaveLoi'))

WebUI.click(findTestObject('Integrated Planning System/Project Code/New Project Code/optionHaveLoi', [('haveLoi'): haveLoi]))

WebUI.takeScreenshot()

