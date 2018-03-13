

package concurassignone;

/**
 *
 * @author Raterix
 */
public class Hacker implements Runnable{

    private Rowboat boat;
    
    public Hacker(Rowboat r)
    {
        boat = r;
    }
    
    @Override
    public void run() {
        //attempt to claim mutex
        if(boat.wait(boat.mutex))
        {
            boat.numHackers++;
            if(boat.numHackers == 4)
            {
                boat.signal(boat.hacker);
                boat.signal(boat.hacker);
                boat.signal(boat.hacker);
                boat.numHackers-=4;
                boat.signal(boat.mutex);
                boat.getOnBoard();
                    
            }
            else if(boat.numHackers>=2 && boat.numSerfs >=2)
            {
                boat.signal(boat.hacker);
                boat.signal(boat.serf);
                boat.signal(boat.serf);
                boat.numHackers-=2;
                boat.numSerfs-=2;
                boat.signal(boat.mutex);
                boat.getOnBoard();
            }
            else
            {
                boat.signal(boat.mutex);
                boat.wait(boat.hacker);
                boat.getOnBoard();
            }
        
        }
    
    }//end function
    
    
    
}
