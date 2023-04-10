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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://oneaccount.aksorn.com/register?client_id=38b0c553-0085-4e35-8059-00676d6c02af&redirect_uri=https%3A%2F%2Fwww.aksorn.com%2Fapi%2Foauth%2Fauthorize&response_type=code&scope=')

WebUI.click(findTestObject('Object Repository/Page_Aksorn One Account/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    '')

WebUI.sendKeys(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input__first_name'), '')

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input__last_name'), '')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aksorn One Account/select_'), 'M', true)

WebUI.click(findTestObject('Object Repository/Page_Aksorn One Account/span__1'))

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    '2546')

WebUI.sendKeys(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input__email'), '')

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input__mobile_no'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aksorn One Account/input__password'), 'vB31XdcLjIZtTq1tcYOULQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aksorn One Account/input__password_confirmation'), 'vB31XdcLjIZtTq1tcYOULQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aksorn One Account/select__1'), 'STUDENT', true)

WebUI.click(findTestObject('Object Repository/Page_Aksorn One Account/span__1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    'สิรินธรราชวิทยาลัย')

WebUI.sendKeys(findTestObject('Object Repository/Page_Aksorn One Account/input_concat(id(, , select2-title_id-contai_5927a0'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Aksorn One Account/span__checkbox-icon fuse-ripple-ready'))

WebUI.click(findTestObject('Page_Aksorn One Account/ButtonRegister'))

WebUI.verifyTextPresent('กรุณากรอก ชื่อ', false)

WebUI.verifyTextPresent('กรุณากรอก นามสกุล', false)

WebUI.verifyTextPresent('กรุณากรอก อีเมล', false)

WebUI.verifyTextPresent('กรุณากรอก โทรศัพท์มือถือ', false)

WebUI.verifyTextPresent('รหัสผ่านต้องมีอย่างน้อย 6 หลัก', false)

WebUI.verifyTextPresent('รหัสผ่านประกอบไปด้วยตัวหนังสือภาษาอังกฤษตัวเล็ก (a-z) ตัวใหญ่ (A-Z) หรือตัวเลข (0-9) ก็ได้', false)

WebUI.closeBrowser()

