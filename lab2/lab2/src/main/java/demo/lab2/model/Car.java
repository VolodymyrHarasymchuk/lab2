package demo.lab2.model;

public class Car {
    private int id;
    private String name;
    private String bodyType;
    private int power;
    private int price;

    public Car(int id, String name, String bodyType, int power, int price) {
        this.id = id;
        this.name = name;
        this.bodyType = bodyType;
        this.power = power;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }
}
