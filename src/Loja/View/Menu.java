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

        int quantidadeDevolucao = 0; // variavel que sera usada para devolver qnt alugada para o estoque 
        int escolha, codigoProduto = 100; // escolha menu e codigo que sera distribuido para cada produto 
        String nome; // nome filme que sera registrado
        int quantidade; // quantidade filme que sera registrado
        String nomeIndividuo, cargo, cpf; // informacoes gerais para registrar nomes, cpf e cargos
        
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
                        Filme cdTerror = new Filme(nome, quantidade, codigoProduto); 
                        CDs.addTerror(cdTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona cd Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdAcao = new Filme(nome, quantidade, codigoProduto);
                        CDs.addAcao(cdAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona cd Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdDrama = new Filme(nome, quantidade, codigoProduto);
                        CDs.addDrama(cdDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona cd Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdComedia = new Filme(nome, quantidade, codigoProduto);
                        CDs.addComedia(cdComedia);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }
                    codigoProduto++;
                    //VHS
                }else if(escolha == 2){
                    printGeneros();
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){ // Adiciona Vhs Terror
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSTerror = new Filme(nome, quantidade, codigoProduto);
                        VHS.addTerror(VHSTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 2){ // Adiciona Vhs Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSAcao = new Filme(nome, quantidade, codigoProduto);
                        VHS.addAcao(VHSAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 3){ // Adiciona Vhs Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSDrama = new Filme(nome, quantidade, codigoProduto);
                        VHS.addDrama(VHSDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }else if(escolha == 4){ // Adiciona Vhs Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme VHSComedia = new Filme(nome, quantidade, codigoProduto);
                        VHS.addComedia(VHSComedia);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                        limpaConsole();
                    }
                    codigoProduto++;
                }
            }else if(escolha == 2){// consultar estoque
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
                    
                    String tipo;
                    String genero;
                    if(escolha == 1){
                        tipo = "CDs";
                        if(listasEstaoVaziasUnica(CDs) == true){//fazer mais um if se a quantidade em estoque estiver zerada.
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
                            
                            //Terror
                            if(escolha == 1){
                                genero = "Terror";
                                List<Filme> filmesTerror = CDs.getListaDeTerror();
                                for(linha = 0; linha < filmesTerror.size(); linha++){
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + CDs.getListaDeTerror().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ CDs.getListaDeTerror().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                                
                                
                                if(filmesTerror.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= CDs.getListaDeTerror().get(escolha).getQnt()) {
                                
                                	CDs.getListaDeTerror().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, CDs.getListaDeTerror().get(escolha).getNome(), quantidadeFilme, tipo, genero, CDs.getListaDeTerror().get(escolha).getCodigoProduto()); // codigo de produto armazena o codigo do produto para identificar onde esta o estoque do filme para futuras exclusoes
                                          
                                            
                                    aluguel.adicionarFilmes(filmesTerror);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                }else if (quantidadeFilme > CDs.getListaDeTerror().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");

                                }
                                
                               }else {
                            	   System.out.println("OPCAO INVALIDA!");
                               }
                            
                             //Acao
                            }else if(escolha == 2){
                                genero = "Acao";
                                List<Filme> filmesAcao = CDs.getListaDeAcao();
                                for(linha = 0; linha < filmesAcao.size(); linha++){
                                    if(filmesAcao.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + CDs.getListaDeAcao().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ CDs.getListaDeAcao().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();

                                if(filmesAcao.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= CDs.getListaDeAcao().get(escolha).getQnt()) {
                                
                                	CDs.getListaDeAcao().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, CDs.getListaDeAcao().get(escolha).getNome(), quantidadeFilme, tipo, genero, CDs.getListaDeAcao().get(escolha).getCodigoProduto());
                                            
                                    aluguel.adicionarFilmes(filmesAcao);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > CDs.getListaDeAcao().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");

                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }
                                
                                //Drama
                            }else if(escolha == 3){
                                genero = "Drama";
                                List<Filme> filmesDrama = CDs.getListaDeDrama();
                                for(linha = 0; linha < filmesDrama.size(); linha++){
                                    if(filmesDrama.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + CDs.getListaDeDrama().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ CDs.getListaDeDrama().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                                
                                
                                if(filmesDrama.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= CDs.getListaDeDrama().get(escolha).getQnt()) {
                                
                                	CDs.getListaDeDrama().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, CDs.getListaDeDrama().get(escolha).getNome(), quantidadeFilme, tipo, genero, CDs.getListaDeDrama().get(escolha).getCodigoProduto());
                                            
                                            //Terminar primeiro para o genero terror e depois copiar para os outros 
                                          
                                            
                                    aluguel.adicionarFilmes(filmesDrama);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > CDs.getListaDeDrama().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");

                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }

                                //Comedia
                            }else if(escolha == 4){
                                genero = "Comedia";
                                List<Filme> filmesComedia = CDs.getListaDeComedia();
                                for(linha = 0; linha < filmesComedia.size(); linha++){
                                    if(filmesComedia.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + CDs.getListaDeComedia().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ CDs.getListaDeComedia().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                        
                                
                                if(filmesComedia.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= CDs.getListaDeComedia().get(escolha).getQnt()) {
                                
                                	CDs.getListaDeComedia().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, CDs.getListaDeComedia().get(escolha).getNome(), quantidadeFilme, tipo, genero, CDs.getListaDeComedia().get(escolha).getCodigoProduto());
                                    
                                    aluguel.adicionarFilmes(filmesComedia);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > CDs.getListaDeComedia().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }
                            
                            }
                        
                        }

                        
                        //Aluguel de VHS
                    }else if(escolha == 2){
                        tipo = "VHS";
                        if(listasEstaoVaziasUnica(VHS) == true){//fazer mais um if se a quantidade em estoque estiver zerada.
                            System.out.println("Não é possivel alugar CDs pois o estoque está vazio.");
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
                            if(escolha == 1){
                                genero = "Terror";
                                List<Filme> filmesTerror = VHS.getListaDeTerror();
                                for(linha = 0; linha < filmesTerror.size(); linha++){
                                    if(filmesTerror.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + VHS.getListaDeTerror().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ VHS.getListaDeTerror().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                             
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                            
                                
                                if(filmesTerror.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= VHS.getListaDeTerror().get(escolha).getQnt()) {
                                
                                	VHS.getListaDeTerror().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, VHS.getListaDeTerror().get(escolha).getNome(), quantidadeFilme, tipo, genero, VHS.getListaDeTerror().get(escolha).getCodigoProduto());

                                    aluguel.adicionarFilmes(filmesTerror);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > VHS.getListaDeTerror().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }
                            
                             //Acao
                            }else if(escolha == 2){
                                genero = "Acao";
                                List<Filme> filmesAcao = VHS.getListaDeAcao();
                                for(linha = 0; linha < filmesAcao.size(); linha++){
                                    if(filmesAcao.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + VHS.getListaDeAcao().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ VHS.getListaDeAcao().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                             
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                        
                                
                                if(filmesAcao.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= VHS.getListaDeAcao().get(escolha).getQnt()) {
                                
                                	VHS.getListaDeAcao().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, VHS.getListaDeAcao().get(escolha).getNome(), quantidadeFilme, tipo, genero, VHS.getListaDeTerror().get(escolha).getCodigoProduto());
                                          
                                            
                                    aluguel.adicionarFilmes(filmesAcao);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");
                                }else if (quantidadeFilme > VHS.getListaDeAcao().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");

                                }
                                
                               }else {
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                               }
                                
                                //Drama
                               }else if(escolha == 3){
                                genero = "Drama";
                                List<Filme> filmesDrama = VHS.getListaDeDrama();
                                for(linha = 0; linha < filmesDrama.size(); linha++){
                                    if(filmesDrama.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + VHS.getListaDeDrama().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ VHS.getListaDeDrama().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }
                                
                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                            
                                
                                if(filmesDrama.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= VHS.getListaDeDrama().get(escolha).getQnt()) {
                                
                                	VHS.getListaDeDrama().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, VHS.getListaDeDrama().get(escolha).getNome(), quantidadeFilme, tipo, genero, VHS.getListaDeDrama().get(escolha).getCodigoProduto());
                                           
                                    aluguel.adicionarFilmes(filmesDrama);
                                    cadastroClientes.adicionar(aluguel);

                                    System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > VHS.getListaDeDrama().get(escolha).getQnt()){
                                    
                                    System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                    System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");
                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }

                                //Comedia
                            }else if(escolha == 4){
                                genero = "Comedia";
                                List<Filme> filmesComedia = VHS.getListaDeComedia();
                                for(linha = 0; linha < filmesComedia.size(); linha++){
                                    if(filmesComedia.get(linha).getQnt() > 0){
                                        System.out.println("["+linha+"]"+":");
                                        System.out.println("NOME: " + VHS.getListaDeComedia().get(linha).getNome());
                                        System.out.println("QUANTIDADE: "+ VHS.getListaDeComedia().get(linha).getQnt());
                                    }else {
                                    	System.out.println("DIGITE 0 PARA SAIR: ");
                                    }
                                }

                                //Escolhe o filme da lista
                                System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                                escolha = scannerInteiro.nextInt();
                            
                                
                                if(filmesComedia.get(escolha).getQnt() > 0){

                                System.out.println("INFORME A QUANTIDADE DESEJADA: ");
                                int quantidadeFilme = scannerInteiro.nextInt();
                                
                                if (quantidadeFilme <= VHS.getListaDeComedia().get(escolha).getQnt()) {
                                
                                	VHS.getListaDeComedia().get(escolha).setQnt(quantidadeFilme);//Remove a quantidade pedida do estoque
                                            
                                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, numeroCelular);
                                    Aluguel aluguel = new Aluguel(cliente, VHS.getListaDeComedia().get(escolha).getNome(), quantidadeFilme, tipo, genero, VHS.getListaDeComedia().get(escolha).getCodigoProduto());
                                                   
                                    aluguel.adicionarFilmes(filmesComedia);
                                    cadastroClientes.adicionar(aluguel);

                                            System.out.println("ALUGUEL FEITO COM SUCESSO!");//mudar isso aqui
                                }else if (quantidadeFilme > VHS.getListaDeComedia().get(escolha).getQnt()){
                                    
                                            System.out.println("NAO FOI POSSIVEL FAZER O ALUGUEL!");
                                            System.out.println("QUANTIDADE EM ESTOQUE MENOR DO QUE A DESEJADA");

                                }
                                
                               }else {
                            	   
                            	   System.out.println("OPCAO INVALIDA!");
                            	   //System.out.println("SEM ESTOQUE PARA O FILME: " + CDs.getListaDeTerror().get(escolha).getNome());
                            	   
                               }
                            
                            //
                            
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
                }else if(cadastroClientes.getAlugueis().isEmpty()){
                    System.out.println("Não é possivel consultar um aluguel pois não existe nenhum cliente registrado.");
                }else{
            			//Data do aluguel e prazo de devolucao
            			
            			
                		System.out.println("CONSULTA DE ALUGUEIS");
                	for (Aluguel item  : cadastroClientes.getAlugueis()){ // esse é um for mais complexo (for each), daria pra fazer com for simples tmb.
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Nome cliente: " + item.getCliente().getNomePessoa());
                        System.out.println("CPF: " + item.getCliente().getCpfPessoa());
                        System.out.println("Numero de Celular: "+ item.getCliente().getNumeroCeluar());
                        //Adicionar for para nome do filme e qntd
                        System.out.println("Nome do filme alugado: " + item.getNomeFilme()+" qtd:" + item.getQuantidadeAlugado());
                        System.out.println("Codigo do produto alugado: " + item.getCodigoProdutoAluguel());
                        System.out.println("Data do aluguel: " + item.getDataFormatada());
                        System.out.println("Data de devolucao: " + item.getDataDevolucaoFormatada());
                        System.out.println("----------------------------------------------------------");
                    }
                }
            }else if(escolha == 7){ // Apagar Clientes
                if(cadastroClientes.getAlugueis().isEmpty()){
                    System.out.println("NÃO É POSSIVEL EFETUAR DEVOLUÇÃO POIS NÃO EXISTE ALUGUEIS REGISTRADOS");
                }else{
                    int contador = 0;
                    System.out.println("LISTANDO CLIENTES:");
                    for (Aluguel item : cadastroClientes.getAlugueis()){ // esse é um for mais complexo (for each), daria pra fazer com for simples tmb.
                        System.out.println("----------------------------------------------------------");
                        System.out.println("["+contador+"]");
                        System.out.println("Nome cliente: " + item.getCliente().getNomePessoa());
                        System.out.println("CPF: " + item.getCliente().getCpfPessoa());
                        System.out.println("Numero de Celular: "+ item.getCliente().getNumeroCeluar());
                        //Adicionar for para nome do filme e qntd
                        System.out.println("Nome do filme alugado: " + item.getNomeFilme()+" qtd:" + item.getQuantidadeAlugado());
                        System.out.println("Codigo do produto alugado: " + item.getCodigoProdutoAluguel());
                        System.out.println("Data do aluguel: " + item.getDataFormatada());
                        System.out.println("Data de devolucao: " + item.getDataDevolucaoFormatada());
                        System.out.println("----------------------------------------------------------");
                        contador++;
                    }

                    System.out.println("ESCOLHA UMA OPÇÃO (0, 1, 2, etc...):");
                    escolha = scannerInteiro.nextInt();
                    //Falta devolver quantidade que cliente alugou para estoque (25/04/23)
                    
                    //CDs
                    if(cadastroClientes.getAlugueis().get(escolha).getTipo() == "CDs"){
                        if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Terror"){
                            for(int x = 0; x < CDs.getListaDeTerror().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == CDs.getListaDeTerror().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeTerror().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    CDs.getListaDeTerror().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }

                            

                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Acao"){
                            for(int x = 0; x < CDs.getListaDeAcao().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == CDs.getListaDeAcao().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeAcao().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    CDs.getListaDeAcao().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }

                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Drama"){
                            for(int x = 0; x < CDs.getListaDeDrama().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == CDs.getListaDeDrama().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeDrama().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    CDs.getListaDeDrama().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }

                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Comedia"){
                            for(int x = 0; x < CDs.getListaDeComedia().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == CDs.getListaDeComedia().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeComedia().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    CDs.getListaDeComedia().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }
                        }
                    }else if(cadastroClientes.getAlugueis().get(escolha).getTipo() == "VHS"){
                        if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Terror"){
                            for(int x = 0; x < VHS.getListaDeComedia().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == VHS.getListaDeComedia().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeComedia().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    VHS.getListaDeComedia().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }
                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Acao"){
                            for(int x = 0; x < VHS.getListaDeAcao().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == VHS.getListaDeAcao().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeAcao().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    VHS.getListaDeAcao().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }
                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Drama"){
                            for(int x = 0; x < VHS.getListaDeDrama().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == VHS.getListaDeDrama().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeDrama().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    VHS.getListaDeDrama().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }
                        }else if(cadastroClientes.getAlugueis().get(escolha).getGenero() == "Comedia"){
                            for(int x = 0; x < VHS.getListaDeComedia().size(); x++){
                                if(cadastroClientes.getAlugueis().get(escolha).getCodigoProdutoAluguel() == VHS.getListaDeComedia().get(x).getCodigoProduto()){ // compara o codigo de produto que o cliente alugou com o codigo que tem em estoque
                                    quantidadeDevolucao = 0;
                                    quantidadeDevolucao = CDs.getListaDeComedia().get(x).getQnt();
                                    quantidadeDevolucao += cadastroClientes.getAlugueis().get(escolha).getQuantidadeAlugado();


                                    VHS.getListaDeComedia().get(x).setQntEstoque(quantidadeDevolucao);
                                }
                            }
                        }
                    }
                    
                    cadastroClientes.getAlugueis().remove(escolha);
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




