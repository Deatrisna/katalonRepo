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

WebUI.callTestCase(findTestCase('Page/Login/BAU/Login BAU'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

// Initialize a counter variable
int loopCounter = 0

// Start the loop with a maximum of 10 iterations
while (!(WebUI.verifyElementPresent(findTestObject('Login/BAU/verifyDashboard'), 7, FailureHandling.OPTIONAL)) && loopCounter < 10) {
    // Increment the counter
    loopCounter++

    // Check if Dashboard is present
    if (WebUI.verifyElementPresent(findTestObject('Login/BAU/btnLoginAzure'), 7, FailureHandling.OPTIONAL)) {
        // Close Browser and Call Test Case Login
        WebUI.closeBrowser()

        WebUI.callTestCase(findTestCase('Page/Login/BAU/Login BAU'), [('username') : username, ('password') : password], 
            FailureHandling.STOP_ON_FAILURE)

        // Print the login trial count
        println("Login Trial: ${loopCounter}")
    }
    
    // Add a delay before rechecking
    WebUI.delay(2)
}


// Check if menu is present
if (!WebUI.verifyElementPresent(findTestObject('BAU/btnAllTicket'), 5, FailureHandling.OPTIONAL)) {
    // If not present, perform a refresh
    WebUI.refresh()
}

