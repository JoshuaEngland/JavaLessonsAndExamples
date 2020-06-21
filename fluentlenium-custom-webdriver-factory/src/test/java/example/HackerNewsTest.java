package example;

import org.fluentlenium.adapter.junit.jupiter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.jupiter.api.Test;

public class HackerNewsTest extends FluentTest {
  @Page
  HackerNewsMainPage hackerNewsMainPage;

  @Test
  public void thirtyArticlesShouldBeShown() {
    goTo(hackerNewsMainPage)
        .assertNumberOrArticlesShown(30);
  }

}