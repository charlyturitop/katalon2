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

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/Username_log'), 
    'HeK7efHMQ5uFnm9JjsPr')

WebUI.setEncryptedText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/Password'), 
    'j0Nap0ti6DhaVggngvyR/o5uPt58Q4Zkrfnklq59dgCapLJ4ygQgUQ==')

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/input_button'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/WP Mail SMTP'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/a_Email Log'))

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/Select all_logs'))

WebUI.selectOptionByValue(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/Bulk actionsDelete'), 
    'delete', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/bulk action_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/Deleted_emails_logs/td_No emails have been logged for now'), 
    0)

WebUI.delay(2)

WebUI.closeBrowser()

