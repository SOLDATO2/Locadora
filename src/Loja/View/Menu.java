package Loja.View;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Loja.Modelos.EstoqueLoja;
import Loja.Modelos.Filme;
import Loja.Modelos.Funcionario;

public class Menu {
    public void menuLoja(){
        EstoqueLoja CDs = new EstoqueLoja();
        EstoqueLoja VHS = new EstoqueLoja();
        List<Funcionario> listaFuncionarios = new ArrayList<>(); // seria necessario exigir a criação de um funcionario antes usar o programa caso esse lista tivesse dentro da classe Funcionario.java
        int escolha;
        String nome;
        String quantidade;
        String nomeIndividuo, cargo, cpf;
        
        Scanner scannerInteiro = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        while(true){
            System.out.println("SISTEMA DE LOCADORA CD/VHS\n----------------------------------------------");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("[1] REGISTRAR UM CD/VHS");
            System.out.println("[2] CONSULTAR ESTOQUE");
            System.out.println("[3] REGISTRAR FUNCIONARIOS");
            System.out.println("[4] CONSULTAR FUNCIONARIOS");
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
                    if(escolha == 1){ // Adiciona Vhs Terror
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSTerror = new Filme(nome, quantidade);
                        VHS.addTerror(VHSTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona Vhs Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSAcao = new Filme(nome, quantidade);
                        VHS.addAcao(VHSAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona Vhs Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerString.nextLine();
                        Filme VHSDrama = new Filme(nome, quantidade);
                        VHS.addDrama(VHSDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona Vhs Comedia
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
                // Consultar CDs    
                if(escolha == 1){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    // Genero Terror
                    if(escolha == 1){
                        if(CDs.getListaDeTerror().isEmpty()) {
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntTerror(CDs);
                        }
                        // Genero Acao
                    }else if(escolha == 2){
                        if(CDs.getListaDeAcao().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntAcao(CDs);
                        }
                        // Genero Drama
                    }else if(escolha == 3){
                        if(CDs.getListaDeDrama().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntDrama(CDs);
                        }
                        // Genero Comedia
                    }else if(escolha == 4){
                        if(CDs.getListaDeComedia().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntComedia(CDs);
                        }
                    }
                    // Consultar VHS 
                }else if(escolha == 2){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){
                        if(VHS.getListaDeTerror().isEmpty()) {
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntTerror(VHS);
                        }
                        // Genero Acao
                    }else if(escolha == 2){
                        if(VHS.getListaDeAcao().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntAcao(VHS);
                        }
                        // Genero Drama
                    }else if(escolha == 3){
                        if(VHS.getListaDeDrama().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntDrama(VHS);
                        }
                        // Genero Comedia
                    }else if(escolha == 4){
                        if(VHS.getListaDeComedia().isEmpty()){
                            System.out.println("Não existe nenhum filme nesta categoria");
                        }else{
                            consultaNomeEQntComedia(VHS);
                        }
                    }
                }
                
            }else if(escolha == 3){
                System.out.println("DIGITE O NOME:");
                nomeIndividuo = scannerString.nextLine();
                System.out.println("DIGITE O CPF:");
                cpf = scannerString.nextLine();
                System.out.println("DIGITE O CARGO"); // talvez mudar esse sistema para o usuario escolher algum cargo pre-estabelecido para facilitar a atribuição no banco de dados na 2a parte do projeto
                cargo = scannerString.nextLine();
                Funcionario funcionario = new Funcionario(nomeIndividuo, cpf, cargo);
                listaFuncionarios.add(funcionario);
                System.out.println("FUNCIONARIO ADICIONADO COM SUCESSO");
            }else if(escolha == 4){
                if(listaFuncionarios.isEmpty()){
                    
                    System.out.println("Não existe nenhum funcionario registrado");

                }else{
                    for (Funcionario item : listaFuncionarios){ // esse é um for mais complexo (for each), daria pra fazer com for simples tmb.
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Nome funcionario: " + item.getNomePessoa());
                        System.out.println("Nome CPF: " + item.getCpfPessoa());
                        System.out.println("Nome cargo: " + item.getCargo());
                        System.out.println("----------------------------------------------------------");
                    }
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
        for(x = 0; x < 100; x++){
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

    private void consultaNomeEQntTerror(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeTerror().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeTerror().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeTerror().get(x).getQnt());
            System.out.println("----------------------------------------------------------");
        }
    }

    private void consultaNomeEQntAcao(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeAcao().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeAcao().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeAcao().get(x).getQnt());
            System.out.println("----------------------------------------------------------");
        }
    }

    private void consultaNomeEQntDrama(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeDrama().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeDrama().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeDrama().get(x).getQnt());
            System.out.println("----------------------------------------------------------");
        }
    }

    private void consultaNomeEQntComedia(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeComedia().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeComedia().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeComedia().get(x).getQnt());
            System.out.println("----------------------------------------------------------");
        }
    }
    
}
