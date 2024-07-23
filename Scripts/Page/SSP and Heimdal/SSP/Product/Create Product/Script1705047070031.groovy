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

WebUI.callTestCase(findTestCase('Page/Login/SSP and Heimdal/Login SSP'), [('username') : 'xl.test6a@xl.co.id', ('password') : 'adr8P63XuGmj'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/menuProducts'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/subMenuProducts'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/btnAddProduct'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/selectPartnerName'))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputSearchPartnerName'), partnerName)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/optionPartnerName', [('partnerName') : partnerName]))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputProductName'), productName)

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputDescription'), description)

WebUI.scrollToElement(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnNextWorkFlow'), 5)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/selectProductType'))

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputSearchProductType'), productType)

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/optionProductType', [('productType') : productType]))

if (productType != '') {
    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/selectProductMainCategories'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputSearchProjectMain'), productMainCategory)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/optionProductMainCategories', [('productMainCategories') : productMainCategory]))

    if (productMainCategory != '') {
        WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/selectSubCategories'))

        WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputSearchSubCategories'), subCategory)

        WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/optionSubCategories', [('subCategories') : subCategory]))
    }
}

WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputCostCentre'), costCentre)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/btnNextWorkFlow'))

WebUI.waitForElementVisible(findTestObject('SSP and Heimdal/SSP/Create Product/textNeedWorkflowApproval'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/cbIsNeedWorkflowApproval', [('isNeedApproval') : isNeedApproval]))

if (isNeedApproval == 'Yes') {
    WebUI.waitForElementVisible(findTestObject('SSP and Heimdal/SSP/Create Product/selectGroupApproval'), 5)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/selectGroupApproval'))

    WebUI.setText(findTestObject('SSP and Heimdal/SSP/Create Product/inputSearchRole'), role)

    WebUI.click(findTestObject('SSP and Heimdal/SSP/Create Product/optionRole', [('role') : role]))
}

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnReviewAndSubmit'), 3)

WebUI.click(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnReviewAndSubmit'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnSubmit'), 5)

WebUI.click(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnSubmit'))

WebUI.waitForElementVisible(findTestObject('SSP and Heimdal/SSP/Create Product/btnConfirmYes'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnConfirmYes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/assertionSubmitSuccess'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/btnOk'))

WebUI.callTestCase(findTestCase('Page/SSP and Heimdal/SSP/Product/Search Product'), [('productName') : productName, ('productType') : productType], 
    FailureHandling.STOP_ON_FAILURE)

if (isNeedApproval == 'Yes') {
    WebUI.verifyElementText(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/dataStatus'), 'Onboarding')
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/SSP and Heimdal/SSP/Create Product/dataStatus'), 'Active')
}

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Page/SSP and Heimdal/SSP/Product/Detail Product'), 
	[
		('partnerName'): partnerName,
		('productName'): productName,
		('description'): description,
		('productType'): productType,
		('productMainCategory'): productMainCategory,
		('subCategory'): subCategory,
		('costCentre'): costCentre
	], FailureHandling.STOP_ON_FAILURE)

