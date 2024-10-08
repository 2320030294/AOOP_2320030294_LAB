package com.messaging_10a;

public class MessagingApp {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}