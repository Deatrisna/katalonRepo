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

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/btnMenuReportSettings'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/btnMenuSquadLimitation'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadForEmployee'), 
    maxSquadForEmployee)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit1'), maxSquadLimit1)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit2'), maxSquadLimit2)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit3'), maxSquadLimit3)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit4'), maxSquadLimit4)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit5'), maxSquadLimit5)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit6'), maxSquadLimit6)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit7'), maxSquadLimit7)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit8'), maxSquadLimit8)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit9'), maxSquadLimit9)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit10'), maxSquadLimit10)

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Limitation/Detail/inpMaxSquadLimit11'), maxSquadLimit11)

