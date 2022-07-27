package models;

public class Iphone extends Phone{
    public Iphone() {
    }

    public Iphone(String number, String model) {
        super(number, model);
    }
    public Iphone(String number, String model, double weight) {
        super(number, model, weight);
    }
}
