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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test2.bittermate.com/product/vuelta-a-la-gomera-en-minibus-con-comida/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/multiple-buy/no_multiclient/td_30'))

WebUI.click(findTestObject('Object Repository/multiple-buy/no_multiclient/span_0930'))

WebUI.doubleClick(findTestObject('Object Repository/multiple-buy/no_multiclient/svg'))

WebUI.click(findTestObject('Object Repository/multiple-buy/no_multiclient/a_Book now'))

WebUI.setText(findTestObject('Object Repository/multiple-buy/no_multiclient/input__billing_first_name'), 'no multi')

WebUI.setText(findTestObject('Object Repository/multiple-buy/no_multiclient/input_(optional)_billing_last_name'), 'book')

WebUI.setText(findTestObject('Object Repository/multiple-buy/no_multiclient/input__billing_email'), 'charly@turitop.com')

WebUI.click(findTestObject('Object Repository/multiple-buy/no_multiclient/button_Place order'))

WebUI.delay(2)

WebUI.closeBrowser()

