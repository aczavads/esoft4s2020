package beatriz_ferraz.prova20200929.exercicio4;


public class AppExercicioQuatro {
    
    public static void main(String[] args) {
       
        Bolo novoBolo = new Bolo("assado");
        
        System.out.println("Estado do bolo: " + novoBolo.getEstadoDoBolo());
        System.out.println("O bolo está pronto para comer? " 
                            + novoBolo.getOBoloEstaProntoParaComer());
        System.out.println("Aceita café? " + novoBolo.setAceitaCafe());
    }
}    
