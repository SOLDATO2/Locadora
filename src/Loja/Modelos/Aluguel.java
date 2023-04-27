package Loja.Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Aluguel{

    private LocalDate dataLocacao; 
    private LocalDate dataDevolucao;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = formatter.format(dataLocacao);
    String dataDevolucaoFormatada = formatter.format(dataDevolucao);

    String nomeFilme;
    int quantidadeAlugado;

    private Cliente ClienteLocador;
    private List<Filme> filmesLocados = new ArrayList<>();

    public Aluguel(Cliente clienteLocadorEntrada){
        this.ClienteLocador = clienteLocadorEntrada;
        this.dataLocacao = LocalDate.now();
        this.dataDevolucao = dataLocacao.plusDays(7);
    }


    public void adicionarFilme(Filme filme){
        this.filmesLocados.add(filme);
    }

    public void adicionarFilmes(List<Filme> filmes){
        this.filmesLocados.addAll(filmes);
    }



    public Aluguel(Cliente clienteLocador, String nomeFilmeTemp,int quantidadeAlugadoTemp,String dataFormatada, String dataDevolucaoFormatada) {
        this.ClienteLocador = clienteLocador;
        this.nomeFilme = nomeFilmeTemp;
        this.quantidadeAlugado = quantidadeAlugadoTemp;
        this.dataFormatada = dataFormatada;
        this.dataDevolucaoFormatada = dataDevolucaoFormatada;
    }


    // getters
    public List<Filme> getFilmesLocados() {
        return filmesLocados;
    }


    public String getDataFormatada() {
        return dataFormatada;
    }


    public String getDataDevolucaoFormatada() {
        return dataDevolucaoFormatada;
    }

    

    




    
   

    
}
