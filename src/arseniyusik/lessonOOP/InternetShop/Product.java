package arseniyusik.lessonOOP.InternetShop;

public  class Product {
    private String name;
    private int price;
    private int rating;

    Product(){}

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
