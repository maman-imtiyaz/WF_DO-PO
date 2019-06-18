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

WebUI.delay(3)

WebUI.click(findTestObject('PS/Page_Procurement SystemWelcome/a_Draft Order - Inventory'))

WebUI.delay(3)

WebUI.click(findTestObject('PS/Page_Procurement SystemWelcome/span_Upload Draft Order'))

'Uploading the File using Send Keys method by passing the File path'
WebUI.sendKeys(findTestObject('Upload File'), 'D:\\\\Katalon\\\\uploadDraftOrderTemp.xls')

FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')

WebUI.delay(3)

WebUI.click(findTestObject('PS/Page_Procurement SystemUpload Draft/Submit Upload'))

WebUI.delay(10)

'Capturing the file name after upload and storing it in a variable'
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

'New Login (Purchasing)'
WebUI.openBrowser('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'adi.wirawan')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('PS/Page_Procurement SystemWelcome/DO Purchasing'))

WebUI.delay(3)

WebUI.click(findTestObject('DO/Page_Procurement SystemWelcome/Page_Procurement SystemWelcome/span_Submit Draft Order Compil'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/Submit compile'))

WebUI.delay(10)

WebUI.click(findTestObject('PS/Page_Procurement SystemWelcome/DO Purchasing'))

WebUI.delay(3)

WebUI.click(findTestObject('DO/Page_Procurement SystemWelcome/Page_Procurement SystemWelcome/span_Inbox Final Check'))

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/select all checkbox'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/button_Multiple Approve'))

WebUI.acceptAlert()

WebUI.delay(7)

//WebUI.click(findTestObject('DO/Page_Procurement SystemInbox Final/a_Review PO'))
//WebUI.click(findTestObject('DO/Page_Procurement SystemFinal Check/label_Approve'))
//WebUI.click(findTestObject('Object Repository/PS/Upload_File/Page_Procurement SystemFinal Check/input_submit'))
WebUI.closeBrowser()

'New Login (PSH)'
WebUI.openBrowser('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'yadi')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

WebUI.click(findTestObject('DO/Page_Procurement SystemWelcome/span_Inbox Approval Draft PO P'))

WebUI.click(findTestObject('Object Repository/DO/Page_Procurement SystemInbox Approv/Page_Procurement SystemInbox Approv/i'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DO/Page_Procurement SystemInbox Approv/Page_Procurement SystemInbox Approv/button_Multiple Approve'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(10)

//WebUI.click(findTestObject('DO/Page_Procurement SystemInbox Approv/a_Approval'))
//WebUI.click(findTestObject('DO/Page_Procurement SystemDraft PO Sec/label_Approve'))
//WebUI.click(findTestObject('DO/Page_Procurement SystemDraft PO Sec/input_submit'))
WebUI.closeBrowser()

