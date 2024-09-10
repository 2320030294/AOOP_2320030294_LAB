package com.boundedbuffer_10b;

public class Consumer extends Thread {
    private final BoundedBuffer<String> buffer;

    public Consumer(BoundedBuffer<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) { // Produce 20 items
                String item = "Item " + i;
                buffer.put(item);
                System.out.println("Produced: " + item);
                Thread.sleep(500); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
