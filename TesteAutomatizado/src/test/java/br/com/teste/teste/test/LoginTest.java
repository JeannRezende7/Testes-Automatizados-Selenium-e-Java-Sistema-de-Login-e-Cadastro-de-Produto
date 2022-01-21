package br.com.teste.teste.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.com.teste.teste.page.LoginPo;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class LoginTest extends BaseTest {

    private static LoginPo loginPage;

    @BeforeAll
    public static void prepararTeste() {
        loginPage = new LoginPo(driver);

    }

    @Test
    public void TC001_NaoDeveLogarNoSistemaComUsuarioESenhaEmBranco() {

        loginPage.executarAcaoDeLogar("", "");
        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");

    }

    @Test
    public void TC002_NaoDeveLogarNoSistemaComEmailIncorretoESenhaVazia() {

        loginPage.executarAcaoDeLogar("testeemail@gmail.com", "");

        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");

    }

    @Test
    public void TC003_NaoDeveLogarNoSistemaComEmailVazioESenhaIncorreta() {

        loginPage.executarAcaoDeLogar("", "senhateste");

        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");

    }

    @Test
    public void TC004_NaoDeveLogarNoSistemaComEmailEscritoIncorretamenteESenhaInvalida() {

        loginPage.executarAcaoDeLogar("teste", "admin123");

        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC005_NaoDeveLogarNoSistemaComEmailValidoESenhaIncorreta() {

        loginPage.executarAcaoDeLogar("teste.teste@gmail.com", "senhateste");

        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC006_NaoDeveLogarNoSistemaComEmailValidoESenhaIncorretaComCaracteresEspeciais() {

        loginPage.executarAcaoDeLogar("teste.teste@gmail.com", "admin@123");

        String mensagem = loginPage.obterMensagem();
        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC007_DeveLogarNoSistemaComEmaiESenhaCorretos() {

        loginPage.executarAcaoDeLogar("admin.teste@gmail.com", "admin");
        assertEquals(driver.getTitle(), "Controle de Produtos");

    }

}
