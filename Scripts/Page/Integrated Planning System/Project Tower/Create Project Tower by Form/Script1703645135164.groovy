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

WebUI.callTestCase(findTestCase('Page/Login/Login Integrated Planning System'), [('username') : 'ADMIN', ('password') : '0!npFVMQ'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Code/btnMenu'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Tower/linkProjectTower'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Tower/btnActions'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/Project Tower/btnNew'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/btnViaForm'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputProjectCode'), projectCode)

WebUI.delay(2)

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionProjectCode', [('projectCode') : projectCode]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectExecType'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionExecType', [('execType') : execType]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/rbLocation', [('location') : location]))

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputTowerId'), towerId)

WebUI.delay(2)

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionTowerId', [('towerId') : towerId]))

if(location == 'Link') {
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/rbLocationFE', [('locationFE') : locationFE]))
	
	WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputTowerIdFE'), towerIdFE)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionTowerId', [('towerIdFE') : towerIdFE]))
}

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectFLMapping'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionFLMapping', [('flMapping'): flMapping]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectCategory'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionCategory', [('category'): category]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectCategoryFE'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionCategoryFE', [('categoryFE'): categoryFE]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectListStatus'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionListStatus', [('status'): status]))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectType'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionType', [('type'): type]))

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputVendorCode'), vendorCode)

WebUI.delay(2)

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionVendorCode', [('vendorCode'): vendorCode]))

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputRemarks'), remarks)

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/selectOpenStatus'))

WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionOpenStatus', [('openStatus'): openStatus]))

if(ringIdFiberLease != '') {
	WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputRingIdFiberLease'), ringIdFiberLease)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionRingIdFiberLease', [('ringIdFiberLease'): ringIdFiberLease]))
	
}

if(ringIdCsr != '') {
	WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputRingIdCsr'), ringIdCsr)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionIdRingCsr', [('ringIdCsr'): ringIdCsr]))
}

if(routerType != '') {
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/inputRouterType'))
	
	WebUI.click(findTestObject('Integrated Planning System/Project Tower/Form/optionRouterType', [('routerType'): routerType]))
}

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam1'), param1)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam2'), param2)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam3'), param3)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam4'), param4)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam5'), param5)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam6'), param6)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam7'), param7)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam8'), param8)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam9'), param9)

WebUI.setText(findTestObject('Integrated Planning System/Project Tower/Form/inputParam10'), param10)

WebUI.takeScreenshot()

