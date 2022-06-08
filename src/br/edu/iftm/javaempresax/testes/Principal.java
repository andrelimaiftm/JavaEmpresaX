package br.edu.iftm.javaempresax.testes;

import br.edu.iftm.javaempresax.classes.Departamento;
import br.edu.iftm.javaempresax.classes.Empregado;
import br.edu.iftm.javaempresax.classes.Projeto;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*Empregado empregado01 = new Empregado();
        empregado01.setCodigo(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');

        Date dataInicio = new Date();

        Departamento d = new Departamento(1,"Pesquisa",1, dataInicio);

        empregado01.setDepartamento(d);

        Projeto p = new Projeto(1,"Transmogrifador", d);

        System.out.println(empregado01);
        System.out.println(p);*/

        Scanner teclado = new Scanner(System.in);

        Projeto[] vetorDeProjetos = new Projeto[10];
        int countProjetos = 0;

        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir Todos os Projetos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o codigo do Projeto: ");
                    int codigo = teclado.nextInt();
                    System.out.println("Digite o nome do Projeto: ");
                    String nome = teclado.next();
                    vetorDeProjetos[countProjetos] = new Projeto(codigo,nome,null);
                    countProjetos++;
                    break;
                case 2:
                    //for
                    break;
            }



        } while (opcao != 0);
    }
}
