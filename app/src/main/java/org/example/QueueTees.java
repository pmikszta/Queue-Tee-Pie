package org.example;

// QueueTees.java
public class QueueTees {
    private Cutie[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor with fixed capacity
    public QueueTees(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Queue capacity must be positive.");
        }
        this.capacity = capacity;
        this.queueArray = new Cutie[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Default constructor with capacity 10
    public QueueTees() {
        this(10);
    }

    // Add a Cutie to the queue
    public void enqueue(Cutie cutie) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full! Cannot enqueue.");
        }
        rear = (rear + 1) % capacity;  // wrap-around logic
        queueArray[rear] = cutie;
        size++;
    }

    // Remove and return the first Cutie from the queue
    public Cutie dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty! Cannot dequeue.");
        }
        Cutie removed = queueArray[front];
        queueArray[front] = null;  // help garbage collection
        front = (front + 1) % capacity;  // wrap-around logic
        size--;
        return removed;
    }

    // Return current size of the queue
    public int size() {
        return size;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }
}
