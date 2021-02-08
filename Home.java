package domaciSelenium3Objects;

import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	public static final String URL = "https://www.youtube.com";
	public static final String SONG_URL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
	public static final String SEARCH_URL = "https://www.youtube.com/results?search_query=Rick+Astley";

	public static void searchSinger(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Rick Astley");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.RETURN);
	}

	public static void selectSong(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();

	}

	public static void nextSong(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[2]/div/div[3]/ytd-watch-next-secondary-results-renderer/div[2]/ytd-compact-radio-renderer/div[1]/div/div[1]/a/h3/span")).click();
		
	}
}
