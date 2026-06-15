/*
Cognifyz Java Internship - Level 3 Task=2
Multithreading Bank Application
Name=Vinita Tarayil
Concepts : Multithreading ,Synchronization, Thread Safety.
Description :Demonstrates Synchronized counter using multiple threads .
 */
package BaddieCodes.Cognifyz_Internship_Vinita;

class Counter{
int count = 0;

synchronized void increment() {
        count++;
    }
}
    class MyThread extends Thread {
        Counter c;

        MyThread(Counter c) {
            this.c = c;
        }

        public void run() {
            for (int i = 0; i < 1000; i++)
                c.increment();
        }
    }

public class BankThreadedApp {
    public static void main(String[] args) throws Exception{
        Counter c= new Counter();
        MyThread t1= new MyThread(c);        
        MyThread t2= new MyThread(c);
        
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final Count :" + c.count);
    }
}
