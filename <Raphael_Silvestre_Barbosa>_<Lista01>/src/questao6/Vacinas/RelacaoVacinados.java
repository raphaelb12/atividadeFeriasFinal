package questao6.Vacinas;


import questao6.Vacinas.pctRegistroVacina.Dose;
import questao6.Vacinas.pctRegistroVacina.Grupo;
import questao6.Vacinas.pctRegistroVacina.RegistroVacina;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RelacaoVacinados extends Grupo {

    private RegistroVacina registroVacina;
    private ArrayList<RegistroVacina> vacinados;

    public RelacaoVacinados(RegistroVacina registroVacina){
        this.registroVacina = registroVacina;
        this.vacinados = new ArrayList<>();
    }

    public void adicionar(RegistroVacina vacinados){
        this.vacinados.add(vacinados);
    }


    public void totaldeIdososQueTomaram2aDose() {
        for (int i = 0; i <this.vacinados.size() ; i++) {
            RegistroVacina old = new RegistroVacina();
            old = this.vacinados.get(i);
             int x = 0;
            if(old.getGrupo() == idosos){
                if(old.getDose() == 2){
                    x += 1;
                }
            }
            if(x > 0){
            int y = x;
            System.out.println(y);}
        }

    }

    public void listarPessoasQueNaoTomaram2aDose(){
        System.out.printf("%-20s|%13s|%12s|%13s\n", "CPF", "Nome", "Idade", "Data indicada p. 2a Dose");
        for (int i = 0; i < 79; i++) System.out.printf("-");
        System.out.println();
        for (int i = 0; i <this.vacinados.size() ; i++) {
            RegistroVacina sem2a = new RegistroVacina();
            sem2a = this.vacinados.get(i);
                if(sem2a.getDose() == Dose.d2){
                    break;
                }
            else{
                    String dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(sem2a.getData_vacinacao().plusDays(21));
                System.out.printf("%-20s|%13s|%12s|%25s\n", sem2a.getPessoa().getCpf(), sem2a.getId(), sem2a.getPessoa().calcularIdade(), dataFormatada);
            }

        }
        for (int h = 0; h < 79; h++) System.out.printf("-");
        System.out.println();
    }

    public double calcularTotalVacinadosAcimaDe(int idade){
        double z = 0;
        for (RegistroVacina fe: vacinados) {
            if(fe.getPessoa().calcularIdade() >= idade){
                if(fe.getDose() == Dose.d2){
                    int v = 1;
                }
                else {
                    z += 1;
                }
            }
        }
        return z;
    }

    public int nPessoasQueNaoTomaram2aDose() {
        int z = 0;
        for (int i = 0; i < this.vacinados.size(); i++) {
            RegistroVacina sem2a = new RegistroVacina();
            sem2a = this.vacinados.get(i);
            if (sem2a.getDose() == Dose.d2) {
                break;
            } else {
                z += 1;
            }

        }
        return z;
    }

    public int numPessoasQueTomaram2aDose() {
        int z = 0;
        for (int i = 0; i < this.vacinados.size(); i++) {
            RegistroVacina sem2a = new RegistroVacina();
            sem2a = this.vacinados.get(i);
            if (sem2a.getDose() == Dose.d2) {
                z += 1;
            }
        }
        return z;
    }



    @Override
    public String toString() {
        return "RelacaoVacinados{\n\n" +
                "registroVacina=" + registroVacina +
                ", vacinados=" + vacinados +
                "\n }";
    }


}
