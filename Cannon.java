/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Card 
{
   private int elixirCost = 3;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 742;
    private int damage = 127;
    private int range = 110;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.SLOW;
    
    private DamageType dType;
    private TargetType tType = TargetType.BUILDINGS;
    private TargetType MTType = TargetType.ALL;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
