package arseniyusik.lesson18_concurrency.restaurant.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Restaurant extends Thread {
    private final int COUNT_TABLES = 10;
    public int countTableReserved;
    public int countServedTables;
    private int profit = 0;

    public Restaurant(int countTableReserved) {
        this.countTableReserved = countTableReserved;
        this.countServedTables = countTableReserved;
    }

     synchronized void reserve() throws InterruptedException {

        if (countTableReserved == COUNT_TABLES) {
            wait();
        }
        if(isClosedRestaurant()) {
            System.out.println("Извините, но ресторан закрывается...");
            return;
        }
        Thread.sleep(800);
        new AtomicInteger(countTableReserved++);
        System.out.println("Гость занял место. Свободных - " + (COUNT_TABLES - countTableReserved));

    }

     synchronized void release() throws InterruptedException {

        if (countTableReserved > 7 && countTableReserved<= COUNT_TABLES ) {

            System.out.print("Официант убирает столик  ");

            this.countServedTables++;
            this.profit += 50;
            new AtomicInteger(countTableReserved--);
            Thread.sleep(2000);
            notify();
            System.out.println("Столик осбодился. Свободных мест  ---- " + (COUNT_TABLES - countTableReserved) + " прибыль " + profit);
            recalculation();

        }
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getProfit() {
        return profit;
    }

    public boolean isClosedRestaurant() {
        if (countServedTables >= 15) {
            return true;
        }
        return false;
    }
    private void recalculation(){
        if (getProfit() == 500) {
            System.out.println("Приехала налоговая, идет процесс....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setProfit(0);
            System.out.println("Налоговая отработала. ------------");
        }
    }
}
