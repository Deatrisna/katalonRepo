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

WebUI.click(findTestObject('BAU/sideMenu'))

WebUI.click(findTestObject('BAU/btnAllTicket'))

WebUI.click(findTestObject('BAU/btnConfigRequestAllTicket'))

WebUI.click(findTestObject('BAU/01 New Ticket/01 Ticket Information/btnNewTicket'))

WebUI.takeScreenshot()


//-------------------------------------------------01 Ticket Information-------------------------------------------------//
WebUI.setText(findTestObject('BAU/01 New Ticket/01 Ticket Information/inpMPENo'), MPENo)

WebUI.setText(findTestObject('BAU/01 New Ticket/01 Ticket Information/inpItemName'), ItemName)

WebUI.setText(findTestObject('BAU/01 New Ticket/01 Ticket Information/inpProgramDescription'), ProgramDescription)

WebUI.setText(findTestObject('BAU/01 New Ticket/01 Ticket Information/inpNoteTestcase'), NoteTestcase)

WebUI.click(findTestObject('BAU/01 New Ticket/01 Ticket Information/btnCalendar'))

// Set the initial value of x
int x = Timebox

// Click Arrow Right based on the value of x
def arrowRightSequence = (1..x).collect { Keys.ARROW_RIGHT }

// Send keys and end with Enter
WebUI.sendKeys(findTestObject('BAU/01 New Ticket/01 Ticket Information/btnToday'), Keys.chord(arrowRightSequence) + Keys.ENTER)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/01 New Ticket/01 Ticket Information/btnNext'))
//------------------------------------------------------------------------------------------------------------------------//


//-------------------------------------------------02 Supporting Document-------------------------------------------------//
if (uploadDRF != '') {
	WebUI.click(findTestObject('BAU/01 New Ticket/02 Supporting Document/btnUploadDRF'))
	WebUI.uploadFile(findTestObject('BAU/01 New Ticket/02 Supporting Document/fileUploadDRF'), uploadDRF)
	WebUI.click(findTestObject('BAU/btnOK'))
} else {
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/01 New Ticket/02 Supporting Document/btnNext'))
//------------------------------------------------------------------------------------------------------------------------//


//-------------------------------------------------------03 Summary-------------------------------------------------------//
WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/01 New Ticket/btnFinish'))
//------------------------------------------------------------------------------------------------------------------------//



WebUI.verifyElementPresent(findTestObject('BAU/01 New Ticket/verifySuccessfullyCreated'), 10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/btnOK'))

WebUI.verifyElementPresent(findTestObject('BAU/01 New Ticket/verifyItemName', [('ItemName'): ItemName]), 10)



