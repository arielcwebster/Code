/*
This class is to be implemented as a thread from a control program
 */

package concurassignone;

import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Raterix
 */
public class Philosopher implements Runnable{

    private boolean[] chops;
    private int[] reserv;
    private int placeNum;

    Philosopher(boolean[] chps, int num, int[] res)
    {
        chops = chps;
        placeNum = num;
        reserv = res;
    }
    
    public void think()
    {
        //System.out.println("Philosopher " +placeNum+" is thinking!");
        try{
           
            TimeUnit.MILLISECONDS.sleep(2 + (int)(Math.random()*((50)+1)));
        }
        catch(Exception e)
        {}
        //System.out.println("Philosopher " +placeNum+" is awake!");
    }
    
    @Override
    public void run() {
        
        
        int leftChopNum = placeNum-1;
        if(leftChopNum<0)
            leftChopNum =  4;
        
        int leftChop = reserv[leftChopNum];
        int rightChop = reserv[placeNum];
        
        
        
        while(true)
        {
            think();
            
            while(leftChop !=  placeNum || rightChop != placeNum)
            {
                
                for(int k = 0; k < 5; k++) 
                    System.out.print(reserv[k] + " ");
                System.out.println();
                
//                for(int k = 0; k < 5; k++) 
//                    System.out.print(chops[k] + " ");
//                System.out.println();
                
                
                leftChop = reserv[leftChopNum];
                if(leftChop != placeNum)
                {
                    if(!chops[leftChopNum])
                    {
                        //System.out.println("Philosopher " +placeNum+" has left chop!");
                        chops[leftChopNum] = true;
                        reserv[leftChopNum] = placeNum;
                       
                        think();
                    }
                }
                
                rightChop = reserv[placeNum];
                if(rightChop != placeNum)
                {
                    if(!chops[placeNum])
                    {
                        //System.out.println("Philosopher " +placeNum+" has right chop!");
                        chops[placeNum] = true;
                        reserv[placeNum] = placeNum;
                 
                        think();
                    }
                }
                
            }//end loop
            
            System.out.println("Philosopher " +placeNum+" is eating!");
            chops[leftChopNum] = false;
            leftChop = -1;
            reserv[leftChopNum] = -1;
            
            chops[placeNum] = false;
            rightChop = -1;
            reserv[placeNum] = -1;
            
        
        }//while true
    }//end function
    
}
