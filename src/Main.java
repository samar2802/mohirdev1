public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Black", "Toyota", 50000, true);
        Car car2 = new Car("White", "BMW", 70000, true);
        Car car3 = new Car("Red", "Chevrolet", 26500, false);
        car1.getInformation();
        car2.getInformation();
        car3.getInformation();
        Triangle triangle1 = new Triangle(10.0, 20.0);
        Person person = new Person();
        person.name = "Samar";
        person.setAge(19);
        System.out.println(person.equals(triangle1));
        System.out.println(car1.equals(car2));
        System.out.println(triangle1.getClass());
        System.out.println(car1.hashCode());
    }
}
