public class Car {
    String color;
    String model;
    int price;
    boolean isMechanic;
    Car(String color, String model, int price, boolean isMechanic){
        this.color = color;
        this.model = model;
        this.price = price;
        this.isMechanic = isMechanic;
    }
    public void getInformation(){
        System.out.println("Rangi:" + color + " Model:" + model + " Narxi:" + price + " Mexanikmi: " + (isMechanic ? "Ha" : "Yo'q"));
    }
}
