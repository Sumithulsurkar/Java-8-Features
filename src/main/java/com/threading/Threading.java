package com.threading;

public class Threading extends Thread {

    private int threadNumber;
    public Threading(int thread) {
        this.threadNumber = thread;
    }

    @Override
    public void run() {
        for (int i = 1;  i <= 5; i++){
            System.out.println("New Thread "+  i  + " Started " + "And I'm from thread " + threadNumber);

            if(threadNumber == 3){
                throw new RuntimeException();
            }
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
