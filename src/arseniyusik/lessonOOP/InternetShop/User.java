package arseniyusik.lessonOOP.InternetShop;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User() {
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
    public void printBuyProduct(){
        System.out.println("Купленные продукты ");
        this.basket.printBasket();
    }
}

