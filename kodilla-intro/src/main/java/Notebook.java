public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 & this.price <= 1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 & this.weight <= 1700){
            System.out.println("The weight is good.");
        } else {
            System.out.println("This notebook is quite heavy.");
        }
    }

    public void checkYear () {
        if (this.year <= 2020 & this.price <= 600) {
            System.out.println("This notebook is old, but price is still good, you can buy it.");
        } else if (this.year <= 2020 & this.price > 600) {
            System.out.println("This notebook is old and pricey, don't buy it");
        } else if (this.year > 2020 & this.price <= 600) {
            System.out.println("This notebook is new and cheap, hurry up and buy it.");
        } else {
            System.out.println("This notebook is new, but pricey, please reconsider the purchase.");
        }
    }
}