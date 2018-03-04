/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master lab
 */

//separate into two files

public class MyTest extends Thread{
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        //  new Thread(new MyTest()).start();
    }
}
