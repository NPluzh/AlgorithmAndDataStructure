package homework2;

import java.util.Comparator;

public class Notebook  {
    private double price;
private int ram;
private Brand brand;

    public Notebook() {
        this.price = getRandPrice();
        this.ram = getRandRam();
        this.brand = getRandBrand();
    }

    private Brand getRandBrand() {
        int randIndex = (int) (Math.random() * 5 );
        return switch (randIndex) {
            case 0 -> Brand.Asos;
            case 1 -> Brand.Eser;
            case 2 -> Brand.Lenuvo;
            case 3 -> Brand.Xamiou;
            case 4 -> Brand.MacNote;
            default -> null;
        };
    }

    private int getRandRam() {
        int randIndex = (int) (Math.random() * 5 );
        return switch (randIndex) {
            case 0 -> 4;
            case 1 -> 8;
            case 2 -> 16;
            case 3 -> 20;
            case 4 -> 24;
            default -> 0;
        };
    }

    private double getRandPrice() {
        return  (int) (Math.random() * 7 + 1) * 100;
    }

    public static Notebook[] rand(int num){
    Notebook[] resultArray = new Notebook[num];
    for (int i = 0; i<num; i++){
        resultArray[i] = new Notebook();
    }
    return resultArray;
}

    @Override
    public String toString() {
        return "\t" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + brand ;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public Brand getBrand() {
        return brand;
    }



}
