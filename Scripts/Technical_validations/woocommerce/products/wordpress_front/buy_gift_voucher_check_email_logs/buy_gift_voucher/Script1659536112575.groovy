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

WebUI.navigateToUrl('https://test2.bittermate.com/product/fuerteventura-4-x-4/')

WebUI.click(findTestObject('technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input_Book now_turitop_booking_system_gift_checkbox'))

WebUI.doubleClick(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/svg'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/svg'))

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__turitop_booking_system_gift_voucher__734c47'), 
    'recipient test')

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__turitop_booking_system_gift_voucher__7a3023'), 
    'charly')

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__turitop_booking_system_gift_voucher__7a3023'))

WebUI.doubleClick(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__turitop_booking_system_gift_voucher__7a3023'))

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__turitop_booking_system_gift_voucher__7a3023'), 
    'ticalo.help@gmail.com')

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/a_Book now'))

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__billing_first_name'), 
    'buyer')

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input_(optional)_billing_last_name'), 
    'test gift')

WebUI.setText(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/input__billing_email'), 
    'ticalo.help@gmail.com')

WebUI.click(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/a_Click here to download your gift voucher'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/a_Click here to redeem your gift voucher'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/technical_validation/woocommerce/wordpress_front/buy_gift_voucher/buy_gift/h1_Order received'), 
    0)

WebUI.closeBrowser()

