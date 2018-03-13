

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Hacker2 implements Runnable{

    private Rowboat boat;
    
    public Hacker2(Rowboat r)
    {
        boat = r;
    }
    
    @Override
    public void run() {
        while(true){
            
            //attempt to claim mutex
            if(boat.wait(boat.mutex))
            {
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
                        boat.signal(boat.mutex);
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
                
                
            }//end if
            
        }//end while
        
    }//end function
    
    
    
}
