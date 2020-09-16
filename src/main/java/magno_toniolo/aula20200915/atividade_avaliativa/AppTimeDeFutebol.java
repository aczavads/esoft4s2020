package magno_toniolo.aula20200915.atividade_avaliativa;

import java.util.List;

public class AppTimeDeFutebol {

    public static void main(String[] args) {
        Time palmeiras = new Time("Palmeiras");
        
        //ADICIONANDO OS JOGADORES
        Jogador weverton = new Jogador("Weverton", 1);
        Jogador felipeMelo = new Jogador("Felipe Melo", 30);
        Jogador gustavoGomez = new Jogador("Gustavo Gómez", 15);
        Jogador marcosRocha = new Jogador("Marcos Rocha", 2);
        Jogador vina = new Jogador("Matías Viña", 17);
        Jogador gabrielMenino = new Jogador("Gabriel Menino", 25);
        Jogador gustavoScarpa = new Jogador("Gustavo Scarpa", 14);
        Jogador patrickDePaula = new Jogador("Patrick de Paula", 5);
        Jogador rony = new Jogador("Rony", 11);
        Jogador willian = new Jogador("Willian", 29);
        Jogador luizAdriano = new Jogador("Luiz Adriano", 10);
        palmeiras.addJogador(weverton);
        palmeiras.addJogador(felipeMelo);
        palmeiras.addJogador(gustavoGomez);
        palmeiras.addJogador(marcosRocha);
        palmeiras.addJogador(vina);
        palmeiras.addJogador(gabrielMenino);
        palmeiras.addJogador(gustavoScarpa);
        palmeiras.addJogador(patrickDePaula);
        palmeiras.addJogador(rony);
        palmeiras.addJogador(willian);
        palmeiras.addJogador(luizAdriano);

        //ADICIONANDO OS TÍTULOS CONQUISTADOS
        TitulosBrasileiros paulista = new TitulosBrasileiros("Paulista", 23);
        TitulosBrasileiros brasileirão = new TitulosBrasileiros("Brasileirão", 10);
        TitulosBrasileiros copaDoBrasil = new TitulosBrasileiros("Copa do Brasil", 3);
        palmeiras.addTitulo(paulista);
        palmeiras.addTitulo(brasileirão);
        palmeiras.addTitulo(copaDoBrasil);

        //ADICIONANDO UM ESTÁDIO PARA O CLUBE
        Estadio allianz = new Estadio("Allianz Parque", "São Paulo", "SP");
        palmeiras.setEstadioDoTime(allianz);
        

        System.out.println("---------- DADOS DO " + palmeiras + ": ----------");
        System.out.println("Estádio: " + allianz);
        System.out.println(" ");
        System.out.println("Lista de Jogadores: ");
        for (Jogador jogador : palmeiras.getJogadoresDoTime()) System.out.println(jogador);
        System.out.println("");
        System.out.println("---------- Lista de títulos do clube: ----------");
        for (TitulosBrasileiros titulos : palmeiras.getTitulosBrasileiros()) System.out.println(titulos);
        


    }
    
    
}
