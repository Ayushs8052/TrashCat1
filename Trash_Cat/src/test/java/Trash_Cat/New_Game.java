package Trash_Cat;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class New_Game {

	public AndroidDriver driver;
	public int screenWidth;
	public int screenHeight;

	@BeforeTest
	public void setUp() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "GameTesting");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("app",
				"C://Users//Ayush.Srivastava1//eclipse-workspace//Trash_Cat//src//test//resources//Pet_Runner.apk");

		URL appiumServerURL = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(appiumServerURL, caps);
	}

	@Test
	public void testStartGame() {
		// Locate the "Start" button and click to start the game
		sleep(50000);

		// Go Button

		int xCoordinate = 537;
		int yCoordinate = 1533;

		// Perform tap action at specified coordinates
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(xCoordinate, yCoordinate)).perform();

//		swipeUp()- First Jump;

		sleep(3500);
		swipeUp();

// Second Jump
		sleep(800);
		swipeUp();

		sleep(3000);
//        WebElement InstallButton = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View"));
//        InstallButton.click();

		
		// Pause Button
		int xCoordinate1 = 537;
		int yCoordinate1 = 259;
		// Perform tap action at specified coordinates
		TouchAction action1 = new TouchAction(driver);
		action1.tap(PointOption.point(xCoordinate1, yCoordinate1)).perform();

		sleep(3000);
// Setting Button 
		int xCoordinate2 = 553;
		int yCoordinate2 = 1032;
		// Perform tap action at specified coordinates
		TouchAction action2 = new TouchAction(driver);
		action2.tap(PointOption.point(xCoordinate2, yCoordinate2)).perform();

		sleep(3000);
		
		// Music Off  Button 

		int xCoordinate3 = 813;
		int yCoordinate3 = 1317;
		// Perform tap action at specified coordinates
		TouchAction action3 = new TouchAction(driver);
		action2.tap(PointOption.point(xCoordinate3, yCoordinate3)).perform();

		sleep(3000);

		// Cross Button 
		int xCoordinate4 = 970;
		int yCoordinate4 = 605;
		// Perform tap action at specified coordinates
		TouchAction action4 = new TouchAction(driver);
		action2.tap(PointOption.point(xCoordinate4, yCoordinate4)).perform();

		sleep(3000);
// Pause 
		int xCoordinate5 = 520;
		int yCoordinate5 = 835;
		// Perform tap action at specified coordinates
		TouchAction action5 = new TouchAction(driver);
		action2.tap(PointOption.point(xCoordinate5, yCoordinate5)).perform();

		sleep(3000);
//// Achivement 
//		int xCoordinate6 = 553;
//		int yCoordinate6 = 1032;
//		// Perform tap action at specified coordinates
//		TouchAction action6 = new TouchAction(driver);
//		action2.tap(PointOption.point(xCoordinate6, yCoordinate6)).perform();
//
//		sleep(3000);
//// Cross 
//		int xCoordinate7 = 553;
//		int yCoordinate7 = 1032;
//		// Perform tap action at specified coordinates
//		TouchAction action7 = new TouchAction(driver);
//		action2.tap(PointOption.point(xCoordinate7, yCoordinate7)).perform();

		sleep(3000);

		driver.closeApp();

	}

	public void swipeUp() {

		int screenHeight = driver.manage().window().getSize().getHeight();
		int startX = screenWidth / 2;
		int startY = (int) (screenHeight * 0.8);
		int endY = (int) (screenHeight * 0.2);
		swipe(startX, startY, startX, endY);
	}

	private void swipe(int startX, int startY, int endX, int endY) {

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}