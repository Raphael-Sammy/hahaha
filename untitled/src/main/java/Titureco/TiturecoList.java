package Titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface{

    private List<AtrativoTuristico> atrativo;

    public TiturecoList(){
        this.atrativo = new ArrayList<>();
    }

    public boolean cadastrarAtrativo(AtrativoTuristico atrativo){
    }

    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado){
    }

    public List<AtrativoTuristico> getAtrativos(){
    }

    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado){
    }

}
