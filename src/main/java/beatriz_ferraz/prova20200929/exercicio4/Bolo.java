package beatriz_ferraz.prova20200929.exercicio4;

public class Bolo {
   private String estadoDoBolo; //cru > assando > assado...
   private boolean oBoloEstaProntoParaComer; 
   private String aceitaCafe = "sim";  //inicialização de variável para teste

   public Bolo(String estadoDoBolo) {
        setEstadoDoBolo(estadoDoBolo);
        setOBoloEstaProntoParaComer(estadoDoBolo, oBoloEstaProntoParaComer);
        setAceitaCafe();
   }

   public void setEstadoDoBolo(String estadoDoBolo) {
        if(estadoDoBolo != "cru" && estadoDoBolo != "assando" && estadoDoBolo != "assado") {
            throw new RuntimeException("Estado inválido.");
        }
        this.estadoDoBolo = estadoDoBolo;
   }

   public String getEstadoDoBolo() {
        return estadoDoBolo;
   }

   public void setOBoloEstaProntoParaComer(String estadoDoBolo, boolean oBoloEstaProntoParaComer) {
        if(estadoDoBolo == "assado") {
            oBoloEstaProntoParaComer = true;
            
        }
        else {
            oBoloEstaProntoParaComer = false;
        }
        this.oBoloEstaProntoParaComer = oBoloEstaProntoParaComer;
   }

   
   public boolean getOBoloEstaProntoParaComer() {
        return oBoloEstaProntoParaComer;
   }

   public boolean setAceitaCafe() {
        if(aceitaCafe == "sim") {
            return true;    
        }
        else {
            return false;
        }
   }

    public String getAceitaCafe() {
        return aceitaCafe;
    }
}

