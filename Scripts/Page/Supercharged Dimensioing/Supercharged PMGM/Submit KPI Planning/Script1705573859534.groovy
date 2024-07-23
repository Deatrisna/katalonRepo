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

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/menuBAUPlan'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/navPlanning'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/btnMyPlanning'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/tabCreateOwnKPI'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/btnAddRowKPI'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputKpiSubject'), kpiSubject)

if(kpiSubjectType == 'Qualitative') {
	WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/rbQualitative'))
} else {
	WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/rbQuantitative'))
}

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputBaseline'), baseline)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputWeight'), weight)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputBelow'), below)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputMeet'), meet)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/inputExceed'), exceed)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged PMGM/Submit/btnSubmitKpi'))

WebUI.takeScreenshot()

