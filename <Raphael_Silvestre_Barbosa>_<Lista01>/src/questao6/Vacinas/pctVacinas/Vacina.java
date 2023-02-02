package questao6.Vacinas.pctVacinas;

import questao6.Vacinas.pctVacinas.Nome;

public class Vacina {
    //Apagar main
    private int codigo;
    private Nome nome;
    private String lote;

    public Vacina(int codigo, Nome nome, String lote)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.lote = lote;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "codigo=" + codigo +
                ", nome=" + nome +
                ", lote='" + lote + '\'' +
                '}';
    }


}
