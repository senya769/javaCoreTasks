package arseniyusik.lessonOOP.internetShop;

public class Application {
    public static void main(String[] args) {
        Product[]array = new Product[2];
        array[0] = new Product("Nokia",10000,5);
        array[1] = new Product("Iphone",30000,1);
        Category category = new Category("Mobile",array);
        Basket basket = new Basket(array);
        User user = new User("login","password",basket);
        user.printBuyProduct();
    }
}
