# Testes-Automatizados-Selenium-e-Java-Sistema-de-Login-e-Cadastro-de-Produto

Tudo em Geral utilizado no Curso de Testes Automizados com Selenium e Java.
Dependencias necessarias para uso do Selenium:https://drive.google.com/file/d/1ji5j7PCfXo3lgWqODGUaIExnK9IvN2jk/view?usp=sharing
Chromedriver: https://chromedriver.chromium.org/downloads

----------------------------
Anotações
----------------------------

No Custo o Principal serão os testes de ACEITAÇÃO e FUNCIONAL.

Funcional: Atende tanto o caixa branca quanto o de caixa preta. O objetivo dele é testar a funcionalidade do sistema. tipo 2+2 = 4 ele testa isso,da pra ser manualmente ou automaticamente.
Aceitação : Tipo de teste aplicado para verificar se o software ou produto esta "usavel" tipo estar claro para o usuario,uma interface boa e a aceitação mesmo do modulo.

Eu como QA,oque vou testar?
Alem de testar a funcionalidade,apresentar melhorias.
Qual a diferença entre teste de usabilidade e teste funcionalidade?
O Teste de usabilidade tem o intuito de ter o ponto de vista do consumidor, o teste procura verificar a experiência do usuário.
Dessa forma, o responsável deve checar a organização dos itens disponíveis na tela,observar se o layout está correto e se os botões se comunicam corretamente entre as diferentes páginas do sistema.

Já o teste de funcionalidade consiste justamente na capacidade de determinar se o que o software foi programado para fazer está de fato fazendo.
Ele pode ser feito tanto manualmente, quanto automaticamente ou mesmo em um misto dos dois. As várias funções são acessadas e testadas de formas diferentes a fim de encontrar falhas ou mesmo possíveis aprimoramentos no que já está sendo executado.

Porque precisamos mapear os casos de testes?

Precisamos mapear os casos de teste de modo a ter de forma clara e acessível todos os pontos necessários que o produto precisa ser testado.
Com os testes mapeados podemos separar eles por versão, podemos automatizar e até usar em testes de regressão.
Os testes mapeados servem também para sempre esta a mão do testador, fazendo com que o mesmo não confie somente em sua memória que muitas das vezes pode o enganar.

Qual a importância de criar os casos de teste pensando na regra de negócio do produto?
Sempre que vamos mapear e criar os casos de teste temos que considerar a regra de negócio, o motivo a qual aquele recurso foi desenvolvido. Dependendo da regra de negócio, um recurso que pode parecer o mesmo em 2 sistemas distintos, pode ter diferenças gigantescas.
Exemplo seria o campo código do produto, esse campo pode permitir letras e caracteres especiais em alguns casos, já em outros somente números.
Outro exemplo poderia ser campo de CPF, em alguns sistemas só permite números em outros permite mascaras.

-------------------------------------------------------

@BeforeClass - Toda vez que for iniciar um teste ele vai ler isso.
@AfterClass  - No final de tudo.

Fiz a migração do Junit 4 para 5.

https://junit.org/junit5/docs/current/user-guide/#migrating-from-junit4
As anotações residem no org.junit.jupiter.apipacote.
As afirmações residem em org.junit.jupiter.api.Assertions.

-------------------------
O maven tambem faz teste no diretorio raiz usar o comando mvn test pelo console.
-------------------------
Fazendo o query no console 
document.querySelector('ul>li>a.nav-link')
------------------------
Extensão extra que foi indicada : Todo Tree
//TODO: 
Comentario que serve para facilitar a vida te leva para onde foi comentado o //TODO
