/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golem extends Card  
{
    private int elixerCost = 8;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 3;


	private int id = 1;
    private int hp = 4256;
    private int damage = 259;
    private int range = 1;
    private int attackCooldown = 3;
    private int splashRange = 0;
    
    private Speed speed = Speed.SLOW;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.BUILDINGS;  // my t type, what the troop prefers to target

    private int attackTime;

    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
