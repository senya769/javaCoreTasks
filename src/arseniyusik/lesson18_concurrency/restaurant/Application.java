package arseniyusik.lesson18_concurrency.restaurant;

import arseniyusik.lesson18_concurrency.restaurant.model.Guest;
import arseniyusik.lesson18_concurrency.restaurant.model.Restaurant;
import arseniyusik.lesson18_concurrency.restaurant.model.Waiter;

public class Application {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(2);
        Thread thread2 = new Thread(new Waiter(restaurant)); thread2.start();
        for (int i = 0; i < 30; i++) {
            Thread thread1 = new Thread(new Guest(restaurant));
            thread1.start();
        }

    }
}
