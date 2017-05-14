/**
 * Write a description of class Minions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minions extends Card 
{
    private int elixirCost = 3;
    private int amountOfTroops = 3;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 190;
    private int damage = 84;
    private int range = 40;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.FAST;
    
    private DamageType dType;
    private TargetType tType = TargetType.AIR;
    private TargetType MTType = TargetType.ALL;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
