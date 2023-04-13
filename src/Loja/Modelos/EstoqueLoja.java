package Loja.Modelos;

import java.util.List;
import java.util.ArrayList;

public class EstoqueLoja {
    
    // listas dinamicas de generos
    private List<Filme> listaDeTerror = new ArrayList<>();
    private List<Filme> listaDeAcao = new ArrayList<>();
    private List<Filme> listaDeDrama = new ArrayList<>();
    private List<Filme> listaDeComedia = new ArrayList<>();

    
    
    public void addTerror(Filme terror){
        //adiciona um futuro objeto cd terror que pode ser criado para lista dinamica de terror
        listaDeTerror.add(terror);
    }

    public void addAcao(Filme acao){
        listaDeAcao.add(acao);
    }

    public void addDrama(Filme drama){
        listaDeDrama.add(drama);
    }

    public void addComedia(Filme comedia){
        listaDeComedia.add(comedia);
    }


    //getters
    public List<Filme> getListaDeTerror() {
        return listaDeTerror;
    }


    public List<Filme> getListaDeAcao() {
        return listaDeAcao;
    }


    public List<Filme> getListaDeDrama() {
        return listaDeDrama;
    }


    public List<Filme> getListaDeComedia() {
        return listaDeComedia;
    }

    
    
    



}
