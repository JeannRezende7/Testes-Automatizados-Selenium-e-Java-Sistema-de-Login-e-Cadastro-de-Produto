package br.com.teste.teste.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "file:///C:/Rumo%20ao%20QA/Projetos/TesteAutomatizado%20Selenium%20e%20Java%20-%20Tela%20Login/TesteAutomatizado/src/test/java/br/com/teste/teste/resource/SistemaLogin/login.html";
    private static final String CAMINHO_DRIVER = "src/test/java/br/com/teste/teste/resource/chromedriver97.0.4692.71.exe";

    @BeforeAll
    public static void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterAll
    public static void finalizar() {
        driver.quit();
    }

}
