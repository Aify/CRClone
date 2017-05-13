/**
 * Write a description of class Giant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Giant extends Card 
{
    private int elixirCost = 5;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 3344;
    private int damage = 211;
    private int range = 1;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.SLOW;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;
    private TargetType MTType = TargetType.BUILDINGS;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
