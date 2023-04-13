package Loja.View;
import java.util.Scanner;

import Loja.Modelos.EstoqueLoja;
import Loja.Modelos.Filme;

public class Menu {
    public void menuLoja(){
        EstoqueLoja CDs = new EstoqueLoja();
        EstoqueLoja VHS = new EstoqueLoja();
        int escolha;
        String nome;
        String quantidade;
        
        Scanner scannerInteiro = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        while(true){
            System.out.println("SISTEMA DE LOCADORA CD/VHS\n----------------------------------------------");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("[1] REGISTRAR UM CD/VHS");
            System.out.println("[2] CONSULTAR ESTOQUE");
            System.out.println("[0] SAIR E APAGAR LOJA");
            escolha = scannerInteiro.nextInt();
            // CDs
            if(escolha == 1){
                System.out.println("DESEJA REGISTRAR UM CD OU VHS?");
                System.out.println("[1] CD");
                System.out.println("[2] VHS");
                escolha = scannerInteiro.nextInt();
                if(escolha == 1){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){ // Adiciona cd Terror
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme cdTerror = new Filme(nome, quantidade);
                        CDs.addTerror(cdTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona cd Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme cdAcao = new Filme(nome, quantidade);
                        CDs.addAcao(cdAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona cd Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme cdDrama = new Filme(nome, quantidade);
                        CDs.addDrama(cdDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona cd Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme cdComedia = new Filme(nome, quantidade);
                        CDs.addComedia(cdComedia);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }
                    //VHS
                }else if(escolha == 2){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){ // Adiciona cd Terror
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSTerror = new Filme(nome, quantidade);
                        VHS.addTerror(VHSTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona cd Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSAcao = new Filme(nome, quantidade);
                        VHS.addAcao(VHSAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona cd Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSDrama = new Filme(nome, quantidade);
                        VHS.addDrama(VHSDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona cd Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSComedia = new Filme(nome, quantidade);
                        VHS.addComedia(VHSComedia);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }
                }
            }else if(escolha == 2){
                System.out.println("QUAL ESTOQUE GOSTARIA DE CONSULTAR?");
                System.out.println("[1] CD");
                System.out.println("[2] VHS");
                escolha = scannerInteiro.nextInt();
                // Consultar DVDs   ***CONTINUAR A DESENVOLVER AQUI 13/04/23** 
                if(escolha == 1){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){
                        if(CDs.getListaDeTerror().isEmpty()) {
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            for(int x = 0; x < CDs.getListaDeTerror().size(); x++){
                                System.out.println("Nome do filme: " + CDs.getListaDeTerror().get(x).getNome());
                                System.out.println("Quantidade: " + CDs.getListaDeTerror().get(x).getQnt());
                                System.out.println("\n");
                            }
                        }
                    }
                }else if(escolha == 2){
                    System.out.println("Ainda não foi feito");
                }
                
            }else if(escolha == 0){
                scannerInteiro.close();
                scannerString.close();
                break;
            }else{
                System.out.println("Escolha Invalida.");
                limpaConsole();
            }
        }
    }


    // Funcoes
    private void limpaConsole(){
        int x;
        for(x = 0; x < 50; x++){
            System.out.println(" \n");
        }
    }

    private void printGeneros(){
        System.out.println("QUAL GENERO?");
        System.out.println("[1] TERROR");
        System.out.println("[2] ACAO");
        System.out.println("[3] DRAMA");
        System.out.println("[4] COMEDIA");
    }
    
}
