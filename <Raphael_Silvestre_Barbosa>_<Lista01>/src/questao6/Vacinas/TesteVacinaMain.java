package questao6.Vacinas;

import questao6.Vacinas.pctRegistroVacina.Dose;
import questao6.Vacinas.pctRegistroVacina.Grupo;
import questao6.Vacinas.pctRegistroVacina.Local;
import questao6.Vacinas.pctRegistroVacina.RegistroVacina;
import questao6.Vacinas.pctVacinas.Nome;
import questao6.Vacinas.pctVacinas.Vacina;

import java.time.LocalDate;




public class TesteVacinaMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("0333787383", Grupo.idosos, LocalDate.of(1954,1,23));
        Pessoa pessoa2 = new Pessoa("3830333787", Grupo.outros, LocalDate.of(1952,4,12));
        Pessoa pessoa3 = new Pessoa("7870333383", Grupo.idosos, LocalDate.of(1950,3,10));
        Pessoa pessoa4 = new Pessoa("3787303383", Grupo.idosos, LocalDate.of(1955, 2, 28));
        Pessoa pessoa5 = new Pessoa("98657914567", Grupo.outros, LocalDate.of(1950,4,1));
        Vacina oxford = new Vacina(697, Nome.OXFORD, "432-5");
        Vacina coronavac = new Vacina(361, Nome.CORONAVAC, "245-7");
        //----------------------------------------------------------------------------
        RegistroVacina aJoseM = new RegistroVacina();
        RegistroVacina aMariaJ = new RegistroVacina();
        RegistroVacina aJoseS = new RegistroVacina();
        RegistroVacina aMariaS = new RegistroVacina();
        RegistroVacina aMartaM = new RegistroVacina();
        RegistroVacina aMartaM2 = new RegistroVacina();
        //RegistroVacina JoseM = new RegistroVacina("Jose Maria", LocalDate.of(2021,4,22), "Izaura", Dose.d1, Local.arruda, Grupo.idosos, pessoa1, oxford);
        aJoseM.setId("Jose Maria");
        aJoseM.setData_vacinacao(LocalDate.of(2021, 4, 22));
        aJoseM.setAtendente("Izaura");
        aJoseM.setDose(Dose.d1);
        aJoseM.setLocal(Local.arruda);
        aJoseM.setGrupo(Grupo.idosos);
        aJoseM.setPessoa(pessoa1);
        aJoseM.setVacina(oxford);
        //RegistroVacina MariaJ = new RegistroVacina("Maria Jose", LocalDate.of(2021,4,25), "Amanda", Dose.d1, Local.geraldao, Grupo.outros, pessoa2, oxford);
        aMariaJ.setId("Maria Jose");
        aMariaJ.setData_vacinacao(LocalDate.of(2021,4,25));
        aMariaJ.setAtendente("Amanda");
        aMariaJ.setDose(Dose.d1);
        aMariaJ.setLocal(Local.arruda);
        aMariaJ.setGrupo(Grupo.idosos);
        aMariaJ.setPessoa(pessoa2);
        aMariaJ.setVacina(oxford);
        // RegistroVacina JoseS = new RegistroVacina("Jose Silva", LocalDate.of(2021,4,24), "Marcos", Dose.d1, Local.geraldao, Grupo.idosos, pessoa3, oxford);
        aJoseS.setId("Jose Silva");
        aJoseS.setData_vacinacao(LocalDate.of(2021, 4, 24));
        aJoseS.setAtendente("Marcos");
        aJoseS.setDose(Dose.d1);
        aJoseS.setLocal(Local.geraldao);
        aJoseS.setGrupo(Grupo.idosos);
        aJoseS.setPessoa(pessoa3);
        aJoseS.setVacina(oxford);
        //RegistroVacina MariaS = new RegistroVacina("Maria Silva", LocalDate.of(2021,4,30), "Marilia", Dose.d1, Local.compaz, Grupo.idosos, pessoa4, coronavac);
        aMariaS.setId("Maria Silva");
        aMariaS.setData_vacinacao(LocalDate.of(2021,4 ,30));
        aMariaS.setAtendente("Marilia");
        aMariaS.setDose(Dose.d1);
        aMariaS.setLocal(Local.compaz);
        aMariaS.setGrupo(Grupo.idosos);
        aMariaS.setPessoa(pessoa4);
        aMariaS.setVacina(coronavac);
        //RegistroVacina MartaM = new RegistroVacina("Marta Motta", LocalDate.of(2021,4,29), "Leticia", Dose.d1, Local.parque, Grupo.idosos, pessoa5, coronavac);
        aMartaM.setId("Marta Motta");
        aMartaM.setData_vacinacao(LocalDate.of(2021,4,29));
        aMartaM.setAtendente("Leticia");
        aMartaM.setDose(Dose.d1);
        aMartaM.setLocal(Local.parque);
        aMartaM.setGrupo(Grupo.idosos);
        aMartaM.setPessoa(pessoa5);
        aMartaM.setVacina(coronavac);
        //RegistroVacina MartaM2 = new RegistroVacina("Marta Motta", LocalDate.of(2021,5,20), "Paulo", Dose.d2, Local.parque, Grupo.idosos, pessoa5, coronavac);
        aMartaM2.setId("Marta Motta");
        aMartaM2.setData_vacinacao(LocalDate.of(2021, 5,  20));
        aMartaM2.setAtendente("Paulo");
        aMartaM2.setDose(Dose.d2);
        aMartaM2.setLocal(Local.parque);
        aMartaM2.setGrupo(Grupo.idosos);
        aMartaM2.setPessoa(pessoa5);
        aMartaM2.setVacina(coronavac);
        //----------------------------------------------------------------------------
        RelacaoVacinados listaVacinados = new RelacaoVacinados(aJoseM);
        listaVacinados.adicionar(aJoseM);
        listaVacinados.adicionar(aMariaJ);
        listaVacinados.adicionar(aJoseS);
        listaVacinados.adicionar(aMariaS);
        listaVacinados.adicionar(aMartaM2);
        listaVacinados.adicionar(aMartaM);

        //-------------------------Impressão-------------------------//
        listaVacinados.listarPessoasQueNaoTomaram2aDose();
        System.out.println("Total de vacinados acima de 65: " + listaVacinados.calcularTotalVacinadosAcimaDe(65));
        System.out.println("Total de vacinados que não tomaram a 2a Dose: " + listaVacinados.nPessoasQueNaoTomaram2aDose());
        System.out.println("Total de vacinados que tomaram a 2a Dose: " + listaVacinados.numPessoasQueTomaram2aDose());

    }
}
