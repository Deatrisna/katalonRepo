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

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnFastTrackAllTicket'))

WebUI.click(findTestObject('BAU/clearSideMenu'))

//Create New Ticket
WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnNewTicket'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnSubProduct'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnSubProduct_value', [('SubProduct') : SubProduct]))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnRequestType'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnRequestType_value', [('RequestType') : RequestType]))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnRequestDetail'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnRequestDetail_value', [('RequestDetail') : RequestDetail]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/btnSelectFromTheList'))

//Select Variant
WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/btnSearchBy'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/btnSearchBy_value', [('SearchBy') : SearchBy]))

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/inpSearchValue'), SearchValue)

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/btnSearch'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/checklistRow', [('SearchValue') : SearchValue]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/01 Select Variant Box/btnNext'))

//Create Product Concept
WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpMPENo'), MPENo)

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpProjectName'), ProjectName)

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpBussinessObjective'), BussinessObjective)

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpProgramDescription'), ProgramDescription)

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpTimeBox'), TimeBox)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_1.1'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_2'))

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/inpNumberofBenefits'), NumberofBenefits)

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_3'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_4'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnNext_5'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/btnFinish'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('BAU/05 Create Ticket Fast Track/02 Product Concept/verifySuccessfullyCreated'), 
    5)

WebUI.click(findTestObject('BAU/btnOK'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/03 All Ticket -- Fast Track/btnSearchBy'))

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/03 All Ticket -- Fast Track/btnSearchBy_value', [('SearchBy') : SearchBy]))

WebUI.setText(findTestObject('BAU/05 Create Ticket Fast Track/03 All Ticket -- Fast Track/inpSearchValue'), SearchValue)

WebUI.click(findTestObject('BAU/05 Create Ticket Fast Track/03 All Ticket -- Fast Track/btnSearch'))

WebUI.takeScreenshot()

