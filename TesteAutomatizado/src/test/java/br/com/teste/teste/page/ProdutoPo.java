package br.com.teste.teste.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPo extends BasePo {

    @FindBy(id = "btn-adicionar")
    public WebElement btnAdicionar;

    // document.querySelector('ul>li>a.nav-link')
    @FindBy(css = "ul>li>a.nav-link")
    public WebElement linkVoltar;

    @FindBy(css = "div.modal-header>h4")
    public WebElement tituloModal;

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "data")
    public WebElement inputData;

    @FindBy(id = "btn-salvar")
    public WebElement btnSalvar;

    @FindBy(id = "btn-sair")
    public WebElement btnSair;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    public void cadastrarProduto(String codigo,
            String nome,
            String data,
            Double valor,
            Integer quantidade) {

        escrever(inputCodigo, codigo);
        escrever(inputNome, nome);
        escrever(inputQuantidade, quantidade.toString());
        escrever(inputValor, valor.toString());
        escrever(inputData, data);

        btnSalvar.click();

    }

    public ProdutoPo(WebDriver driver) {
        super(driver);
    }

}
