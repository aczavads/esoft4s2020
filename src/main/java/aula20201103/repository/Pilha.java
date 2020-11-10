package aula20201103.repository;

import java.util.UUID;

public class Pilha {

    private String id;
	private String marca;
    private String modelo;
    private int amperagem;

    public Pilha() {
        id = UUID.randomUUID().toString();
    }

    public Pilha(String marca, String modelo, int amperagem) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.amperagem = amperagem;
    }
    public Pilha(String id, String marca, String modelo, int amperagem) {
        this(marca, modelo, amperagem);
        this.id = id;
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
