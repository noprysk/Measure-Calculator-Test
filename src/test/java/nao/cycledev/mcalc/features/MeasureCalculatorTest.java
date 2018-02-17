package nao.cycledev.mcalc.features;

import nao.cycledev.mcalc.pages.MeasureCalculatorPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class MeasureCalculatorTest {

  @Managed
  WebDriver driver;

  MeasureCalculatorPage measureCalculatorPage;

  @Test
  public void shouldLoadHomePage() {
    measureCalculatorPage.open();

    assertThat(measureCalculatorPage.getTitle()).isEqualTo("Measure Calculator");
  }

}
