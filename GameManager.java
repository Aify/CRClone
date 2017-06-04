import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameManager manages synchronization of game state across the network
 * 
 * @author XCVG
 * @version 1
 */
public class GameManager extends Actor
{
    //this enum is used for defining states this object can be in- ask Hank what a state machine is if you're curious
    private enum GameManagerState
    {
        UNCONNECTED, STARTED;
    }
    
    static final String SERVER_IP = "127.0.0.1";
    
    private GameManagerState state;
    
    public GameManager()
    {
        super();
        
        state = GameManagerState.UNCONNECTED;
    }
    
    /**
     * Act - setup connection and synchronize game state here
     */
    public void act() 
    {
        switch(state)
        {
            case UNCONNECTED:
                attemptConnection();
                break;
            case STARTED:
                syncMySpawnedUnits();
                syncOtherSpawnedUnits();
                break;

        }
    }
    
    /**
     * attemptConnection tries to connect to the server
     */
    private void attemptConnection()
    {
        //TODO connect to the server and switch state when done
    }
    
    /**
     * syncMySpawnedUnits sends "unit spawned" messages to the server from this client's spawn list
     */
    private void syncMySpawnedUnits()
    {
        //TODO send list of spawned units/cards to the server
    }
    
    /**
     * syncOtherSpawnedUnits gets "unit spawned" messages from the server and applies it here
     */
    private void syncOtherSpawnedUnits()
    {
        //TODO get a list of spawned units/cards and recreate them here
    }
}
