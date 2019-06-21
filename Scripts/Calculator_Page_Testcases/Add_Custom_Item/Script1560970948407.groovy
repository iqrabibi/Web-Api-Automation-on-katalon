import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(3)

WebUI.click(findTestObject('Page_Storage Calculator  STORED/a_Add a custom item'))

WebUI.click(findTestObject('Page_Storage Calculator  STORED/input_Item name_custom-item-name'))

WebUI.setText(findTestObject('Page_Storage Calculator  STORED/input_Item name_custom-item-name'), Custom_Item_Name)

WebUI.click(findTestObject('Page_Storage Calculator  STORED/input_Length_custom-item-length'))

WebUI.setText(findTestObject('Page_Storage Calculator  STORED/input_Length_custom-item-length'), '1')

WebUI.click(findTestObject('Page_Storage Calculator  STORED/input_Width_custom-item-width'))

WebUI.setText(findTestObject('Page_Storage Calculator  STORED/input_Width_custom-item-width'), '1')

WebUI.click(findTestObject('Page_Storage Calculator  STORED/input_Height_custom-item-height'))

WebUI.setText(findTestObject('Page_Storage Calculator  STORED/input_Height_custom-item-height'), '1')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Storage Calculator  STORED/img_Height_icon icon-done'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Page_Storage Calculator  STORED/ul_box'))

