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

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/btnMenuDimensioningRequest'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/btnCreateSquad'))

WebUI.delay(2)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnKlickEverywhere'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnSquadName'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectSquadName', 
        [('squadName') : squadName]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnSquadLeader'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectSquadLeader', 
        [('squadLeader') : squadLeader]))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpSquadCodeName'), 
    squadCodeName)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnSquadArchetypes'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectSquadArchetypes', 
        [('squadArchetypes') : squadArchetypes]))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpSquadTSize'), 
    squadTSize)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnClan'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectClan', 
        [('clan') : clan]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnClanLeader'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectClanLeader', 
        [('clanLeader') : clanLeader]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnTribe'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectTribe', 
        [('tribe') : tribe]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnTribeLeader'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectTribeLeader', 
        [('tribeLeader') : tribeLeader]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnStreamName'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectStreamName', 
        [('streamName') : streamName]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnStreamLeader'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectStreamLeader', 
        [('streamLeader') : streamLeader]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnAdvisor'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectAdvisor', 
        [('advisor') : advisor]))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnAddAdvisor'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpStartDate'))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpStartDate'), 
    startDate)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpEndDate'))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpEndDate'), 
    endDate)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnScrumMaster'))

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/selectScrumMaster', 
        [('scrumMaster') : scrumMaster]))

WebUI.uploadFile(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/uploadFileProjectCharter'), 
    projectCharter)

WebUI.click(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/btnAddOkr'))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpTargetItem'), 
    targetItem)

WebUI.sendKeys(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpPercentage'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Supercharged Dimensioing/Supercharged Dimensioning/Squad Dimensioning/Submit Detail/inpPercentage'), 
    percentage)
