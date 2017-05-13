/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class ArcherGod extends Card  
{
    private int elixerCost = 9;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 12;


	private int id = 5;
    private int hp = 1500;
    private int damage = 1200;
    private int range = 150;
    private int attackCooldown = 7;
    private int splashRange = 40;
    
    private Speed speed = Speed.FAST;
    
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
