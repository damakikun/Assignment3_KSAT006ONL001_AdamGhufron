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

Mobile.startExistingApplication('com.solodroid.solomerce')

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - EDIT'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.RelativeLayout'), 0)

Mobile.clearText(findTestObject('Profile/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Profile/android.widget.EditText'), 'Adam Ghufron', 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Profile/android.widget.RelativeLayout (3)'), 0)

Mobile.clearText(findTestObject('Profile/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText'), 'adamghufrons@gmail.com', 0)

Mobile.tap(findTestObject('Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.RelativeLayout (1)'), 0)

Mobile.clearText(findTestObject('Profile/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText'), '+6285156512320', 0)

Mobile.tap(findTestObject('Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.RelativeLayout (2)'), 0)

Mobile.clearText(findTestObject('Profile/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Profile/android.widget.EditText'), 'Jaksel', 0)

Mobile.tap(findTestObject('Profile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.ImageButton'), 0)

Mobile.closeApplication()

