package main.java.Felipe_Magrinelli.atvAvaliativa4S;

import java.util.UUID;

public class Veiculo {
    private String id;
    private String nome;
    private String placa;
    private Pessoa motorista;

    public Veiculo(){
        this.id = UUID.randomUUID().toString();
    }

    public Veiculo(String nome, String placa){
        this();
        this.placa = placa;
        this.nome = nome;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMotorista() {
        return motorista.getNome();
    }

    public String getPlaca() {
        return placa;
    }

    public String toString() {
        return  "======Veículo======" +
                "\nIdentificação: " + getNome() +
                "\nId: " + getId() +
                "\nPlaca: " + getPlaca() +
                "\nMotorista: " + getMotorista();
                
    }
}
