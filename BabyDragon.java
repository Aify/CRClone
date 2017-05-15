/**
 * Write a description of class BabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyDragon extends Card 
{
     private int elixirCost = 4;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1064;
    private int damage = 133;
    private int range = 63;
    private int attackCooldown = 1;
    private int splashRange = 30;
    
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
