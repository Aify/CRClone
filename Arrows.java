/**
 * Arrows are sharp!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrows extends Card 
{
    private int elixirCost = 3;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 0;
    private int damage = 243;
    private int range = 9999999;
    private int attackCooldown = 1;
    private int splashRange = 20;
    
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
