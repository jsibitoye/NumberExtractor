/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberextractor;

/**
 *
 * @author j
 */
public class ThreadClass extends Thread{
    static int num;
    ThreadClass(int number){
        num = number;
     System.out.println("tread is called");
     
    }
    ThreadClass(){
        
    }
    public void run(){
       
        while( num > 0){
            System.out.println("thank you"+num);
        num--; 
        try{
        Thread.sleep(1000);
        }
            catch(Exception e){}
        }
       } 
    
    public static void main( String args[]){
        Thread auntie = new Thread( new ThreadClass(50));
          System.out.println("baba number1"+);
        auntie.start();
          System.out.println("baba number2"+i);
        for (int i = 40; i<1; i--){
         System.out.println("baba number3"+i);
         try{
        Thread.sleep(1500);
        }
            catch(Exception e){}
        }
    }
}
