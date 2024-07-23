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

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project SOW/btnMenu'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project SOW/btnProjectSOW'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project SOW/btnAction'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/btnNew'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectExeType'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : exeType]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpProjectCode'), projectCode)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : projectCode]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpTowerID'), towerID)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : towerID]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpRingID_CSR'), ringID_CSR)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : ringID_CSR]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectENGPart'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : ENGPart]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectTypeWork'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : typeWork]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectDetailWork'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : detailWork]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpNEID'), NEID)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectNEType'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : NEType]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectNELevel'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : NELevel]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectVendor'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : Vendor]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpDetailScope'), detailScope)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectDismantleActivities'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : DisActivities]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpDismantle_Equipment'), DisEquipment)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectTrackedPMIS'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : trackedPMIS]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectSOWStatus'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : SOWStatus]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpCapacityAfter'), capacityAfter)

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpCapabilityAfter'), capabilityAfter)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectListedAs'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : listedAs]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpConfiguration'), configuration)

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpPDT'), PDT)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectSpanID_Left'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : SpanID_Left]))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/selectSpanID_Right'))

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/chooseItem', [('item') : SpanID_Right]))

WebUI.setText(findTestObject('Integrated Planning System/Project SOW/01 Form/inpIPAddress'), address)

WebUI.click(findTestObject('Integrated Planning System/Project SOW/01 Form/btnSubmit'))

WebUI.delay(1)

WebUI.takeScreenshot()

