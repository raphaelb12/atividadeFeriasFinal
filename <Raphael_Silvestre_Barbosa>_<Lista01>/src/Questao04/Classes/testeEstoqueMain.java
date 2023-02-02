package Questao04.Classes;

public class testeEstoqueMain {
    public static void main(String[] args) {
        Produto produto01 = new Produto(1,"teclado");
        Produto produto02 = new Produto(2, "mouse");
        Estoque estoque1 = new Estoque(produto01, 20, 15);
        Estoque estoque2 = new Estoque(produto02,30, 10);
        estoque1.darBaixa(20, 10);
        estoque2.reporEstoque(30,19);
        System.out.println(estoque1.relatorio());
        System.out.println("-----------------------------------------");
        System.out.println(estoque2.relatorio());
        System.out.println("-----------------------------------------");
        System.out.println(produto01.toString());
        System.out.println("--------Troca de nome do Produto 01-------");
        produto01.mudarNome("Teclado Virtual");
        System.out.println(produto01.toString());
        System.out.println("-----------------------------------------");
        System.out.println(estoque1.relatorio());

    }
}
