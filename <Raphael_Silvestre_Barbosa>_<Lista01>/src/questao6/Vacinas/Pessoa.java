package questao6.Vacinas;





import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String cpf;
    private String grupo;
    private LocalDate dataNascimento;

    public Pessoa(String cpf, String grupo, LocalDate dataNascimento){
        this.cpf = cpf;
        this.grupo = grupo;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(){

    }

    public long calcularIdade()
    {
        LocalDate anoAtual = LocalDate.of(2021, 6, 30);
        long idade = dataNascimento.until(anoAtual, ChronoUnit.YEARS);
        //System.out.println(idade);
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String nome) {
        this.grupo = grupo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", grupo='" + grupo + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
