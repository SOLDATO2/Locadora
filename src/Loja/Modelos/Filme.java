package Loja.Modelos;

public class Filme {
    private String nome;
    private int quantidade;


    //constructor
    public Filme(String nomeQualquer, int quantidadeQualquer) {
        this.nome = nomeQualquer;
        this.quantidade = quantidadeQualquer;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public int getQnt(){
        return quantidade;
    }



}


