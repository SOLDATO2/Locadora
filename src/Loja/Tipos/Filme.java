package Loja.Tipos;

public class Filme {
    private String nome;
    private String quantidade;


    //constructor
    public Filme(String nomeQualquer, String quantidadeQualquer) {
        this.nome = nomeQualquer;
        this.quantidade = quantidadeQualquer;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public String getQnt(){
        return quantidade;
    }



}


