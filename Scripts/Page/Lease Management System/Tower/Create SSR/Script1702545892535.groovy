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

WebUI.click(findTestObject('Lease Management System/Tower/btnTowerAndPico'))

WebUI.click(findTestObject('Lease Management System/Tower/btnNewTowerLease'))

WebUI.click(findTestObject('Lease Management System/Tower/btnSSR'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Lease Management System/Tower/Create SSR/btnCreateSSR'))

WebUI.delay(2)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpTowerID'), towerIdn)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpTowerName'), towerName)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpTpTowerID'), tpTowerIdn)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpTpTowerName'), tpTowerName)

if (checkerExAxisTower == 'Yes') {
    WebUI.check(findTestObject('Lease Management System/Tower/Create SSR/checkerExAxisTower'))
} else if (checkerExAxisTower == 'No') {
    WebUI.uncheck(findTestObject('Lease Management System/Tower/Create SSR/checkerExAxisTower'))
}

if (checkerTbuShareable == 'Yes') {
    WebUI.check(findTestObject('Lease Management System/Tower/Create SSR/checkerTbuShareable'))
} else if (checkerTbuShareable == 'No') {
    WebUI.uncheck(findTestObject('Lease Management System/Tower/Create SSR/checkerTbuShareable'))
}

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpProposedRnpHeight'), proposedRnpHeight)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpProposedTnpHeight'), proposedTnpHeight)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSearchRadius'), searchRadius)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpAzimuth'), azimuth)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectCategory'), category, false)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpOldTowerId'), oldTowerId)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpTowerClassification'), towerClassification)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectTowerType'), towerType, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectTowerCategory'), towerCategory, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectOwnership'), ownership, false)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLongDeg'), sSRLongDeg)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLongMin'), sSRLongMin)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLongSec'), sSRLongSec)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLaDeg'), sSRLaDeg)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLaMin'), sSRLaMin)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpSSRLaSec'), sSRLaSec)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectSSRLatitudeDir'), sSRLatitudeDir, 
    false)

WebUI.click(findTestObject('Lease Management System/Tower/Create SSR/selectTowerProvider'))

WebUI.click(findTestObject('Lease Management System/Tower/Create SSR/Tower Provider/btnReocrdPT.AVE'))

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectTowerKind'), towerKind, false)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpProjectName'), projectName)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpProjectDefinition'), projectDefinition)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectTechPartnerRNP'), techPartnerRNP, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectTechPartnerTNP'), techPartnerTNP, 
    false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectRegion'), region, false)

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectProvince'), province, false)

WebUI.click(findTestObject('Lease Management System/Tower/Create SSR/selectDistrict'))

WebUI.selectOptionByLabel(findTestObject('Lease Management System/Tower/Create SSR/selectDistrict'), district, false)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpFarEnd1'), farEnd1)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpFarEnd2'), farEnd2)

WebUI.setText(findTestObject('Lease Management System/Tower/Create SSR/inpFarEnd3'), farEnd3)

