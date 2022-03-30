package arseniyusik.lessonOOP.internetShop;

public class Basket {
private Product []products;

    public Basket(Product[] products) {
        this.products = products;
    }
    public void printBasket(){
        for (Product j: products) {
            System.out.println("Продукт: " + j.getName());
        }
    }
}
