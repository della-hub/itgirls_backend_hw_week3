package hw_week3.entity;

public class Car {

    String carColor;
    String carBrand;

    public static void main(String[] args){
        Car bmw = new Car();
        bmw.carColor = "green";
        bmw.carBrand = "BMW";

        Car volkswagen = new Car();
        volkswagen.carColor = "black";
        volkswagen.carBrand = "VW";

        Car skoda = new Car();
        skoda.carColor = "gray";
        skoda.carBrand = "Skoda";

        System.out.println("В автопарке стоит машина марки " + bmw.carBrand + " цвета "+ bmw.carColor );
        System.out.println("В автопарке стоит машина марки " + volkswagen.carBrand +" цвета "+ volkswagen.carColor);
        System.out.println("В автопарке стоит машина марки " + skoda.carBrand + " цвета "+ skoda.carColor );

    }

}