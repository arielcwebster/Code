/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Rowboat {
    
    public int[] mutex = {1};
    public int[] boardMutex = {1};
    public int[] serf = {0};
    public int[] hacker = {0};
    public int numHackers = 0;
    public int numSerfs = 0;
    public int numBoarded = 0;
    
    public synchronized void signal(int[] sem)//AKA V
    {
        sem[0] = sem[0] +1;
    }
    
    public synchronized boolean wait(int[] sem)//AKA P
    {
        if(sem[0] > 0)
        {
            sem[0] = sem[0] -1;
            return true;
        }
        return false;
    }
    
    public void getOnBoard()
    {
        while(!wait(boardMutex))
            continue;
        
        numBoarded++;
        if(numBoarded == 4)
        {
            if((numHackers == 3 && numSerfs == 1) || (numHackers == 1 && numSerfs == 3))
            {
                System.out.println("Hackers: "+numHackers+" Serfs: "+numSerfs);
                //System.out.println("Public beating. Are you proud of yourself?");
                numBoarded = 0;
            
            }
            else
            {
                System.out.println("I'm sailing away...");
                numBoarded = 0;
            }            
        }//end full boat if
        signal(boardMutex);
    }//end function
    
    
    
}
