import java.io.Serializable;

@FunctionalInterface
public interface Car extends Serializable {

    int SPEED = 10;
    void go();
    default void stop() {
        System.out.println("Car stopped");
    }

    static void printSpeed() {
        System.out.println(SPEED);
    }
}
