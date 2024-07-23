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

//------------------------All Ticket------------------------//

WebUI.click(findTestObject('BAU/sideMenu'))

WebUI.click(findTestObject('BAU/btnAllTicket'))

WebUI.click(findTestObject('BAU/btnConfigRequestAllTicket'))

WebUI.click(findTestObject('BAU/clearSideMenu'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchBy'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/selectItemName'))

WebUI.setText(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchValue'), ItemName)

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/btnSearch'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/btnPickUp'))

WebUI.verifyElementPresent(findTestObject('BAU/02 Approve Config Request/All Ticket/verifyPickUpSuccess'), 3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/btnOK'))

//----------------------------------------------------------//


//------------------------My Ticket------------------------//

WebUI.click(findTestObject('BAU/sideMenu'))

WebUI.click(findTestObject('BAU/btnMyTicket'))

WebUI.click(findTestObject('BAU/btnConfigRequestMyTicket'))

WebUI.click(findTestObject('BAU/clearSideMenu'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchBy'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/selectItemName'))

WebUI.setText(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchValue'), ItemName)

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/btnSearch'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/04 Delegate Config Request/btnDelegate'))

WebUI.setText(findTestObject('BAU/04 Delegate Config Request/inpDelegationReason'), DelegationReason)

WebUI.click(findTestObject('BAU/04 Delegate Config Request/btnDelegateTo'))

WebUI.click(findTestObject('BAU/04 Delegate Config Request/btnDelegateTo_value', [('DelegateTo') : DelegateTo]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/04 Delegate Config Request/btnConfirmDelegation'))

WebUI.verifyElementPresent(findTestObject('BAU/04 Delegate Config Request/verifyDelegateSuccess'), 3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/btnOK'))

//----------------------------------------------------------//


//------------------------All Ticket------------------------//

WebUI.click(findTestObject('BAU/sideMenu'))

WebUI.click(findTestObject('BAU/btnConfigRequestAllTicket'))

WebUI.click(findTestObject('BAU/clearSideMenu'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchBy'))

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/selectItemName'))

WebUI.setText(findTestObject('BAU/02 Approve Config Request/All Ticket/inpSearchValue'), ItemName)

WebUI.click(findTestObject('BAU/02 Approve Config Request/All Ticket/btnSearch'))



//----------------------------------------------------------//