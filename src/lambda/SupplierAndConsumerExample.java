package lambda;
import java.util.ArrayList;
import java.util.function.*;

public class SupplierAndConsumerExample {
    public static void main(String[] args) {

        // Supplier

        ArrayList<Car> al = new ArrayList<>();
        al = createThreeCars(() -> new Car("Nissan", "Metallic", 1.6));
        System.out.println(al);
        // [Car{model='Nissan', color='Metallic', engine=1.6},
        // Car{model='Nissan', color='Metallic', engine=1.6},
        // Car{model='Nissan', color='Metallic', engine=1.6}]


        // Consumer

        upgradeCar(al.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
        });

        System.out.println(al);
        // [Car{model='Nissan', color='red', engine=2.4}, <====
        // Car{model='Nissan', color='Metallic', engine=1.6},
        // Car{model='Nissan', color='Metallic', engine=1.6}]
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void upgradeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
