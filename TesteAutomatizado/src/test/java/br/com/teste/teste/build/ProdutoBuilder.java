package br.com.teste.teste.build;

import br.com.teste.teste.page.ProdutoPo;

public class ProdutoBuilder {

    private String codigo = "00001";
    private String nome = "Produto Padrao";
    private Integer quantidade = 1;
    private Double valor = 1.0;
    private String data = "03/11/2021";

    private ProdutoPo produtoPo;

    public ProdutoBuilder(ProdutoPo produtoPo) {
        this.produtoPo = produtoPo;
    }

    public ProdutoBuilder adicionarCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ProdutoBuilder adicionarNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder adicionarQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public ProdutoBuilder adicionarValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public ProdutoBuilder adicionarData(String data) {
        this.data = data;
        return this;
    }

    public void builder() {

        produtoPo.escrever(produtoPo.inputCodigo, codigo);
        produtoPo.escrever(produtoPo.inputNome, nome);
        produtoPo.escrever(produtoPo.inputQuantidade, (quantidade != null) ? quantidade.toString() : "");
        produtoPo.escrever(produtoPo.inputValor, (valor != null) ? valor.toString() : "");
        produtoPo.escrever(produtoPo.inputData, data);

        produtoPo.btnSalvar.click();
    }

}
