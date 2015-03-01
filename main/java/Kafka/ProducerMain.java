package Kafka;

/**
 * Created by mymint on 22/02/15.
 */
public class ProducerMain {

    public static void main(String[] args) throws InterruptedException {
            Producer producer2 = new Producer(KafkaProperties.topic2);
            producer2.start();

        System.out.println("Created producer thread and started it.");
        System.out.println(Thread.currentThread().getName() + " will join now");
        Thread.currentThread().join();
    }


}
