package uday_appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;


public class DragDrop extends BaseTest {

	
	@Test
	public void DragDropTest()throws MalformedURLException,InterruptedException
	{
	
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click();
      driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
      WebElement source =driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
      
      
 
      ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
          "elementId", ((RemoteWebElement) source).getId(),
          "endX", 655,
          "endY", 690
      ));
      
      
      Thread.sleep(3000);
      String result=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
//      System.out.println(result);
      Assert.assertEquals(result, "Dropped!");
	}
	
	
	
}

                                 
