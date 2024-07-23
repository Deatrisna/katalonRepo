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

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/chooseMenu'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnDropdown', [('field') : 'Object Lease']))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/selectItemDropdown', [('item') : objectLease]))

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpRequestName'), reqName)

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpProjectName'), projName)

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpExeSchedule'), exeSchedule)

WebUI.uploadFile(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/uploadFile'), file)

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnDropdown', [('field') : 'Choose Reviewer']))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/selectItemDropdown', [('item') : reviewer]))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnAdd', [('section'): 'Detail Request Information']))

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpNELongitude'), NELong)

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpNELatitude'), NELa)

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpFELongitude'), FELong)

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpFELatitude'), NELa)

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnDropdown', [('field') : 'NE/FE Region']))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/selectItemDropdown', [('item') : region]))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnDropdown', [('field') : 'NE/FE Province']))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/selectItemDropdown', [('item') : province]))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/btnAdd', [('section'): 'Owner Information']))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/dropdownOwnerName'))

WebUI.click(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/selectItemDropdown', [('item') : ownerName]))

WebUI.setText(findTestObject('Lease Management System/Subduct and Land Lease/Create Subduct/inpOwnerPhone'), phoneNumber)

WebUI.takeScreenshot()

