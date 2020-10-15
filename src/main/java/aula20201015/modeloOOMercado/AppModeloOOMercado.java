package aula20201015.modeloOOMercado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class AppModeloOOMercado {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa uniCesumar = new Juridica("Universidade Cesumar - UNICESUMAR","01.554.654/0001-66");
        Pessoa wilson = new Fisica("Wilson Matos", "554.665.997-44");

        pessoas.add(uniCesumar);
        pessoas.add(wilson);

        wilson.setReitor(new Reitor("ATO_2020_023A"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nova pessoa: ");
            System.out.println(pessoa.getClass().getName());
            System.out.println("É reitor? " + pessoa.isReitor());
            if (pessoa.isReitor()) {
                System.out.println("Número do ato da posse: " + pessoa.getReitor().getNúmeroAtoDaPosse());
            }
            System.out.println();
        }





    }

    private static void testandoUUIDs() {
        Set<String> ids = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            ids.add(UUID.randomUUID().toString());
        }
        System.out.println("IDs armazenados no Set=" +ids.size());
    }
    
}
