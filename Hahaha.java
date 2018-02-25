package hahaha;

class MyThread extends Thread {

    public void run() {
        System.out.println("running...");
        System.out.println("running...new 1");
        System.out.println("running... This is just a test");
        System.out.println("Rasyid Abdillah !?");
        System.out.println("237402");
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}