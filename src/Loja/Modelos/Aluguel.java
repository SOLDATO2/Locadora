package Loja.Modelos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;


public class Aluguel{

    private LocalDate dataLocacao = LocalDate.now();
    private LocalDate dataDevolucao = dataLocacao.plusDays(7);;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String dataFormatada = formatter.format(dataLocacao);
    private String dataDevolucaoFormatada = formatter.format(dataDevolucao);

    String nomeFilme, tipo, genero;
    int quantidadeAlugado, codigoProduto;

    private Cliente ClienteLocador;
    private List<Filme> filmesLocados = new ArrayList<>(); // ainda nao esta sendo usado. 4/27/23

    public Aluguel(Cliente clienteLocadorEntrada, String nomeFilmeTemp, int quantidadeAlugadoTemp, String tipoTemp, String generoTemp, int codigoProdutoTemp){
        this.ClienteLocador = clienteLocadorEntrada;
        this.nomeFilme = nomeFilmeTemp;
        this.quantidadeAlugado = quantidadeAlugadoTemp;
        this.tipo = tipoTemp;
        this.genero = generoTemp;
        this.codigoProduto = codigoProdutoTemp;
        /* 
        this.dataLocacao = LocalDate.now();
        this.dataDevolucao = dataLocacao.plusDays(7);*/ 
        
        // manter a data deste jeito resulta no erro:

        /*Exception in thread "main" java.lang.NullPointerException: temporal
        at java.base/java.util.Objects.requireNonNull(Objects.java:235)
        at java.base/java.time.format.DateTimeFormatter.formatTo(DateTimeFormatter.java:1844)
        at java.base/java.time.format.DateTimeFormatter.format(DateTimeFormatter.java:1823)
        at Loja.Modelos.Aluguel.<init>(Aluguel.java:14)
        at Loja.View.Menu.menuLoja(Menu.java:314)
        at Loja.Programa.Programa.main(Programa.java:6) */
    }

    //adiciona unico filme
    public void adicionarFilme(Filme filme){
        this.filmesLocados.add(filme);
    }
    //adiciona varios filmes de uma vez
    public void adicionarFilmes(List<Filme> filmes){
        this.filmesLocados.addAll(filmes);
    }



    // getters 
    //(Sistema para adicionar mais de 1 filme, ainda nao esta sendo utilizado 4/27/23)
    public List<Filme> getFilmesLocados() {
        return filmesLocados;
    }

    

    public String getNomeFilme() {
        return nomeFilme;
    }


    public int getQuantidadeAlugado() {
        return quantidadeAlugado;
    }


    public Cliente getCliente() {
        return ClienteLocador;
    }


    public String getDataFormatada() {
        return dataFormatada;
    }


    public String getDataDevolucaoFormatada() {
        return dataDevolucaoFormatada;
    }

    public String getTipo(){
        return tipo;
    }

    public String getGenero(){
        return genero;
    }

    public int getCodigoProdutoAluguel(){
        return codigoProduto;
    }

    

    




    
   

    
}
