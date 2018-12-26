package pageObject;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.deps.com.thoughtworks.xstream.core.util.Pool.Factory;

public class GoogleSearchPage {
	@FindBy(css = "input.gLFyf")
	public WebElement txtSearchbox;
	@FindBy(css = "div.FPdoLc input[type=\"submit\"]")
	public WebElement btnSearch;
	@FindBy(css = "div.gsmt")
	public WebElement lbResult;

	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
