/**
 * Advanced Xbow shoots air and ground.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliteXBow extends Card 
{
    private int elixirCost = 8;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 2;
    
    private int id = 5;
    private int hp = 1400;
    private int damage = 26;
    private int range = 180;
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
