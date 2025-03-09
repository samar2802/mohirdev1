public class Car {
    private String color;
    private String model;
    private int price;
    private boolean isMechanic;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMechanic(boolean mechanic) {
        isMechanic = mechanic;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void getInformation(){
        System.out.println("Rangi:" + this.color + " Model:" + this.model + " Narxi:" + this.price + " Mexanikmi: " + (this.isMechanic ? "Ha" : "Yo'q"));
    }
}
