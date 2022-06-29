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

        //int[] vetor = new int[5];

        Projeto[] vetorDeProjetos = new Projeto[5];

        int contadorProjeto = 0;

        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir Todos os Projetos");
            System.out.println("3 - Buscar Projeto por Id");
            System.out.println("4 - Buscar Projeto por Nome");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = teclado.nextInt();

            boolean temProjeto;

            switch (opcao){
                case 1:
                    if(contadorProjeto < 5){
                        System.out.println("Digite o codigo do Projeto: ");
                        int codigo = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Digite o nome do Projeto: ");
                        String nome = teclado.nextLine();
                        Projeto p = new Projeto(codigo, nome, null);
                        vetorDeProjetos[contadorProjeto] = p;
                        //vetorDeProjetos[contadorProjeto] = new Projeto(codigo,nome,null);
                        contadorProjeto++;
                    }else{
                        System.out.println("Vetor de projetos está cheio!");
                    }

                    break;
                case 2:
                    for (Projeto obj: vetorDeProjetos) {
                        if(obj != null){
                            System.out.println(obj);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o codigo do projeto ");
                    temProjeto = false;
                    int codigoProj = teclado.nextInt();
                    for ( Projeto obj : vetorDeProjetos ) {
                        if(obj != null && obj.getCodigo() == codigoProj){
                            System.out.println(obj);
                            temProjeto = true;
                        }
                    }
                    if(temProjeto == false){
                        System.out.println("Não existe projeto para esse codigo");
                    }
                    break;
                case 4:
                    teclado.nextLine();
                    System.out.println("Digite o titulo do Projeto");
                    String tituloProjeto = teclado.nextLine();
                    temProjeto = false;
                    for ( Projeto obj : vetorDeProjetos ) {
                        if(obj != null && obj.getTitulo().equals(tituloProjeto)){
                            System.out.println(obj);
                            temProjeto = true;
                        }
                    }
                    if(temProjeto == false){
                        System.out.println("Não existe projeto para esse titulo");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
