package org.dc.exception.advanced;

public class AutoClosableResource implements AutoCloseable{
    public AutoClosableResource() {
        System.out.println("Resource Opened");
    }

    public void doActions() {
        System.out.println("Performing resource opened.");
    }

    @Override
    public void close() {
        System.out.println("Resource Closed");
    }
}
