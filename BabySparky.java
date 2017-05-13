/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class BabySparky extends Card  
{
    private int elixerCost = 4;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 3;


	private int id = 4;
    private int hp = 166;
    private int damage = 700;
    private int range = 100;
    private int attackCooldown = 7;
    private int splashRange = 30;
    
    private Speed speed = Speed.FAST;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.GROUND;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
