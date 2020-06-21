package example;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.fluentlenium.core.hook.wait.Wait;
import org.openqa.selenium.support.FindBy;

@Wait
@PageUrl("https://news.ycombinator.com/")
public class HackerNewsMainPage extends FluentPage {

  @FindBy(css = "table.itemlist")
  private FluentWebElement itemList;

  public void assertNumberOrArticlesShown(int number) {
    assertThat(itemList.find("tbody > tr.athing")).hasSize(number);
  }

}
