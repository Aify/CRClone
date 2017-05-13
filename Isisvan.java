/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isisvan extends Card  
{
    private int elixerCost = 3;
    private int amountOfTroops = 3;
    private int troopID;
    private int spawnTime = 0;


	private int id = 7;
    private int hp = 0;
    private int damage = 0;
    private int range = 2000;
    private int attackCooldown = 0;
    private int splashRange = 0;
    
    private Speed speed = Speed.FAST;
    
    private DamageType dType;
    private TargetType tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType =TargetType.ALL;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
