/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireSpirit extends Card  
{
    private int elixerCost = 2;
    private int amountOfTroops = 3;
    private int troopID;
    private int spawnTime = 1;


	private int id = 1;
    private int hp = 91;
    private int damage = 169;
    private int range = 40;
    private int attackCooldown = 1;
    private int splashRange = 40;
    
    private Speed speed = Speed.HYPER;
    
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