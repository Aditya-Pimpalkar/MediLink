package Pharmacy;

public class Medicine {
    private int number;
    private String name;
    private int quantity;

    // Default constructor
    public Medicine() {
    }

    // Parameterized constructor
    public Medicine(String name, int number, int quantity) {
        this.name = name;
        this.number = number;
        this.quantity = quantity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
