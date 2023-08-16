package practice_day08;

public class Car {
    String marka;
    String model;

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car araba1 = new Car();

        araba1.marka = "Ford";
        araba1.model = "Focus";

        System.out.println(araba1.marka + " "+ araba1.model);


    }
}
