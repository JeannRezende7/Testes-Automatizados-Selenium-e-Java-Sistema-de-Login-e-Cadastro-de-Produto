package br.com.teste.teste.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    public abstract class BasePo {

        public static WebDriver driver;

        public BasePo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
