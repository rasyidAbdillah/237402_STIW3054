/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master lab
 */
public class MyThread2 extends MyThread{
    public void run(){
        try{

            for(int x = 1000; x<1010; x++){
                System.out.println(x);
                sleep(2000);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
