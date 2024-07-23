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

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/Menu', [('menu'): menu]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/subMenu', [('subMenu'): subMenu]))

WebUI.setText(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/inpTicketID'), ticketID)

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/dropdownServiceType'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): serviceType]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/btnSearch'))

WebUI.verifyElementVisible(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/verifyTicketID', [('verifyTicketIID'): ticketID]))

WebUI.focus(findTestObject('XL Center Online/Upgrade SIM Card/btnAction'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/btnAction'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/btnUpdateData'))

WebUI.setText(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/inpNew_ICCID'), ICCID)

WebUI.focus(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/btnSave'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownICheck_ICCID'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): checkStatus_ICCID]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_NIK_KK'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): checkStatus_NIKKK]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_Name'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): checkStatus_Name]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_CardImage'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): check_CardImage]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_SelfieImage'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): check_SelfieImage]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_ICCIDImage'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): check_ICCIDImage]))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/dropdownCheck_SignatureImage'))

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/chooseItem', [('item'): check_SignatureImage]))

WebUI.setText(findTestObject('Object Repository/XL Center Online/Upgrade SIM Card/01 Update Data/inpNote'), note)

WebUI.click(findTestObject('XL Center Online/Upgrade SIM Card/01 Update Data/btnSave'))

