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

                    RegistroEstoque.registroCD(escolha, CDs, VHS, codigoProduto);
                    codigoProduto++;

                    //VHS
                }else if(escolha == 2){

                    RegistroEstoque.registroVHS(escolha, CDs, VHS, codigoProduto);
                    codigoProduto++;

                }
            }else if(escolha == 2){// consultar estoque
                ConsultaEstoque.consultaAluguelFunc(escolha, CDs, VHS);
            }else if(escolha == 3){

                RegistroFuncionario.registroFuncionarioFunc(listaFuncionarios);

            }else if(escolha == 4){
                
                ConsultaFuncionario.consultaFuncionarioFunc(listaFuncionarios);

            }else if(escolha == 5){ // REGISTRO DE CLIENTE ( EFETUAR ALUGUEL)
                if(listasEstaoVazias(CDs, VHS)== true){ // verifica se existe estoque para registrar clientes
                    System.out.println("NÃO É POSSIVEL REGISTRAR CLIENTES POIS NÃO EXISTE FILMES EM ESTOQUE");
                }else{

                    RegistroCliente.registroClienteFunc(CDs, VHS, escolha, cadastroClientes);

                }
                     
            }else if(escolha == 6){// CONSULTA DE ALUGUEIS
                
                ConsultaAluguel.consultaAluguelFunc(CDs, VHS, cadastroClientes);

            }else if(escolha == 7){ // Apagar Clientes

                DevolucaoAluguel.DevolucaoAluguelFunc(cadastroClientes, escolha, CDs, VHS, quantidadeDevolucao);
                
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

    public static void printGeneros(){
        System.out.println("QUAL GENERO?");
        System.out.println("[1] TERROR");
        System.out.println("[2] ACAO");
        System.out.println("[3] DRAMA");
        System.out.println("[4] COMEDIA");
    }

    public static void consultaNomeEQntTerror(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeTerror().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeTerror().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeTerror().get(x).getQnt());
            System.out.println("Codigo do produto: " + qualEstoque.getListaDeTerror().get(x).getCodigoProduto());
            System.out.println("----------------------------------------------------------");
        }
    }

    public static void consultaNomeEQntAcao(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeAcao().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeAcao().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeAcao().get(x).getQnt());
            System.out.println("Codigo do produto: " + qualEstoque.getListaDeTerror().get(x).getCodigoProduto());
            System.out.println("----------------------------------------------------------");
        }
    }

    public static void consultaNomeEQntDrama(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeDrama().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeDrama().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeDrama().get(x).getQnt());
            System.out.println("Codigo do produto: " + qualEstoque.getListaDeTerror().get(x).getCodigoProduto());
            System.out.println("----------------------------------------------------------");
        }
    }

    public static void consultaNomeEQntComedia(EstoqueLoja qualEstoque){
        for(int x = 0; x < qualEstoque.getListaDeComedia().size(); x++){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome do filme: " + qualEstoque.getListaDeComedia().get(x).getNome());
            System.out.println("Quantidade: " + qualEstoque.getListaDeComedia().get(x).getQnt());
            System.out.println("Codigo do produto: " + qualEstoque.getListaDeTerror().get(x).getCodigoProduto());
            System.out.println("----------------------------------------------------------");
        }
    }

    public static Boolean listasEstaoVazias(EstoqueLoja x, EstoqueLoja y){

        if(((x.getListaDeTerror().isEmpty()) && (x.getListaDeAcao().isEmpty()) && (x.getListaDeDrama().isEmpty()) && (x.getListaDeComedia().isEmpty())) && ((y.getListaDeTerror().isEmpty()) && (y.getListaDeAcao().isEmpty()) && (y.getListaDeDrama().isEmpty()) && (y.getListaDeComedia().isEmpty()))){
            return true;
        }else{
            return false;
        }
        
    }

    public static Boolean listasEstaoVaziasUnica(EstoqueLoja x){
        if((x.getListaDeTerror().isEmpty()) && (x.getListaDeAcao().isEmpty()) && (x.getListaDeDrama().isEmpty()) && (x.getListaDeComedia().isEmpty())){
            return true;
        }else{
            return false;
        }
    }
}