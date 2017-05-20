/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfernoTower extends Card  
{
    private int elixerCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;


	private int id = 1;
    private int hp = 1408;
    private int damage = 100;
    private int range = 120;
    private int attackCooldown = 1;
    private int splashRange = 0;
    
    private Speed speed = Speed.SLOW;
    
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
