package domaciSelenium3Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import domaciSelenium3Objects.Home;

public class Selenium3Tests {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void testSearch() {
		driver.navigate().to(Home.URL);
		Home.searchSinger(driver);

		String actual = driver.getCurrentUrl();
		String expected = Home.SEARCH_URL;

		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void testSong() {
		driver.navigate().to(Home.SEARCH_URL);
		Home.selectSong(driver);

		String actual = driver.getCurrentUrl();
		String expected = Home.SONG_URL;

		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 2)
	public void testSecondChoice() {
		driver.navigate().to(Home.SONG_URL);
		Home.nextSong(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=djV11Xbc914";

		Assert.assertEquals(actual, expected);
	}

}
