
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author master lab
 */
public class MyThread extends Thread{
    public void run(){
        try{

            for(int x = 0; x<10; x++){
                System.out.println(x);
                sleep(2000);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
