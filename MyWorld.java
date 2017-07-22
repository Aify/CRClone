import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.time.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Elixir constants
    private final int ELIXIR_STEP_TIME = 1; //every 5 seconds...
    private final int ELIXIR_STEP_GAIN = 1; //gain 5 elixir
    
    public static ArrayList<Troop> allTroops = new ArrayList<Troop>();
    public static ArrayList<SpawnedCardData> newCards = new ArrayList<SpawnedCardData>();
    private static Instant lastGainTime;
    private int myElixir;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 900, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //setup game manager
        addObject(new GameManager(),0,0);

        //test card
        addObject(new ActorCard("Goblins"), 128, 700);

        /*
        Troop troop = new Troop();
        addObject(troop,320,482);
        Troop troop2 = new Troop();
        addObject(troop2,200,150);
        troop.setLocation(466,617);

        troop.setSpeed(Speed.SLOW);
        troop2.setSpeed(Speed.SLOW);
        troop.active = true;

        troop.setRange(10);
        allTroops.add(troop2);
        troop2.setLocation(174,196);
         */
        
    }
    
    /**
     * Act method for world called on every tick (Greenfoot step)
     */
    @Override
    public void act()
    {
        stepElixir();
    }

    /**
     * Step elixir: gain elixir at specified rate
     */
    private void stepElixir()
    {
        //if lastGainTime is null, set it up and return
        if(lastGainTime == null)
        {
            lastGainTime = Instant.now();
            return;
        }
        
        //otherwise, check if it's been more than ELIXIR_STEP_TIME since the last gain
        if(lastGainTime.plusSeconds(ELIXIR_STEP_TIME).isBefore(Instant.now()))
        {
            myElixir += ELIXIR_STEP_GAIN;
            lastGainTime = Instant.now();
            //System.out.println(myElixir);
        }
    }
    
    /**
     * Getter for Elixir amount
     */
    public int getElixir()
    {
        return myElixir;
    }
    
    public boolean playCard(Card c, int x, int y)
    {
        //System.out.println("playCard cxy");
        return playCard(c,x,y,false,GameManager.playerNumber);
    }
    
    public boolean playCard(Card c, int x, int y, boolean localOnly,int pid)
    {
        //System.out.println("playing card " + c.toString());
        
        //check if we can afford the card
        if(c.getElixirCost() > myElixir)
        {
            //we can't afford it, so abort
            //we can put some kind of notification here if we want

            return false;
        }
        
        //spend the elixir
        myElixir -= c.getElixirCost();
        
        //add to "new cards" list if not localOnly
        if(!localOnly)
        {
            newCards.add(new SpawnedCardData(c,x,y));
        }
        
        //spawn as many troops as the card specifies
        for(int i = 0; i < c.getAmountOfTroops(); i++)
        {
        
            //create a troop and load data from the card
            Troop t = new Troop();
            //System.out.println(t);
            t.setID(c.getId());
            t.setHP(c.getHp());
            t.setDamage(c.getDamage());
            t.setRange(c.getRange());
            t.setAttackCooldown(c.getAttackCooldown());
            t.setSplashRange(c.getSplashRange());
            t.setSpeed(c.getSpeed());
            t.setDamageType(c.getDType());
            t.setTargetType(c.getTType());
            t.setMTargetType(c.getMTType());
            t.setAttackTime(c.getAttackTime());
            t.playerNumber = pid;
            
            //set image
            String cardName = c.getClass().getSimpleName();
            t.setImage("images/"+cardName+".png");
            
            //set spawn time if non-zero
            int spawnTime = c.getSpawnTime();
            if(spawnTime > 0)
            {
                t.setSpawnTime(Date.from(Instant.now().plusSeconds(spawnTime)));
            }
            else
            {
                t.active = true;
            }
            
            //add the troop to the world
            addObject(t, x, y);
            
            allTroops.add(t);
        }
        return true;
    }
}
