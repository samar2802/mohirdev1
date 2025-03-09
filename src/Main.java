public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("White");
        car1.setMechanic(true);
        car1.setModel("BMW");
        car1.setPrice(50_000);
        car1.getInformation();
        Triangle triangle = new Triangle();
        triangle.setKatet1(20);
        triangle.setKatet2(30);
        System.out.println(triangle);
        System.out.println(triangle.yuza(2, 3));
        System.out.println(triangle.yuza(2f, 3f));
        System.out.println(triangle.yuza(2L, 3L));
        System.out.println(triangle.perimetr(2, 3));
        System.out.println(triangle.perimetr(2f, 3f));
        System.out.println(triangle.perimetr(2L, 3L));
        Point person = new Point(1, 2, 3);
        person.getInformation();
    }
}
