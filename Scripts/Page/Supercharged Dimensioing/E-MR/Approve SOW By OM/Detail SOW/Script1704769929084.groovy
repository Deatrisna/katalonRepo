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
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/linkSeeDetailSOW'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/btnFillPositionAndVendor'))

WebUI.takeScreenshot()

WebDriver driver = DriverFactory.getWebDriver()

def posCount = driver.findElements(By.xpath('//div[@formarrayname=\'positions\']')).size()

for (int i = 1; i <= posCount; i++) {
    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputJobTitle', [('indexJobTitle') : i]), 
        jobTitle)

    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputGrade', [('indexGrade') : i]), grade)

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionGrade', [('grade') : grade]))

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/selectTypeOfMR', [('indexTypeOfMR') : i]))

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionTypeOfMR', [('typeOfMR') : typeOfMR]))

    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputScheme', [('indexScheme') : i]), 
        scheme)

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionScheme', [('scheme') : scheme]))

    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputCostCentre', [('indexCostCentre') : i]), 
        costCentre)

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionCostCentre', [('costCentre') : costCentre]))

    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputPooledCC', [('indexPooledCC') : i]), 
        pooledCC)

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionPooledCC', [('pooledCC') : pooledCC]))

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/selectStatus', [('indexStatus') : i]))

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionStatus', [('status') : status]))

    WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputProvince', [('indexProvince') : i]), 
        province)

    WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionProvince', [('province') : province]))

    if (province != '') {
		WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputCity', [('indexCity') : i]))
		
        WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputCity', [('indexCity') : i]), 
            city)
		
		WebUI.waitForElementVisible(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionCity', [('city') : city]), 3)

        WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionCity', [('city') : city]))

        if (city != '') {
			WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputLocation', [('indexLocation') : i]))
			
            WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputLocation', [('indexLocation') : i]), 
                location)
			
			WebUI.waitForElementVisible(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionLocation', [('location') : location]), 3)

            WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionLocation', [('location') : location]))

            if (location != '') {
				WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputXLC', [('indexXLC') : i]))
				
                WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/inputXLC', [('indexXLC') : i]), 
                    xlcName)
				
				WebUI.waitForElementVisible(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionXLC', [('xlc') : xlcName]), 3)

                WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionXLC', [('xlc') : xlcName]))
            }
        }
    }
    
    if (i != posCount) {
        WebUI.click(findTestObject('Object Repository/Supercharged Dimensioing/E-MR/Approve SOW By OM/tabPosition', [('indexPosition') : i + 
                    1]))
    }
	
}

WebUI.setText(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/selectVendor'), vendorName)

WebUI.click(findTestObject('Supercharged Dimensioing/E-MR/Approve SOW By OM/optionVendor', [('vendorName'): vendorName]))

WebUI.takeScreenshot()

