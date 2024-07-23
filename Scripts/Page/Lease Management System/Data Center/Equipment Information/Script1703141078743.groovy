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

WebUI.scrollToElement(findTestObject('Object Repository/Lease Management System/Data Center/btnAddNew'), 2)

WebUI.click(findTestObject('Lease Management System/Data Center/btnAddNew'))

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectEquipmentType'), equipmentType, false)

WebUI.click(findTestObject('Lease Management System/Data Center/btnChoose'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Data Center/btnUseNewRack'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Lease Management System/Data Center/inputDCFloor'), dcFloor)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputDCRoomArea'), dcRoomArea)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputRackId'), rackId)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputName'), name)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputDescription'), description)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputFunctionality'), functionality)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectVendorMaintenance'), vendorMaintenance, false)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputBrand'), brand)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputWeight'), weight)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputHeight'), height)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputWidth'), width)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputDepth'), depth)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputPower'), power)

WebUI.setText(findTestObject('Lease Management System/Data Center/inputHeat'), heat)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectPhase'), phase, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectPowerACDC'), powerAcDc, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Data Center/selectRedundant'), redundant, false)

WebUI.takeScreenshot()