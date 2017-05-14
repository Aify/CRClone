/**
 * Write a description of class GiantSkeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GiantSkeleton extends Card 
{
   private int elixirCost = 6;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 2660;
    private int damage = 172;
    private int range = 1;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
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
