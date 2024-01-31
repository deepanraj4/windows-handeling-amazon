package org.testWindows;

import java.awt.List;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOrder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepanraj\\eclipse-workspace\\WindowsHandeling\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 promax", Keys.ENTER);

		WebElement iphonePurple = driver
				.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 Pro Max (256 GB) - Deep Purple')]"));
		iphonePurple.click();

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent window ID" + parentWindowId);

		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println("All Windos ID" + allWindowID);

		for (String x : allWindowID) {

			if (!parentWindowId.equals(x))
				;
			System.out.println("first child window ID" + x);
			driver.switchTo().window(x);
		}

		WebElement addToCart = driver.findElement(By.name("submit.add-to-cart"));
		addToCart.click();

		// switch back to parent window

		driver.switchTo().window(parentWindowId);

		WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox2.clear();
		searchBox2.sendKeys("samsung s23", Keys.ENTER);

		WebElement samsungS23 = driver.findElement(By.xpath(
				"//span[contains(text(),'Samsung Galaxy S23 Ultra 5G (Phantom Black, 12GB, 256GB Storage)')][1]"));
		samsungS23.click();

		// to find all windows ID again

		Set<String> allWindowsID2 = driver.getWindowHandles();
		LinkedList<String> li = new LinkedList<String>();

		li.addAll(allWindowsID2);

		String secondChildWindows = li.get(2);
		System.out.println("second Child windows ID" + secondChildWindows);

		driver.switchTo().window(secondChildWindows);

		WebElement addtoCartS23 = driver.findElement(By.id("add-to-cart-button"));
		addtoCartS23.click();

		// switch back to parent window

		driver.switchTo().window(parentWindowId);

		WebElement searchBox3 = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox3.clear();
		searchBox3.sendKeys("one plus", Keys.ENTER);

		WebElement onePlus = driver.findElement(
				By.xpath("//span[contains(text(),'OnePlus 11R 5G (Sonic Black, 8GB RAM, 128GB Storage)')]"));
		onePlus.click();

		// to find all windowsID again

		Set<String> allwindowsID3 = driver.getWindowHandles();
		LinkedList<String> list3 = new LinkedList<String>();

		list3.addAll(allwindowsID3);

		String thirdChildWindow = list3.get(3);
		System.out.println("thirtd child window ID" + thirdChildWindow);

		driver.switchTo().window(thirdChildWindow);

		WebElement addtoCartoneplus = driver.findElement(By.id("add-to-cart-button"));
		addtoCartoneplus.click();

		// switch back to parent window

		driver.switchTo().window(parentWindowId);

		WebElement searchBox4 = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox4.clear();
		searchBox4.sendKeys("google pixel", Keys.ENTER);

		WebElement googlePixel = driver.findElement(
				By.xpath("//span[contains(text(),'Google Pixel 7 Pro 5G Hazel, 12GB Ram 128GB Storage')]"));
		googlePixel.click();

		// to find allwindowsID again

		Set<String> allWindowsID4 = driver.getWindowHandles();
		LinkedList<String> list4 = new LinkedList<String>();
		list4.addAll(allWindowsID4);

		String fourthChildWindowID = list4.get(4);
		System.out.println("fourth child Window ID --" + fourthChildWindowID);

		driver.switchTo().window(fourthChildWindowID);

		WebElement addtoCartPixel = driver.findElement(By.id("add-to-cart-button"));
		addtoCartPixel.click();

		// switch back to parent window

		driver.switchTo().window(parentWindowId);

		WebElement searchBox5 = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox5.clear();
		searchBox5.sendKeys("motorola", Keys.ENTER);
		
		Thread.sleep(3000);

		WebElement motorolaRazr = driver.findElement(By.xpath("(//span[contains(text(),'Motorola razr 40 Ultra (Viva Magenta, 8GB RAM, 256GB Storage)')])[2]"));
		motorolaRazr.click();
		
		// to find allwindowsID again
		
		Set<String> allWindowsID5 = driver.getWindowHandles();
		LinkedList<String> list5 = new LinkedList<String>();
		list5.addAll(allWindowsID5);
		
		String fifthChildWindowID = list5.get(5);
		System.out.println("Fifth child window ID -- "+fifthChildWindowID);
		
		driver.switchTo().window(fifthChildWindowID);
		
		Thread.sleep(3000);
		
		WebElement addtoCartMototola = driver.findElement(By.id("add-to-cart-button"));
		addtoCartMototola.click();
		
		

	}
}
