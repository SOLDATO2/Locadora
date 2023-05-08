package Loja.View;
import Loja.Modelos.EstoqueLoja;
import Loja.Modelos.Filme;
import java.util.Scanner;

public class RegistroEstoque {
    

    // Este é um exemplo de sub menu que será implementado(apos terminar o trabalho) em Menu.java no lugar da primeira opção
    // essa classe vai gerar um objeto em menu.java, daria para fazer sem ser objeto, mas como exemplo eu achei melhor deixar como um objeto.
    // basta escrever RegistroEstoque registroEstoque = new RegistroEstoque(escolha, CDs, VHS); em menu e apagar o resto de codigo.
    // o programa ira indicar que o objeto não esta sendo usado

    private static String nome;
    private static int quantidade;
    

    static Scanner scannerInteiro = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    

    public static void registroCD(int escolha, EstoqueLoja tipoEstoqueCD, EstoqueLoja tipoEstoqueVHS, int codigoProduto) {
                    System.out.println("QUAL GENERO?");
                    System.out.println("[1] TERROR");
                    System.out.println("[2] ACAO");
                    System.out.println("[3] DRAMA");
                    System.out.println("[4] COMEDIA");
                    escolha = scannerInteiro.nextInt();
                    if(escolha == 1){ // Adiciona cd Terror
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdTerror = new Filme(nome, quantidade, codigoProduto); 
                        tipoEstoqueCD.addTerror(cdTerror);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                    }else if(escolha == 2){ // Adiciona cd Acao
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdAcao = new Filme(nome, quantidade, codigoProduto);
                        tipoEstoqueCD.addAcao(cdAcao);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                    }else if(escolha == 3){ // Adiciona cd Drama
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdDrama = new Filme(nome, quantidade, codigoProduto);
                        tipoEstoqueCD.addDrama(cdDrama);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                    }else if(escolha == 4){ // Adiciona cd Comedia
                        System.out.println("QUAL É O NOME DO FILME?");
                        nome = scannerString.nextLine();
                        System.out.println("QUAL É A QUANTIDADADE?");
                        quantidade = scannerInteiro.nextInt();
                        Filme cdComedia = new Filme(nome, quantidade, codigoProduto);
                        tipoEstoqueCD.addComedia(cdComedia);
                        System.out.println("CD ADICIONADO COM SUCESSO!");
                    }
        
                }
    public static void registroVHS(int escolha, EstoqueLoja tipoEstoqueCD, EstoqueLoja tipoEstoqueVHS, int codigoProduto){
                System.out.println("QUAL GENERO?");
                System.out.println("[1] TERROR");
                System.out.println("[2] ACAO");
                System.out.println("[3] DRAMA");
                System.out.println("[4] COMEDIA");
                escolha = scannerInteiro.nextInt();
                if(escolha == 1){ // Adiciona Vhs Terror
                    System.out.println("QUAL É O NOME DO FILME?");
                    nome = scannerString.nextLine();
                    System.out.println("QUAL É A QUANTIDADADE?");
                    quantidade = scannerInteiro.nextInt();
                    Filme VHSTerror = new Filme(nome, quantidade, codigoProduto);
                    tipoEstoqueVHS.addTerror(VHSTerror);
                    System.out.println("CD ADICIONADO COM SUCESSO!");
                }else if(escolha == 2){ // Adiciona Vhs Acao
                    System.out.println("QUAL É O NOME DO FILME?");
                    nome = scannerString.nextLine();
                    System.out.println("QUAL É A QUANTIDADADE?");
                    quantidade = scannerInteiro.nextInt();
                    Filme VHSAcao = new Filme(nome, quantidade, codigoProduto);
                    tipoEstoqueVHS.addAcao(VHSAcao);
                    System.out.println("CD ADICIONADO COM SUCESSO!");
                }else if(escolha == 3){ // Adiciona Vhs Drama
                    System.out.println("QUAL É O NOME DO FILME?");
                    nome = scannerString.nextLine();
                    System.out.println("QUAL É A QUANTIDADADE?");
                    quantidade = scannerInteiro.nextInt();
                    Filme VHSDrama = new Filme(nome, quantidade, codigoProduto);
                    tipoEstoqueVHS.addDrama(VHSDrama);
                    System.out.println("CD ADICIONADO COM SUCESSO!");
                }else if(escolha == 4){ // Adiciona Vhs Comedia
                    System.out.println("QUAL É O NOME DO FILME?");
                    nome = scannerString.nextLine();
                    System.out.println("QUAL É A QUANTIDADADE?");
                    quantidade = scannerInteiro.nextInt();
                    Filme VHSComedia = new Filme(nome, quantidade, codigoProduto);
                    tipoEstoqueVHS.addComedia(VHSComedia);
                    System.out.println("CD ADICIONADO COM SUCESSO!");
                }
    }
}

    


