public class MainCar {
    public static void main(String[] args) {
        Car car = () -> System.out.println("Car goes");
        System.out.println(Car.SPEED);
        car.go();
        car.stop();
        Car.printSpeed();

    }
}
