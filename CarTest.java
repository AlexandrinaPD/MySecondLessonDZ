public class CarTest {

    public static void main(String[] args) {


        Car myCar = new Car();
        myCar.number = 3663;
        myCar.date = 2019;
        myCar.color = "red";
        myCar.brand = "Tayota";

        System.out.printf("myCar: number=%d, date=%d, color=%s, brand=%s\n", myCar.number, myCar.date, myCar.color, myCar.brand);


        Car herCar = new Car();
        herCar.number = 1111;
        herCar.date = 2021;
        herCar.color = "black";
        herCar.brand = "Mazda";

        System.out.printf("myCar: number=%d, date=%d, color=%s, brand=%s\n", herCar.number, herCar.date, herCar.color, herCar.brand);


        Car hisCar = new Car();
        hisCar.number = 2222;
        hisCar.date = 2015;
        hisCar.color = "Blue";
        hisCar.brand = "Dodge";

        System.out.printf("myCar: number=%d, date=%d, color=%s, brand=%s\n", hisCar.number, hisCar.date, hisCar.color, hisCar.brand);


    }
}
