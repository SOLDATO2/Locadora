package Loja.View;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


import Loja.Modelos.*;

public class Menu {
    public void menuLoja(){
        EstoqueLoja CDs = new EstoqueLoja();
        EstoqueLoja VHS = new EstoqueLoja();

        ControleDeAluguel cadastroClientes = new ControleDeAluguel();
        List<Funcionario> listaFuncionarios = new ArrayList<>(); // seria necessario exigir a criação de um funcionario antes usar o programa caso esse lista tivesse dentro da classe Funcionario.java


        int escolha;
        String nome;
        int quantidade;
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
            System.out.println("[5] REGISTRAR UM ALUGUEL");
            System.out.println("[6] CONSULTAR ALUGUEIS");
            System.out.println("[7] REMOVER ALUGUEL");
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
                        quantidade = scannerInteiro.nextInt();
                        Filme cdTerror = new Filme(nome, quantidade);
                        CDs.addTerror(cdTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona cd Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdAcao = new Filme(nome, quantidade);
                        CDs.addAcao(cdAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona cd Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdDrama = new Filme(nome, quantidade);
                        CDs.addDrama(cdDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona cd Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
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
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSTerror = new Filme(nome, quantidade);
                        VHS.addTerror(VHSTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona Vhs Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSAcao = new Filme(nome, quantidade);
                        VHS.addAcao(VHSAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona Vhs Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSDrama = new Filme(nome, quantidade);
                        VHS.addDrama(VHSDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona Vhs Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
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
                System.out.println("DIGITE O CARGO:"); // talvez mudar esse sistema para o usuario escolher algum cargo pre-estabelecido para facilitar a atribuição no banco de dados na 2a parte do projeto
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
                // FAZER SISTEMA DE CLIENTES 17/04/23
            }else if(escolha == 5){ // REGISTRO DE CLIENTE ( EFETUAR ALUGUEL)
                if(listasEstaoVazias(CDs, VHS)== true){ // verifica se existe estoque para registrar clientes
                    System.out.println("NÃO É POSSIVEL REGISTRAR CLIENTES POIS NÃO EXISTE FILMES EM ESTOQUE");
                }else{



                    String nomeCliente, cpfCliente, numeroCelular;
                    System.out.println("QUAL É O NOME DO CLIENTE?");
                    nomeCliente = scannerString.nextLine();
                    System.out.println("DIGITE O CPF DO CLIENTE:");
                    cpfCliente = scannerString.nextLine();
                    System.out.println("QUAL É O NUMERO DE TELEFONE:");
                    numeroCelular = scannerString.nextLine();

                    
                    int continuar=0;
                    
                    do {
                    
                    System.out.println("ESCOLHA UMA DAS OPCOES:");
                    System.out.println("[1] CDs");
                    System.out.println("[2] VHS");
                    System.out.println("[3] FINALIZAR ALUGUEL");
    
                    escolha = scannerInteiro.nextInt();
                    
                    
                    if(escolha == 1){
                        if(listasEstaoVaziasUnica(CDs) == true){
                            System.out.println("Não é possivel alugar CDs pois o estoque está vazio.");
                        }else{
                            System.out.println("ESCOLHA UM GENERO:");
                            if(!(CDs.getListaDeTerror().isEmpty())){ // mostra as categorias que não estão vazias
                                System.out.println("[1] TERROR");
                            }
                            if(!(CDs.getListaDeAcao().isEmpty())){
                                System.out.println("[2] ACAO");
                            }
                            if(!(CDs.getListaDeDrama().isEmpty())){
                                System.out.println("[3] DRAMA");
                            }
                            if(!(CDs.getListaDeComedia().isEmpty())){
                                System.out.println("[4] COMEDIA");
                            }
    
                            escolha = scannerInteiro.nextInt();
                            int linha = 0;
                            
                            
                          //fazer sistema para pedir quantidade de filmes que o cliente quer alugar. Tambem fazer um if para verificar se a quantidade que o usuario quer
                            // é <= a quantidade de estoque do filme, e por fim subtrair o estoque - quantidadeFilme
                            //Verificar o genero do filme escolhido e fazer um for pra cada lista<genero>
                            
                            
                            //Sistema de aluguel de CDs para cada genero.  Obs: fazer uma continuação caso o cliente queira alugar outro filme do mesmo ou outro genero.
                            //Inserir o cliente na lista de clientes após ter sido criado.
                            
                            
                            //Terror
                            if(escolha == 1){
                                List<Filme> filmesTerror = CDs.getListaDeTerror();
                                for(linha = 0; linha < filmesTerror.size(); linha++){
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + CDs.getListaDeTerror().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ CDs.getListaDeTerror().get(linha).getQnt());//alterado de getNome() pra getQnt
                                    }
                                }
                             
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
    
                                Filme filme = filmesTerror.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
    
                                for(linha = 0; linha < filmesTerror.size(); linha++) {
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= CDs.getListaDeTerror().get(linha).getQnt()) {
                                            
                                            
                                    //Provavelmente remover esta parte e colocar no final apenas uma vez
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);

                                            Aluguel aluguel = new Aluguel(cliente);
                                            aluguel.adicionarFilmes(filmesTerror);
                                            cadastroClientes.adicionar(aluguel);
                                            //Continuar aqui 27/04/23


                                            
                                            
                                            
                                            
                                        //Tirar quantidade pedida do estoque 
                                            
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else{
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
    
                                        }
                                    }
    
                                //Cliente cliente = new Cliente(nomeCliente, cpfCliente, filme.getNome(), quantidade)
    
                                
    
    
                             //Acao
                            }else if(escolha == 2){//case 2
                                List<Filme> filmesAcao = CDs.getListaDeAcao();
                                for(linha = 0; linha < CDs.getListaDeAcao().size(); linha++){
                                    if(CDs.getListaDeAcao().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + CDs.getListaDeAcao().get(linha).getNome());
                                        System.out.println("Quantidade: "+ CDs.getListaDeAcao().get(linha).getQnt());
                                    }
                                }
                                
                              //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
    
                                Filme filme = filmesAcao.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesAcao.size(); linha++) {
                                    if(filmesAcao.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= CDs.getListaDeAcao().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!\n");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
    
                                        }
                                    }
                                
                                //Drama
                            }else if(escolha == 3){//case 3
                                List<Filme> filmesDrama = CDs.getListaDeDrama();
                                for(linha = 0; linha < CDs.getListaDeDrama().size(); linha++){
                                    if(CDs.getListaDeDrama().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + CDs.getListaDeDrama().get(linha).getNome());
                                        System.out.println("Quantidade: "+ CDs.getListaDeDrama().get(linha).getQnt());
                                    }
                                }
                                
                              //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
    
                                Filme filme = filmesDrama.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesDrama.size(); linha++) {
                                    if(filmesDrama.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= CDs.getListaDeDrama().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
    
                                        }
                                    }
                                
                                
                                
                                //Comedia
                            }else if(escolha == 4){
                                List<Filme> filmesComedia = CDs.getListaDeComedia();
                                for(linha = 0; linha < CDs.getListaDeComedia().size(); linha++){
                                    if(CDs.getListaDeComedia().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + CDs.getListaDeComedia().get(linha).getNome());
                                        System.out.println("Quantidade: "+ CDs.getListaDeComedia().get(linha).getQnt());
                                    }
                                }
                                
                              //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
    
                                Filme filme = filmesComedia.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesComedia.size(); linha++) {
                                    if(filmesComedia.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= CDs.getListaDeComedia().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
    
                                        }
                                    }
                            } 
                            
                            //
                            
                        }
                        
                        
                        
                        
                        
                        //
                        
                        
                        
                        //Aluguel de VHS
                    }else if(escolha == 2){
                        if(listasEstaoVaziasUnica(VHS) == true){
                            System.out.println("Não é possivel alugar VHS pois o estoque está vazio.");
                        }else{
                                System.out.println("ESCOLHA UM GENERO:");
                                if(!(VHS.getListaDeTerror().isEmpty())){ // mostra as categorias que não estão vazias
                                    System.out.println("[1] TERROR");
                                }
                                if(!(VHS.getListaDeAcao().isEmpty())){
                                    System.out.println("[2] ACAO");
                                }
                                if(!(VHS.getListaDeDrama().isEmpty())){
                                    System.out.println("[3] DRAMA");
                                }
                                if(!(VHS.getListaDeComedia().isEmpty())){
                                    System.out.println("[4] COMEDIA");
                                }
                            
                            
                            escolha = scannerInteiro.nextInt();
                            int linha = 0;
                            
                            //Terror
                            //Fazer continuação e inserir na lista de clientes.
                            if(escolha == 1){
                                List<Filme> filmesTerror = VHS.getListaDeTerror();
                                for(linha = 0; linha < filmesTerror.size(); linha++){
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + VHS.getListaDeTerror().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ VHS.getListaDeTerror().get(linha).getQnt());//alterado de getNome() pra getQnt
                                    }
                                }
                            
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
        
                                Filme filme = filmesTerror.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesTerror.size(); linha++) {
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= VHS.getListaDeTerror().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
        
                                        }
                                    }
        
                                //Cliente cliente = new Cliente(nomeCliente, cpfCliente, filme.getNome(), quantidade)
        
                                
        
        
                            //Acao
                            }else if(escolha == 2){
                                List<Filme> filmesAcao = VHS.getListaDeAcao();
                                for(linha = 0; linha < VHS.getListaDeAcao().size(); linha++){
                                    if(VHS.getListaDeAcao().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + VHS.getListaDeAcao().get(linha).getNome());
                                        System.out.println("Quantidade: "+ VHS.getListaDeAcao().get(linha).getQnt());
                                    }
                                }
                                
                            //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
        
                                Filme filme = filmesAcao.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesAcao.size(); linha++) {
                                    if(filmesAcao.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= VHS.getListaDeAcao().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
        
                                        }
                                    }
                                
                                //Drama
                            }else if(escolha == 3){
                                List<Filme> filmesDrama = VHS.getListaDeDrama();
                                for(linha = 0; linha < VHS.getListaDeDrama().size(); linha++){
                                    if(VHS.getListaDeDrama().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + VHS.getListaDeDrama().get(linha).getNome());
                                        System.out.println("Quantidade: "+ VHS.getListaDeDrama().get(linha).getQnt());
                                    }
                                }
                                
                            //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
        
                                Filme filme = filmesDrama.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesDrama.size(); linha++) {
                                    if(filmesDrama.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= VHS.getListaDeDrama().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
        
                                        }
                                    }
                                
                                
                                
                                //Comedia
                            }else if(escolha == 4){
                                List<Filme> filmesComedia = VHS.getListaDeComedia();
                                for(linha = 0; linha < VHS.getListaDeComedia().size(); linha++){
                                    if(VHS.getListaDeComedia().get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("Nome: " + VHS.getListaDeComedia().get(linha).getNome());
                                        System.out.println("Quantidade: "+ VHS.getListaDeComedia().get(linha).getQnt());
                                    }
                                }
                                
                            //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
        
                                Filme filme = filmesComedia.get(escolha);
                                
                                
                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                for(linha = 0; linha < filmesComedia.size(); linha++) {
                                    if(filmesComedia.get(linha).getQnt() > 0){
                                        if(quantidadeFilme<= VHS.getListaDeComedia().get(linha).getQnt()) {
                                    
                                            Cliente cliente = new Cliente(nomeCliente, cpfCliente,filme.getNome(),quantidadeFilme,dataFormatada, dataDevolucaoFormatada);
                                            listaClientes.add(cliente);
                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                        }else {
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                            }
        
                                        }
                                    }
                            }
                        }
                        
                    }
                    
                    //ESSA PARTE TA MEIO SUSPEITA, DA PRA FAZER COM BOOL MAS EU NAO ESTOU ACOSTUMADO
                        if(escolha==3) {
                            continuar=1;
                            System.out.println("REGISTRO DE ALUGUEL ENCERRADO\n");
                        }
                    
                    }while(continuar!=1);//Loop para alugar mais filmes
                }
                
                
                
             
                
                
                
                
            }else if(escolha == 6){// CONSULTA DE ALUGUEIS
                if(listasEstaoVazias(CDs, VHS) == true){
                    System.out.println("Não é possivel registrar um aluguel pois não existe nenhum filme em estoque.");
                }else if(listaClientes.isEmpty()){
                    System.out.println("Não é possivel consultar um aluguel pois não existe nenhum cliente registrado.");
                }else{
            			//Data do aluguel e prazo de devolucao
            			
            			
                		System.out.println("CONSULTA DE ALUGUEIS");
                	for (Cliente item : listaClientes){ // esse é um for mais complexo (for each), daria pra fazer com for simples tmb.
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Nome cliente: " + item.getNomePessoa());
                        System.out.println("CPF: " + item.getCpfPessoa());
                        //Adicionar for para nome do filme e qntd
                        System.out.println("Nome do filme alugado: " + item.getNomeFilmeAlugado()+" qtd:" + item.getQuantidadeAlugado());
                        System.out.println("Data do aluguel: " + item.getDataAlugado());
                        System.out.println("Data de devolucao: " + item.getDataDevolucao());
                        System.out.println("----------------------------------------------------------");
                    }
                }
            }else if(escolha == 7){ // Apagar Clientes
                if(listaClientes.isEmpty()){
                    System.out.println("NÃO É POSSIVEL EFETUAR DEVOLUÇÃO POIS NÃO EXISTE ALUGUEIS REGISTRADOS");
                }else{
                    int contador = 0;
                    System.out.println("LISTANDO CLIENTES:");
                    for (Cliente item : listaClientes){ // esse é um for mais complexo (for each), daria pra fazer com for simples tmb.
                        System.out.println("----------------------------------------------------------");
                        System.out.println("["+contador+"]");
                        System.out.println("Nome cliente: " + item.getNomePessoa());
                        System.out.println("CPF: " + item.getCpfPessoa());
                        //Adicionar for para nome do filme e qntd
                        System.out.println("Nome do filme alugado: " + item.getNomeFilmeAlugado()+" qtd:" + item.getQuantidadeAlugado());
                        System.out.println("Data do aluguel: " + item.getCpfPessoa());;
                        System.out.println("Data de devolucao: " + item.getCpfPessoa());
                        System.out.println("----------------------------------------------------------");
                        contador++;
                    }

                    System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                    escolha = scannerInteiro.nextInt();
                    //Falta devolver quantidade que cliente alugou para estoque (25/04/23)
                    listaClientes.remove(escolha);
                    System.out.println("ALUGUEL APAGADO COM SUCESSO");
                }
                
            }else if(escolha == 0){ // Terminar Programa
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

    private Boolean listasEstaoVazias(EstoqueLoja x, EstoqueLoja y){

        if(((x.getListaDeTerror().isEmpty()) && (x.getListaDeAcao().isEmpty()) && (x.getListaDeDrama().isEmpty()) && (x.getListaDeComedia().isEmpty())) && ((y.getListaDeTerror().isEmpty()) && (y.getListaDeAcao().isEmpty()) && (y.getListaDeDrama().isEmpty()) && (y.getListaDeComedia().isEmpty()))){
            return true;
        }else{
            return false;
        }
        
    }

    private Boolean listasEstaoVaziasUnica(EstoqueLoja x){
        if((x.getListaDeTerror().isEmpty()) && (x.getListaDeAcao().isEmpty()) && (x.getListaDeDrama().isEmpty()) && (x.getListaDeComedia().isEmpty())){
            return true;
        }else{
            return false;
        }
    }
    
}




