/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class fireSpiritHut extends Card  
{
    private int elixerCost = 5;
    private int amountOfTroops = 2/1;
    private int troopID;
    private int spawnTime = 40;


	private int id = 3;
    private int hp = 1100;
    private int damage = 0;
    private int range = 0;
    private int attackCooldown = 0;
    private int splashRange = 0;
    
    
    
    private DamageType dType;
    private TargetType tType = TargetType.BUILDINGS;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

    private int attackTime;

    public fireSpiritHut()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 3344;
        damage = 211;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn() {

    }
    
    public String toString() {
        return "" + troopID + "[" + amountOfTroops + "[" + elixerCost + "]";
    }
}
