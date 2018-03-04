/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master lab
 */
public class cobaanHidup extends Thread {

    public static void main(String[] args) {
        cobaanHidup mytest = new cobaanHidup();
        mytest.start();
        //new Thread(new cobaanHidup()).start();        <--------   Or we can write this way
    }

    public void run() {
        try {
            for (int x = 0; x < 100; x += 5) {
                if (x % 2 == 0) {
                    System.out.println(x + 5);
                } else if (x % 2 == 1) {
                    System.out.println(x + 5 + "A");
                }
                sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void run(int i) {
        try {
            for (int x = 0; x < 100; x++) {
                System.out.println(x+5 + "A");
                sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     */
}
