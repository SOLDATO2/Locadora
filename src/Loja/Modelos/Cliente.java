package Loja.Modelos;

public class Cliente extends Pessoa{

    int quantidadeAlugado;
    String nomeFilmeAlugado;

    public Cliente(String nomePessoa, String cpfPessoa, String nomeFilmeAlugadoCliente, int quantidadeAlugadoCliente) {
        super(nomePessoa, cpfPessoa);
        this.nomeFilmeAlugado = nomeFilmeAlugadoCliente;
        this.quantidadeAlugado = quantidadeAlugadoCliente;
    }


    
    //getters
    
    public int getQuantidadeAlugado() {
        return quantidadeAlugado;
    }


    public String getNomeFilmeAlugado() {
        return nomeFilmeAlugado;
    }
}
