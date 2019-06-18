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

'New Login (Purchasing)'
WebUI.openBrowser('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'adi.wirawan')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemWelcome/span_PO Approval - Purchasing'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemWelcome/span_Submit PO Approval'))

'Uploading the File using Send Keys method by passing the File path'
WebUI.sendKeys(findTestObject('PO/Page_Procurement SystemSubmit PO Ap/Submit PO'), 'D:\\\\Katalon\\\\submitPOApprovalTemp.xls')

FilePath = WebUI.getAttribute(findTestObject('PO/Page_Procurement SystemSubmit PO Ap/Submit PO'), 'value')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemSubmit PO Ap/input_assignmentComplete'))

WebUI.delay(10)

'Capturing the file name after upload and storing it in a variable'
WebUI.closeBrowser()

'Login (PSH)'
WebUI.openBrowser('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'yadi')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemWelcome/span_Inbox Purchasing Section'))

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemInbox Purcha/i'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemInbox Purcha/button_Approve Selected PO'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.closeBrowser()

'Login (PODH)'
WebUI.openBrowser('http://203.190.54.77:81/jw/web/userview/poApproval/poUserView/_/EC6B23361F9B4242BB7B3EB431889239')

'Maximize the window\r\n'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/a_Login'))

WebUI.setText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_username'), 'tarkiman')

WebUI.setEncryptedText(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_j_password'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/PS/Page_Procurement SystemWelcome/input_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemWelcome/span_Inbox Parts Operation Dep'))

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemInbox Parts/i'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/PO/Page_Procurement SystemInbox Parts/button_Approve Selected PO'))

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.closeBrowser()

