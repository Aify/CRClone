/**
 * Write a description of class GoblinHut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoblinHut extends Card 
{
   private int elixirCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1293;
    private int damage = 50;
    private int range = 100;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.HYPER;
    
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
