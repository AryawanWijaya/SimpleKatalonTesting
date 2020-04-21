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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.setText(findTestObject('Page_Login Admin/input_Email_email'), 'dian')

WebUI.setEncryptedText(findTestObject('Page_Login Admin/input_Password_password'), 'MMS/zmTQxAM=')

WebUI.click(findTestObject('Page_Login Admin/input_Lupa Password_btn btn-success w-100'))

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Tokobuah Admin -/a_List Product'))

String expectedValue = 'Anggur'

WebDriver driver = DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows = table.findElements(By.tagName('tr'))

println('No. of rows: ' + rows.size())

table: for (int i = 0; i < rows.size(); i++) {
    List<WebElement> cols = rows.get(i).findElements(By.tagName('td'))

//    println('No. of cols: ' + cols.size())

    for (int a = 0; a < cols.size(); a++) {
//        println(cols.get(a).getText())

        if (cols.get(a).getText().equalsIgnoreCase(expectedValue)) {
            WebUI.comment(('Kata' + expectedValue) + ' itu ada')

			break
            
        }
    }
}
WebUI.closeBrowser()

