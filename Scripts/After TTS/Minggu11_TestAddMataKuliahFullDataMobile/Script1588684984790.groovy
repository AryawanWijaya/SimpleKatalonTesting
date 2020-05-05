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

Mobile.startApplication('E:\\Ary_Doc_Duta_Wacana\\Semester6\\8_Pengujian Perangkat Lunak_Argo\\PROJECTProgmob\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Email (7)'), 0)

Mobile.clearText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Email (8)'), 0)

Mobile.setText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 (8)'), 'admin@staff.ukdw.ac.id', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Password (7)'), 0)

Mobile.clearText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Password (8)'), 0)

Mobile.setText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 (9)'), 'admin', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Button0 - SIGN IN (4)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.ImageButton0 (2)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.TextView0 - Create (2)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Alpro-1'), 0)

Mobile.clearText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Alpro-1 (1)'), 0)

Mobile.setText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 (10)'), 'SI-PPL', 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Alpro'), 0)

Mobile.clearText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - Alpro (1)'), 0)

Mobile.setText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 (11)'), 'PPL_ArgoWIbowo', 0)

Mobile.clearText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 - 3'), 0)

Mobile.setText(findTestObject('Minggu11_AndroidPath/android.widget.EditText0 (12)'), '6', 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Spinner0'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.TextView0 - Selasa'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Spinner0 (1)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.TextView0 - Sesi4'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Button0 - Simpan (2)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Button0 - Yes (4)'), 0)

navBarDashboard = Mobile.getText(findTestObject('Minggu11_AndroidPath/android.widget.TextView0 - SI KRS - ADMIN-HAI ARY (1)'), 
    0)

if (navBarDashboard == 'SI KRS - ADMIN-HAI ARY') {
    WebUI.comment('Berhasil')
} else {
    WebUI.comment('Gagal')
}

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.TextView0 (2)'), 0)

Mobile.tap(findTestObject('Minggu11_AndroidPath/android.widget.Button0 - Yes (5)'), 0)

Mobile.closeApplication()

