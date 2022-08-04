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

WebUI.navigateToUrl('https://test2.bittermate.com/wp-login.php?redirect_to=https%3A%2F%2Ftest2.bittermate.com%2Fwp-admin%2F&reauth=1')

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/input_Username'), 
    'HeK7efHMQ5uFnm9JjsPr')

WebUI.setEncryptedText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/input_Password'), 
    'j0Nap0ti6DhaVggngvyR/o5uPt58Q4Zkrfnklq59dgCapLJ4ygQgUQ==')

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/submit_button'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/div_WooCommerce'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/woocommerce_Settings'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/a_JetWooBuilder'))

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/div_GeneralProductsShippingPaymentsAccounts_2afa44'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_General'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/th_Widgets Render Method'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Shop Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Single Product'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Archive Product'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Archive Category'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Checkout'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_Thank You Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/h2_My Account Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_backoffice/jetwoobuilder_exist/jetwoobuilder/button_Save changes'), 
    0)

WebUI.delay(2)

WebUI.closeBrowser()

