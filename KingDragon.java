/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class KingDragon extends Card  
{
    private int elixerCost = 6;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 3;


	private int id = 4;
    private int hp = 1800;
    private int damage = 300;
    private int range = 80;
    private int attackCooldown = 7;
    private int splashRange = 40;
    
    private Speed speed = Speed.MEDIUM;
    
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
