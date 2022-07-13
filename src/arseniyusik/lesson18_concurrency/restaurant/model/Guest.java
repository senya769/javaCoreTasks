package arseniyusik.lesson18_concurrency.restaurant.model;

public class Guest implements Runnable {
    Restaurant restaurant;

    public Guest(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        //for (int i = 0; i < 30; i++) {
        if(!restaurant.isClosedRestaurant()){
            try {
                restaurant.reserve();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }else
        System.out.println("РЕСТОРАН ЗАКРЫТ!");
    }
}
