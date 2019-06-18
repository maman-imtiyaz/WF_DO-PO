import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

'Login (Inventory)'
WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'iday')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

'Verify message after logging in'
WebUI.verifyTextPresent("Welcome to APP Procurement System,", false)

'Close browser'
WebUI.closeBrowser()