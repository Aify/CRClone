/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poison extends Card  
{
    private int elixerCost = 4;
    private int amountOfTroops = 0;
    private int troopID;
    private int spawnTime = 1;


	private int id = 1;
    private int hp = 0;
    private int damage = 75;
    private int range = 80000;
    private int attackCooldown = 1;
    private int splashRange = 70;
    
    private Speed speed = Speed.HYPER;
    
    private DamageType dType;
    private TargetType tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
