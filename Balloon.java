/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Card 
{
   private int elixirCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1396;
    private int damage = 798;
    private int range = 1;
    private int attackCooldown = 1;
    private int splashRange = 10;
    
    private Speed speed = Speed.MEDIUM;
    
    private DamageType dType;
    private TargetType tType = TargetType.AIR;
    private TargetType MTType = TargetType.BUILDINGS;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
