package WesleyBoer.AtividadeAvaliativaPOO;

public class AppLocadora {
    public static void main(String[] args) {

        Bike bmx = new Bike("BMX" , 300.00); // construtor alternativo
        Bike mountainBike = new Bike(); // construtor padrão

        Moto bis = new Moto("Bis" , 5000.00); // construtor alternativo
        Moto cb1000 = new Moto(); // construtor padrão

        System.out.println(bmx.getTipoDaBike());
        System.out.println(mountainBike.getTipoDaBike());
        System.out.println(bis.getTipoDaBike());
        System.out.println(cb1000.getTipoDaBike());
    }
    

}
