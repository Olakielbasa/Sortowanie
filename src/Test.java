
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car("Volvo");
        Car car2 = new Car("Polonez");
        Car car3 = new Car("Mazda");
        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Collections.sort(list, new BrandComparator());
        for (Car car : list) {
            System.out.println(car.marka);
        }
    }
}
