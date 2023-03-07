public class Stock {
    private String name;
    private int currentQnt, minimunQnt;

    public Stock() {}

    public Stock(String name, int currentQnt, int minimunQnt) {
        this.name = name;
        this.currentQnt = currentQnt;
        this.minimunQnt = minimunQnt;
    }

    public String showStock() {
        return ("Product: " + this.name + "; Minimum Quantity: " + this.minimunQnt + "; Current Quantity: " + this.currentQnt);
    }

    public void restock(int qnt) {
        this.currentQnt += qnt;
    }

    public void subStock(int qnt) {
        if(this.currentQnt - qnt >= 0) {
            this.currentQnt -= qnt;
        }
    }

    public boolean needsRestock() {
        if(this.currentQnt <= this.minimunQnt) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentQnt() {
        return currentQnt;
    }

    public void setCurrentQnt(int currentQnt) {
        this.currentQnt = currentQnt;
    }

    public int getMinimunQnt() {
        return minimunQnt;
    }

    public void setMinimunQnt(int minimunQnt) {

        if(minimunQnt >= 0) {
            this.minimunQnt = minimunQnt;
        }
    }
}
