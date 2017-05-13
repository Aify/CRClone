/**
 * Write a description of class Archers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archers extends Card 
{
    private int elixirCost = 3;
    private int amountOfTroops = 2;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 254;
    private int damage = 86;
    private int range = 100;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.FAST;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;
    private TargetType MTType = TargetType.ALL;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
