

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Serf3 implements Runnable{

    private Rowboat boat;
    
    public Serf3(Rowboat r)
    {
        boat = r;
    }
    
    @Override
    public synchronized void run() {
            
            
        while(!boat.wait(boat.mutex))
            continue;
       
                System.out.println("Mutex open");
                boat.numSerfs++;
                
                //if boat is homogenious
                if(boat.numSerfs == 4)
                {
                    boat.signal(boat.serf);
                    boat.signal(boat.serf);
                    boat.signal(boat.serf);
                    boat.numSerfs-=4;                    
                    boat.getOnBoard();
                    boat.signal(boat.mutex);
                    System.out.println("Mutex close");
                }
                //if boat is even split
                else if(boat.numHackers>=2 && boat.numSerfs >=2)
                {
                    boat.signal(boat.hacker);
                    boat.signal(boat.hacker);
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
                    if(boat.numHackers == 3)
                    {
                        boat.numSerfs--;
                        System.out.println("Mutex close");
                    }
                    else
                    {
                        boat.wait(boat.serf);
                        boat.getOnBoard();
                        boat.signal(boat.mutex);
                        System.out.println("Mutex close");
                    }
                }//end if
                
            
    }//end function
        
    
    
    
}
