

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Serf implements Runnable{

    private Rowboat boat;
    
    public Serf(Rowboat r)
    {
        boat = r;
    }
    
    @Override
    public void run() {
            //attempt to claim mutex
            if(boat.wait(boat.mutex))
            {
                boat.numSerfs++;
                if(boat.numSerfs == 4)
                {
                    boat.signal(boat.serf);
                    boat.signal(boat.serf);
                    boat.signal(boat.serf);
                    boat.numSerfs-=4;
                    boat.signal(boat.mutex);
                    boat.getOnBoard();
                    
                }
                else if(boat.numHackers>=2 && boat.numSerfs >=2)
                {
                    boat.signal(boat.hacker);
                    boat.signal(boat.hacker);
                    boat.signal(boat.serf);
                    boat.numHackers-=2;
                    boat.numSerfs-=2;
                    boat.signal(boat.mutex);
                    boat.getOnBoard();
                }
                else
                {
                    boat.signal(boat.mutex);
                    boat.wait(boat.serf);
                    boat.getOnBoard();
                }//end if
                
                
            }//end if
            
            
        }//end function
        
    
    
    
}
