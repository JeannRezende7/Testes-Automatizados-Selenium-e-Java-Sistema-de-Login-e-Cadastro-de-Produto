package br.com.teste.teste.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePo extends BasePo {

    @FindBy(name = "q")
    public WebElement imputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    public GooglePo(WebDriver driver) {
        super(driver);

    }

    public void pesquisar(String texto) {
        imputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    public String obterResultadoPesquisa(){
        return divResultadoPesquisa.getText();
    }

}
