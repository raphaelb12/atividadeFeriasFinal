package Questao04.Classes;

public class Produto {
    private int codigo;
    private String nome;

    public Produto(int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo = " + codigo +
                ", nome= '" + nome + '\'' +
                '}';
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }
}

