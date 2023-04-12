package Loja.Programa;
import Loja.Tipos.*;

public class Programa {
    public static void main(String[] args){
        EstoqueLoja CDs = new EstoqueLoja();
        Filme CdTerrorGenerico = new Filme("Olhos Famintos", "2");

        //adiciona objeto criado na lista terror da classe "CDs" de tipo Filme
        CDs.addTerror(CdTerrorGenerico);

        System.out.println(CDs.getListaDeTerror().get(0).getNome());
        System.out.println(CDs.getListaDeTerror().get(0).getQnt());

        //TESTANDO PUSH REQUEST

    }
}
