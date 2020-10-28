package aula20201022.modeloOOMercado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class AppModeloOOMercado {

    public static void main(String[] args) {
        Produto álcoolGel5l = new Produto("Álcool gel 70% glicerinado aroma de cravo 5L");
        Produto álcoolGel1l = new Produto("Álcool gel 70% glicerinado aroma de cravo 1L");

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa uniCesumar = new Juridica("Universidade Cesumar - UNICESUMAR","01.554.654/0001-66");
        Pessoa wilson = new Fisica("Wilson Matos", "554.665.997-44");

        pessoas.add(uniCesumar);
        pessoas.add(wilson);

        wilson.assumirPapel(new Reitor("ATO_2020_023A"));
        wilson.assumirPapel(new Cliente(10.00, 1_000_000.00));
        //wilson.assumirPapel(new Cliente(10.00, 1_000_000.00));
        //aqui deve lançar uma RuntimeException: não pode ter o mesmo tipo de papel mais de uma vez!
        //wilson.assumirPapel(new Reitor("ATO_2020_023A")); 
        //uniCesumar.assumirPapel(new Cliente(0.00, 5_000_000.00));

        Pedido p1 = new Pedido(1, uniCesumar);
        p1.adicionarItem(álcoolGel5l, 1, 80.00);
        p1.adicionarItem(álcoolGel1l, 2, 15.00);

        System.out.println("Valor total do p1 = " + p1.getValorTotal());

        //for (Pessoa pessoa : pessoas) {
        for (int i=0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
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
