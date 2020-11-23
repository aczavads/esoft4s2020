package main.java.Felipe_Magrinelli.atvAvaliativa4S;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class AppAtividade {
    public static void main(String[] args) {


        Tecnico felipe = new Tecnico("Felipe");
        Gerente tadeu = new Gerente("Tadeu");
        Veiculo saveiro = new Veiculo("Saveiro","AUV-4203");
        Veiculo argo = new Veiculo("Argo", "AOV-1904");
        
        felipe.setChefe(tadeu);
        tadeu.addTecnicoGerenciado(felipe);
        //tadeu.addTecnicoGerenciado(felipe); --> está validando, não deixa inserir duas vezes

        saveiro.setMotorista(tadeu);
        tadeu.setVeiculo(saveiro);
        
        argo.setMotorista(felipe);
        felipe.setVeiculo(argo);
        
        Conservadora ConsGranjaSchoeler = new ConservadoraDeSemenSuino("Cons. Granja Schoeler");
        Conservadora ConsAgromina = new ConservadoraDeVacina("Cons. Agromina Vacinas");
        felipe.addConservadoras(ConsGranjaSchoeler);
        felipe.addConservadoras(ConsAgromina);
        //felipe.addConservadoras(ConsGranjaSchoeler); --> está validando, não deixa inserir suas vezes
        felipe.getConservadoras();

        System.out.println(tadeu.toString());
        System.out.println(felipe.toString());
        
    }
}
