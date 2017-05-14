/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Card 
{
   private int elixirCost = 3;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1399;
    private int damage = 159;
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
