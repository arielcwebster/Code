

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Hacker3 implements Runnable{

    private Rowboat boat;
    
    public Hacker3(Rowboat r)
    {
        boat = r;
    }
    
    @Override
    public synchronized void run() {
        while(!boat.wait(boat.mutex))
            continue;
            
                System.out.println("Mutex Open");
                boat.numHackers++;
                if(boat.numHackers == 4)
                {
                    boat.signal(boat.hacker);
                    boat.signal(boat.hacker);
                    boat.signal(boat.hacker);
                    boat.numHackers-=4;
                    boat.getOnBoard();
                    boat.signal(boat.mutex);
                    System.out.println("Mutex close");
                    
                }
                else if(boat.numHackers>=2 && boat.numSerfs >=2)
                {
                    boat.signal(boat.hacker);
                    boat.signal(boat.serf);
                    boat.signal(boat.serf);
                    boat.numHackers-=2;
                    boat.numSerfs-=2;
                    boat.getOnBoard();
                    boat.signal(boat.mutex);
                    System.out.println("Mutex close");
                }
                else
                {
                    //if the boat is unsafe back out
                    if(boat.numSerfs == 3)
                    {
                        boat.numHackers--;
                        System.out.println("Mutex close");
                    }
                    else
                    {
                        boat.wait(boat.hacker);
                        boat.getOnBoard();
                        boat.signal(boat.mutex);
                        System.out.println("Mutex close");
                    }
                }//end if
                
                
        
    }//end function
    
    
    
}
