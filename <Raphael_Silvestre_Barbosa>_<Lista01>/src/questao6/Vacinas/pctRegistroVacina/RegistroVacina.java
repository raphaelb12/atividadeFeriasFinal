package questao6.Vacinas.pctRegistroVacina;

import questao6.Vacinas.Pessoa;
import questao6.Vacinas.pctVacinas.Vacina;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RegistroVacina {
    //Apagar main
    private String id;
    private LocalDate data_vacinacao;
    private String atendente;
    private int dose;
    private String local;
    private String grupo;
    private Pessoa pessoa;
    private Vacina vacina;

    public RegistroVacina(String id, LocalDate data_vacinacao, String atendente, int dose, String local, String grupo, Pessoa pessoa,Vacina vacina)
    {
        this.id = id;
        this.data_vacinacao = data_vacinacao;
        this.atendente = atendente;
        this.dose = dose;
        this.local = local;
        this.grupo = grupo;
        this.pessoa = pessoa;
        this.vacina = vacina;
    }
    public RegistroVacina(){

    }

    public String getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData_vacinacao() {
        return data_vacinacao;
    }

    public void setData_vacinacao(LocalDate data_vacinacao) {
        this.data_vacinacao = data_vacinacao;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "RegistroVacina{" +
                "id='" + id + '\'' +
                ", data_vacinacao=" + data_vacinacao +
                ", atendente='" + atendente + '\'' +
                ", dose=" + dose +
                ", local='" + local + '\'' +
                ", grupo='" + grupo + '\'' +
                ", pessoa=" + pessoa +
                ", vacina=" + vacina +
                '}';
    }
    public String toStringPessoa() {
        return
                "CPF: " + pessoa.getCpf() + " Grupo: " + pessoa.getGrupo() + " Data de Nascimento: " + pessoa.getDataNascimento() ;
    }




}
