/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isis extends Card  
{
    private int elixerCost = 3;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;


    private int id = 1;
    private int hp = 150;
    private int damage = 1300;
    private int range = 0;
    private int attackCooldown = 0;
    private int splashRange = 35;
    
    private Speed speed = Speed.FAST;
    
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
