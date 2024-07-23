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

WebUI.click(findTestObject('Integrated Planning System/BOQ/linkBOQ'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/BOQ/btnNew'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/btnNewByForm'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectExecType'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionExecType', [('execType') : execType]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectProjectCode'))

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectProjectCode'), projectCode)

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionProjectCode', [('projectCode') : projectCode]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectTowerId'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionTowerId', [('towerId') : towerId]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectSapId'))

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectSapId'), sapId)

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionSapId', [('sapId') : sapId]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectBOQPart'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionBoqPart', [('boqPart') : boqPart]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectBOQType'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionBOQType', [('boqType') : boqType]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectVendorCode'))

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectVendorCode'), vendorCode)

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionVendorCode', [('vendorCode') : vendorCode]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectBOQStatus'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionBOQStatus', [('boqStatus') : boqStatus]))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectSource'))

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionSource', [('source') : source]))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Integrated Planning System/BOQ/Form/selectBOQType'), 1)

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/inputQuantity'), quantity)

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/inputGPBUnitPrice'), gpbUnitPrice)

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/inputNetUnitPrice'), netUnitPrice)

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectCurrency'))

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectCurrency'), currency)

WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionCurrency', [('currency') : currency]))

if(catalogItemName != '') {
	WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectCatalogItemName'))
	
	WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectCatalogItemName'), catalogItemName)
	
	WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionCatalogItemName', [('catalogItemName') : catalogItemName]))
}

if(wbs != '') {
	WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/selectWbs'))
	
	WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/selectWbs'), wbs)
	
	WebUI.click(findTestObject('Integrated Planning System/BOQ/Form/optionWBS', [('wbs') : wbs]))
}

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/inputCoupaReqTitle'), coupaReqTitle)

WebUI.setText(findTestObject('Integrated Planning System/BOQ/Form/inputContractName'), contractName)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Integrated Planning System/BOQ/Form/titleBOQ'), 1)

WebUI.click(findTestObject('Object Repository/Integrated Planning System/BOQ/Form/expRecordDetail'))

