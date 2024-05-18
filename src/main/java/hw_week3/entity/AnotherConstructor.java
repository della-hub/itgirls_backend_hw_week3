package hw_week3.entity;

public class AnotherConstructor {
    String carBrand;
    String carColor;


    public static void main (String[] args) {
        AnotherConstructor bmw = new AnotherConstructor();
        bmw.carBrand = "bmw";
        bmw.carColor="green";

        AnotherConstructor renault = new AnotherConstructor();
        renault.carColor="blue";
        renault.carBrand="renault";

        System.out.println("В автопарке стоит машина марки " + bmw.carBrand + " цвета "+ bmw.carColor );
        System.out.println("В автопарке стоит машина марки " + renault.carBrand +" цвета "+ renault.carColor);
    }
}
