/**
 * Write a description of class Bomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomber extends Card 
{
    private int elixirCost = 3;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 311;
    private int damage = 271;
    private int range = 80;
    private int attackCooldown = 1;
    private int splashRange = 10;
    
    private Speed speed = Speed.MEDIUM;
    
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
