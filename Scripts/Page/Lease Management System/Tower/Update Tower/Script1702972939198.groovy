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

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/btnLinkRecordTower1'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTowerName'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTowerName'), towerName)

WebUI.sendKeys(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTowerID'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTowerID'), tpTowerId)

WebUI.sendKeys(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTpTowerNam'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/inpTpTowerName'), tpTowerName)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectTowerCategory'), 
    towerCategory, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectTowerType'), towerType, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectProvince'), province, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectRegion'), region, 
    false)

WebUI.click(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectDistrict'))

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Update Tower/Detail Update/selectDistrict'), district, 
    false)

