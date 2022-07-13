package arseniyusik.lesson18_concurrency.restaurant.model;

public class Waiter implements Runnable {
    Restaurant restaurant;
   final private int workingCount = 15;
    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        while (!restaurant.isClosedRestaurant()) {
            try {
                restaurant.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
      //  System.out.println("Официант устал!");
    }
}
