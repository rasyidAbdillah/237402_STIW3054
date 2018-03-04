/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master lab
 */
public class makinTinggi implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is running ...");
        t.start();
    }

    public static void main(String args[]) {
        System.out.println(Thread.currentThread() + " is running ...");
        Thread t1 = new Thread(new makinTinggi(), "t1");
        Thread t2 = new Thread(new makinTinggi());
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + " is running ...");
        t1.start();
        System.out.println(t2.getName() + " is stopping ...");
    }
}
