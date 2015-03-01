package Kafka;

/**
 * Created by mymint on 22/02/15.
 */
public class ConsumerMain {

    public static void main(String[] args) throws InterruptedException {

        Consumer consumer2 = new Consumer(KafkaProperties.topic2);
        consumer2.start();

        System.out.println("Created consumer thread and started it.");
        System.out.println(Thread.currentThread().getName() + " will join now");
        Thread.currentThread().join();
    }

}
