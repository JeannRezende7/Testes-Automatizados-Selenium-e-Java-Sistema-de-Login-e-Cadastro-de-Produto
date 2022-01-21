package br.com.teste.teste.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPo extends BasePo {

    public LoginPo(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement btnEntrar;

    @FindBy(css = "form>div.alert>span")
    public WebElement spanMensagem;

    @FindBy(css = "form>div.alert>span")
    public WebElement obterTitulo;

    public String obterMensagem() {
        return spanMensagem.getText();
    }

    public void escrever(WebElement input, String texto) {
        input.clear();
        input.sendKeys(texto + Keys.TAB);

    }

    public void executarAcaoDeLogar(String email, String senha) {
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        btnEntrar.click();
    }

}