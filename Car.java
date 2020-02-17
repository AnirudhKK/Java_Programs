package practical2;

public class Car {
    private String manufacturer;
    private int price;

    public Car(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setManufacturer(String ma) {
        manufacturer = ma;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

}

