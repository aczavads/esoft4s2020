package aula20201103.repository;

import java.util.UUID;

public class Pilha {

    private String id;
	private String marca;
    private String modelo;
    private int amperagem;

    public Pilha(String marca, String modelo, int amperagem) {
        id = UUID.randomUUID().toString();
        this.marca = marca;
        this.modelo = modelo;
        this.amperagem = amperagem;
    }
    public int getAmperagem() {
        return amperagem;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getId() {
        return id;
    }
    public String toString() {
        return "Pilha [marca=" + marca + "], modelo=" + modelo + "], amperagem=" + amperagem + "]";
    }

}
