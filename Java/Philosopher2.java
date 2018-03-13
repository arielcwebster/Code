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
public class Philosopher2 implements Runnable{

    private boolean[] chops;
    private int[] reserv;
    private int placeNum;

    Philosopher2(boolean[] chps, int num, int[] res)
    {
        chops = chps;
        placeNum = num;
        reserv = res;
    }
    
    public void think()
    {
        //System.out.println("Philosopher " +placeNum+" is thinking!");
        try{
           //think for random time
            TimeUnit.MILLISECONDS.sleep(2 + (int)(Math.random()*((50)+1)));
        }
        catch(Exception e)
        {}
        //System.out.println("Philosopher " +placeNum+" is awake!");
    }
    
    @Override
    public void run() {
        
        //PhD always wants the chop at his ID and his ID-1
        int leftChopNum = placeNum-1;
        if(leftChopNum<0)
            leftChopNum =  4;
        
        int leftChop = reserv[leftChopNum];
        int rightChop = reserv[placeNum];
        
        
        
        while(true)
        {
            think();
            
                
            for(int k = 0; k < 5; k++) 
                System.out.print(reserv[k] + " ");
            System.out.println();
                
            synchronized(this) {
                
                leftChop = reserv[leftChopNum];
                if(leftChop != placeNum)
                {
                    if(!chops[leftChopNum])
                    {
                        //System.out.println("Philosopher " +placeNum+" has left chop!");
                        chops[leftChopNum] = true;
                        reserv[leftChopNum] = placeNum;
                       
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
                    }
                }
                
                //check if we have both reservations, if so eat if not release
                if(reserv[placeNum] == placeNum && reserv[leftChopNum] == placeNum)
                {
                    System.out.println("Philosopher " +placeNum+" is eating!");
                    
                    chops[leftChopNum] = false;
                    leftChop = -1;
                    reserv[leftChopNum] = -1;
            
                    chops[placeNum] = false;
                    rightChop = -1;
                    reserv[placeNum] = -1;
                }
                else
                {
                    if(reserv[placeNum] == placeNum)
                    {
                        chops[placeNum] = false;
                        rightChop = -1;
                        reserv[placeNum] = -1;
                    }
                    if(reserv[leftChopNum] == placeNum)
                    {
                        chops[leftChopNum] = false;
                        leftChop = -1;
                        reserv[leftChopNum] = -1;
                    }    
                }//end else
                
            }//end sync           
        
        }//while true
    }//end function
    
}
