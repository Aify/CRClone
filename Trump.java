/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trump extends Card  
{
    private int elixerCost = 6;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;


	private int id = 8;
    private int hp = 1500;
    private int damage = 400;
    private int range = 100;
    private int attackCooldown = 1;
    private int splashRange = 0;
    
    private Speed speed = Speed.MEDIUM;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
