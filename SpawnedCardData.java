/**
 * SpawnedCardData contains data from a spawned card, used for client/server communication
 * 
 * @author XCVG
 * @version 1
 */
public class SpawnedCardData  
{

    //final instance data...
    public final String cardName;
    public final int x;
    public final int y;
    

    /**
     * ...and all-arguments constructor make this a mutable class, just like String!
     */
    public SpawnedCardData(Card c, int x, int y)
    {
        cardName = c.getClass().getSimpleName();
        this.x = x;
        this.y = y;        
    }
    
    //we can still have static and non-static utility methods, but we don't have any yet

    
}
