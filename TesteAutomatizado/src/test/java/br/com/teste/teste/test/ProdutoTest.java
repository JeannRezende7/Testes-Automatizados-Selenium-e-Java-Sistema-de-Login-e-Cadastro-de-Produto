package br.com.teste.teste.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.com.teste.teste.build.ProdutoBuilder;
import br.com.teste.teste.page.LoginPo;
import br.com.teste.teste.page.ProdutoPo;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ProdutoTest extends BaseTest {

    private static LoginPo loginPage;
    private static ProdutoPo controleProdutoPage;

    @BeforeAll
    public static void prepararTeste() {
        loginPage = new LoginPo(driver);
        loginPage.executarAcaoDeLogar("admin.teste@gmail.com", "admin");

        controleProdutoPage = new ProdutoPo(driver);
        assertEquals(driver.getTitle(), "Controle de Produtos");
    }
    

    @Test
    public void TC001_deveAbrirModalParaCadastroAoClicarNoBotaoCriar() {
        controleProdutoPage.btnAdicionar.click();
        // O programa tem um bug que é necessario clicar 2x por isso instanciar 2 click
        // TODO: Remover esse click assim que o sistema for corrigido
        controleProdutoPage.btnAdicionar.click();
        String titulo = controleProdutoPage.tituloModal.getText();
        assertEquals("Produto", titulo);
        controleProdutoPage.btnSair.click();
        // O programa tem um bug que é necessario clicar 2x para sair do modal.
        controleProdutoPage.btnSair.click();
    }

    /*
     * @Test
     * public void
     * TC002_NaoDeveSerPossivelCadastrarUmProdutoSemPreencherTodosOsCampos() {
     * controleProdutoPage.btnAdicionar.click();
     * 
     * controleProdutoPage.cadastrarProduto("001", "CERVEJA", 59.90, 10, "");
     * 
     * String mensagem = controleProdutoPage.spanMensagem.getText();
     * 
     * assertEquals("Todos os campos são obrigatósrios para o cadastro!", mensagem);
     * 
     * String titulo = controleProdutoPage.tituloModal.getText();
     * assertEquals("Produto", titulo);
     * 
     */

    @Test
    public void TC003_NaoDeveSerPossivelCadastrarUmProdutoSemPreencherTodosOsCampos() {
        controleProdutoPage.btnAdicionar.click();
        
        ProdutoBuilder produtoBuilder = new ProdutoBuilder(controleProdutoPage);

        produtoBuilder
                .adicionarNome("")
                .builder();
                assertEquals("Todos os campos são obrigatórios para o cadastro!", controleProdutoPage.spanMensagem.getText());
        produtoBuilder
                .adicionarData("")
                .builder();
                assertEquals("Todos os campos são obrigatórios para o cadastro!", controleProdutoPage.spanMensagem.getText());
        produtoBuilder
                .adicionarNome("LEITE DE CABRA")
                .adicionarValor(null)
                .builder();
                assertEquals("Todos os campos são obrigatórios para o cadastro!", controleProdutoPage.spanMensagem.getText());

        

    

        String titulo = controleProdutoPage.tituloModal.getText();
        assertEquals("Produto", titulo);

    }

}
