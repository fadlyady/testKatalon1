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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.sicepat.com/')

not_run: WebUI.verifyElementPresent(findTestObject('Home Obj/main content'), 30)

not_run: WebUI.click(findTestObject('Home Obj/btn_cekresi'))

not_run: WebUI.verifyElementVisible(findTestObject('Menu Cek Resi/container resi'))

not_run: WebUI.setText(findTestObject('Menu Cek Resi/field_resi'), '00435723687')

not_run: WebUI.click(findTestObject('Menu Cek Resi/btn_lacak'))

not_run: WebUI.verifyElementPresent(findTestObject('Menu Cek Resi/alert_gagal'), 30)

WebUI.click(findTestObject('Menu Cek Resi/tambah_resi'))

WebUI.verifyElementPresent(findTestObject('Menu Cek Resi/btn_deleteresi'), 10)

WebUI.click(findTestObject('Menu Cek Resi/btn_deleteresi'))

WebUI.verifyElementNotPresent(findTestObject('Menu Cek Resi/btn_deleteresi'), 10)

