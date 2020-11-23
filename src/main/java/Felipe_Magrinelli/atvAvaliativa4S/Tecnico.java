package main.java.Felipe_Magrinelli.atvAvaliativa4S;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.management.RuntimeErrorException;
import javax.print.attribute.HashAttributeSet;

public class Tecnico extends Pessoa{
    private Gerente chefe;
    private List<Conservadora> conservadoras = new ArrayList<>();

    public Tecnico(String nome){
        super(nome);
    }
    
    public void setChefe(Gerente chefe){
        if(this.chefe != null){
            throw new RuntimeException(this.getNome() + " já possui um chefe.");
        }else{
            this.chefe = chefe;
        }
    }

    public void addConservadoras(Conservadora conservadora){
        for(Conservadora c : conservadoras){
            if(c.equals(conservadora)){
                throw new RuntimeException("Essa conservadora ja está cadastrada para este técnico!");
            }
        }
        conservadoras.add(conservadora);
    }

    public String getChefe() {
        return chefe.getNome();
    }

    public void getConservadoras() {
        System.out.println("\nConservadoras cadastradas no técnico " + this.getNome());
        System.out.println("===============================================");
        for(Conservadora c : conservadoras){
            System.out.println("Nome: " + c.getNome());
            System.out.println("Id: " + c.getId());
            if(c instanceof ConservadoraDeVacina){
                System.out.println("Tipo: Conservadora de Vacinas");
            }else if(c instanceof ConservadoraDeSemenSuino){
                System.out.println("Tipo: Conservadora de Sêmen Suíno");
            }
            System.out.println("Temperatura Máx: " + c.getTemperaturaMax());
            System.out.println("Temperatura Mín: " + c.getTemperaturaMin());
            System.out.println("|-------------------------------------------------|");
        }
    }
    
    public String toString() {
        if(super.getVeiculo() != null){
            return  "\n======Técnico======" +
                    "\nNome: " + getNome() +
                    "\nId: " + getId() +
                    "\nChefe: " + getChefe() +
                    "\nVeiculo: " + super.getNomeVeiculo();
        }else{
            return  "\n======Técnico======" +
                    "\nNome: " + getNome() +
                    "\nId: " + getId() +
                    "\nChefe: " + getChefe();
        }
    }
}
