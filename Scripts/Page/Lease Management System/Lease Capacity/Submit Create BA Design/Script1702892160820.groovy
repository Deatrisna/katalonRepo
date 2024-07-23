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

WebUI.click(findTestObject('Homepage/chooseMenu', [('menu') : menu]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu3', [('subMenu3') : subMenu3]))

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpProjectName'), projectName)

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpLinkName'), linkName)

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpPurpose'), purpose)

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpCircuitRoute'), circuitRoute)

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/btnDropdown', [('field') : 'Service Type']))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectItemDropdown', [('item') : serviceType]))

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpCapacity'), capacity)

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/btnDropdown', [('field') : 'Unit Of Mesurement Type']))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectItemDropdown', [('item') : UOM]))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/btnDropdown', [('field') : 'Connector Type NE']))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectItemDropdown', [('item') : typeNE]))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/btnDropdown', [('field') : 'Connector Type FE']))

WebUI.click(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectItemDropdown', [('item') : typeFE]))

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectObjectNE'), objectNE, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Lease Capacity/Create BA Design/selectObjectFE'), objectFE, 
    false)

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpTowerIDNE'), TIDNE)

WebUI.setText(findTestObject('Lease Management System/Lease Capacity/Create BA Design/inpTowerIDFE'), TIDFE)

WebUI.takeScreenshot()

