/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class CocanutCannon extends Card  
{
    private int elixerCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 2;


	private int id = 9;
    private int hp = 300;
    private int damage = 300;
    private int range = 140;
    private int attackCooldown = 7;
    private int splashRange = 50;
    
    private Speed speed = Speed.SLOW;
    
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

