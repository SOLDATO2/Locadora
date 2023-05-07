package Loja.Modelos;

public class Filme {




    private String nome;
    private int quantidade;
    private int codigoProduto;
    



    //constructor
    public Filme(String nomeQualquer, int quantidadeQualquer, int codigoProdutoQualquer) {
        this.nome = nomeQualquer;
        this.quantidade = quantidadeQualquer;
        this.codigoProduto = codigoProdutoQualquer;
    }


    //getter
    public String getNome() {
        return nome;
    }

    public int getQnt(){
        return quantidade;
    }
    
    public int getCodigoProduto(){
        return codigoProduto;
    }

	public void setQnt(int qtdPedido) {
		this.quantidade = quantidade-qtdPedido;
	}

    public void setQntEstoque(int quantidade){
        this.quantidade = quantidade;

    }

    


}


