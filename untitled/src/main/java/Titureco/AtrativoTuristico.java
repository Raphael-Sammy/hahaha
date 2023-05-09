package Titureco;

import java.util.Objects;

//extends - classe
//implements - interface
public class AtrativoTuristico extends TiturecoList{

    private String nome;

    private double latitude;

    private double longitude;

    private String comoChegar;

    private String cidade;

    private String estado;


    public AtrativoTuristico(){
}

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado){
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, latitude, longitude, comoChegar, cidade, estado);
    }

    public boolean equals(Object obj){

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public String comoChegar(){
        return comoChegar;
    }

    public void setComoChegar(String comoChegar){
        this.comoChegar = comoChegar;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}