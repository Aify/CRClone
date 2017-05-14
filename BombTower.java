/**
 * Write a description of class BombTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombTower extends Card 
{
   private int elixirCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1672;
    private int damage = 176;
    private int range = 120;
    private int attackCooldown = 1;
    private int splashRange = 40;
    
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
