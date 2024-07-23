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
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import com.kms.katalon.core.webui.driver.DriverFactory

// Get the current date
LocalDate currentDate = LocalDate.now()

// Add 2 weeks to the current date
LocalDate futureDate = currentDate.plusDays(EndDate)

// Define a date format in "m/d/yyyy" format
DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy")

// Format the future date as a string using the specified format
String EndDate = futureDate.format(dateFormatter)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/btnCompensationData'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/btnCreateBAU'))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/inpTemplateName'), TemplateName)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/inpStartDate'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/inpStartDateToday'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/inpEndDate'))

// Set a maximum number of attempts to avoid infinite loop
int maxAttempts = 24
int attempts = 0

while (attempts < maxAttempts) {
    // Click on the future date
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Supercharged Dimensioing/Supercharged - Compensation/inpEndDate_value', [('EndDate'): EndDate]), 5, FailureHandling.OPTIONAL)) {
        
        // Click on Date
        WebUI.click(findTestObject('Object Repository/Supercharged Dimensioing/Supercharged - Compensation/inpEndDate_value', [('EndDate'): EndDate]))
        break
    }

    // If Date is not found, click on next month
    WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged - Compensation/btnNextMonth'))

    attempts++
    WebUI.delay(2)
}

