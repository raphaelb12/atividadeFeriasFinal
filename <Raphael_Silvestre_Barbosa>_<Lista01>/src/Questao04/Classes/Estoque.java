package Questao04.Classes;

public class Estoque {
    private Produto produto;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(Produto produto, int qtdAtual, int qtdMinima)
    {
        this.produto = produto;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {

    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produto=" + produto +
                ", qtdAtual=" + qtdAtual +
                ", qtdMinima=" + qtdMinima +
                '}';
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void reporEstoque(int qtdAtual, int soma) {
        this.qtdAtual = qtdAtual + soma;
    }

    public void darBaixa(int qtdAtual, int subtracao) {
        this.qtdAtual = qtdAtual + subtracao;
    }

    public String relatorio() {
        return "Estoque do produto: " + produto.getNome() +
                ", Quantidade Atual = " + qtdAtual +
                ", Quantidade minima = " + qtdMinima ;
    }

}