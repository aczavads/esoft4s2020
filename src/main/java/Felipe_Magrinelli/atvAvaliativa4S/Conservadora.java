package main.java.Felipe_Magrinelli.atvAvaliativa4S;

import java.util.UUID;

public abstract class Conservadora{
    private String id;
    private String nome;
    private double temperaturaMax;
    private double temperaturaMin;

    public Conservadora(){
        this.id = UUID.randomUUID().toString();
    }

    public Conservadora(String nome){
        this();
        this.nome = nome;
    }

    public void setTemperaturas(double tempMin, double tempMax){
        this.temperaturaMax = tempMax;
        this.temperaturaMin = tempMin;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }
}