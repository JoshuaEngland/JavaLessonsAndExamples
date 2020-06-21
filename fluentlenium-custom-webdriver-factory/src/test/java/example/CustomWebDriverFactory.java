package example;

import org.fluentlenium.configuration.ConfigurationProperties;
import org.fluentlenium.configuration.FactoryName;
import org.fluentlenium.configuration.WebDriverFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@FactoryName("customWebDriver")
public class CustomWebDriverFactory implements WebDriverFactory {

  @Override
  public WebDriver newWebDriver(Capabilities desiredCapabilities, ConfigurationProperties configuration) {
    return new HtmlUnitDriver(true);
  }

}
