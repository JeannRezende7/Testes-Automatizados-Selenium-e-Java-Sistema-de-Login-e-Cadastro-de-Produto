package br.com.teste.teste.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.teste.teste.page.GooglePo;

public class GoogleTest extends BaseTest {

    private static GooglePo googlePage;

    @BeforeAll
    public static void prepararTeste() {
        googlePage = new GooglePo(driver);

    }

    @Test
    public void TC001_DevePesquisarNoGoogleOTextoBatataFrita() {

        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.obterResultadoPesquisa();

        assertTrue(resultado.contains("Aproximadamente"), resultado);

    }
    @Test
    public void TC002_DevePesquisarNoGoogleOTextoBatataVagem() {

        googlePage.pesquisar("Batata Vagem");

        assertTrue(googlePage.obterResultadoPesquisa().contains("Aproximadamente"), googlePage.obterResultadoPesquisa());

    }

}