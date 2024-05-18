package hw_week3.entity;

public class CarConstructor {
    String carBrand;
    String carColor;

    public CarConstructor(String carBrand, String carColor) {
        this.carBrand = carBrand;
        this.carColor = carColor;
    }
    public static void main (String[] args) {
        CarConstructor bmw = new CarConstructor("bmw", "green");
        CarConstructor renault = new CarConstructor ("renault", "blue");

        System.out.println("В автопарке стоит машина марки " + bmw.carBrand + " цвета "+ bmw.carColor );
        System.out.println("В автопарке стоит машина марки " + renault.carBrand +" цвета "+ renault.carColor);
    }
}

