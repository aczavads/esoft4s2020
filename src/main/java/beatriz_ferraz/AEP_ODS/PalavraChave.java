package beatriz_ferraz.AEP_ODS;

import javax.management.RuntimeErrorException;

public class PalavraChave {
    
    private String palavra;

    public PalavraChave(String palavra) {
        setPalavra(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        if(palavra == null || palavra.trim().length() <= 1) {
           throw new RuntimeException("Não configura uma palavra.");
        }
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return palavra;
    }
}
