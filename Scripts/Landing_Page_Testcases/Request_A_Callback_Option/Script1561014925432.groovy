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
import org.openqa.selenium.Keys as Keys

String  math=Math.random()*50;
WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bystored.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/Page_1 London Storage Company - FREE Pickup Quick Return  STORED/span_Get in touch'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/span_request a call-back'))

WebUI.waitForElementVisible(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/h2_Drop us a note we are here to help'), 
    0)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_First name_firstName'))

WebUI.setText(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_First name_firstName'), 
    Fname)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_Last name_lastName'))

WebUI.setText(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_Last name_lastName'), 
    Lname)

WebUI.delay(3)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/span_Work email address'))

WebUI.setText(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_Work email address_email'), 
  'iqrabibi'+math+'@venturedive.com' )

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/span_Phone number'))

WebUI.setText(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/input_Phone number_nationalNumber'), 
    pNumber)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/textarea_How can we help_message'))

WebUI.setText(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/textarea_How can we help_message'), 
    Message)

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/a_Submit'))

WebUI.waitForElementVisible(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/div_Thank you for your enquiry We will get back to you within one business day'), 
    0)

WebUI.verifyElementVisible(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/div_Thank you for your enquiry We will get back to you within one business day'))

WebUI.click(findTestObject('Page_1 London Storage Company - FREE Pickup Quick Return  STORED/span_'))

WebUI.closeBrowser()

