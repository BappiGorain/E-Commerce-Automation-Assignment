package pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.qameta.allure.Step;
import utils.WaitUtils;

public class LogoutPage
{
	private static final Logger logger = LoggerFactory.getLogger(LogoutPage.class);
	
	@Step("Logout")
	public void logout()
	{
		WaitUtils.click(By.xpath("//a[normalize-space()='Log out']"));
		logger.info("Logout out successfully");
	}
}
