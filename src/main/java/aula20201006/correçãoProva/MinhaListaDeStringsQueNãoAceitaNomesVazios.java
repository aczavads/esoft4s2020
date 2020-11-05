package aula20201006.correçãoProva;

import java.util.ArrayList;

public class MinhaListaDeStringsQueNãoAceitaNomesVazios extends ArrayList<String> {

    @Override
    public boolean add(String e) {
        if (e != null && e.trim().length() == 0) {
            return false;
        }
        return super.add(e);
    }

}
