/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class WhiteWitch extends Card  
{
    private int elixerCost = 7;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 10;


	private int id = 3;
    private int hp = 220;
    private int damage = 320;
    private int range = 0;
    private int attackCooldown = 7;
    private int splashRange = 50;
    
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
