/**
 * Write a description of class Rage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rage extends Card 
{
  private int elixirCost = 2;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 999999;
    private int damage = 0;
    private int range = 100;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.SLOW;
    
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
