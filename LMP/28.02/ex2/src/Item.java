public class Item {
    private int id, unitsSold;
    private String description;
    private double price;


    public Item(int id, String description, int unitsSold, double price) {
        this.id = id;
        this.description = description;

        if(unitsSold >= 0) {
            this.unitsSold = unitsSold;
        } else {
            this.unitsSold = 0;
        }

        if(price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        if(unitsSold >= 0) {
            this.unitsSold = unitsSold;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }

    public double getTotal() {
        return price * (double) unitsSold;
    }
}
