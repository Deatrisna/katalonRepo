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

WebUI.click(findTestObject('Homepage/chooseMenu', [('menu') : menu]))

WebUI.click(findTestObject('Homepage/chooseSubMenu1', [('subMenu1') : subMenu1]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Homepage/chooseSubMenu2', [('subMenu2') : subMenu2]))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/inputClusterName'), clusterName)

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectRegion'))

if (region != '') {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : region]))
} else {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : '-- Select Region --']))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectProvince'))

if (province != '') {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : province]))
} else {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : '-- Select Province --']))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectCity'))

if (city != '') {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : city]))
} else {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : '-- Select City --']))
}

WebUI.setText(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/inputHPPlan'), hpPlan)

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectClusterCategory'))

if (clusterCategory != '') {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : clusterCategory]))
} else {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : '-- Select Cluster Category --']))
}

WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectClusterPriority'))

if (clusterPriority != '') {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : clusterPriority]))
} else {
    WebUI.click(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/selectLabel', [('label') : '-- Select Cluster Priority --']))
}

WebUI.setText(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/inputLatitude'), latitude)

WebUI.setText(findTestObject('Lease Management System/FTTH Homepass/Create Funnel or Cluster/inputLongitude'), longtitude)

WebUI.takeScreenshot()

