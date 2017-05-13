/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class PEKKAHut extends Card  
{
    private int elixerCost = 6;
    private int amountOfTroops = 3/1;
    private int troopID;
    private int spawnTime = 16;


	 private int id = 8;
    private int hp = 1200;
    private int damage = 0;
    private int range = 0;
    private int attackCooldown = 0;
    private int splashRange = 0;
    
    private Speed speed = Speed.MEDIUM;
    
    private DamageType dType;
    private TargetType tType = TargetType.BUILDINGS;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
