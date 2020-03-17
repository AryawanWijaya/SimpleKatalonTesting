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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ntu.edu.sg/Pages/home.aspx')

WebUI.click(findTestObject('Object Repository/Page_Leading Global University in Singapore_ecdf59/div_FAQs on COVID-19_menu2'))

WebUI.waitForElementClickable(findTestObject('Page_Leading Global University in Singapore_ecdf59/span_International Relations'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Leading Global University in Singapore_ecdf59/span_International Relations'))

a = WebUI.getUrl()

WebUI.verifyMatch(a, 'https://www.ntu.edu.sg/oia/Pages/home.aspx', false)

WebUI.closeBrowser()

