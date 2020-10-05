package tiago_lopes_barcelos.atividade20200915.atividade;



public class AppEmergência {

    public static void main(String[] args) {
        
    Paciente joaquim = new Paciente ("Joaquim Silva");

    Chamado emergênciaAmbulância = new Chamado("Acidente Auto x Moto");
    Chamado emergênciaAmbulância2 = new Chamado("Acidente Auto x Moto");

    joaquim.addChamado(emergênciaAmbulância);
    joaquim.addChamado(emergênciaAmbulância2);

    Chamado emergênciaResgate = new Chamado();
    
    System.out.println(joaquim);
    System.out.println(emergênciaAmbulância);
    System.out.println(emergênciaAmbulância2);
    }
    
}
