/**
 * One hits all units but slow lazy and weak.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KingPekka extends Card 
{
    private int elixirCost = 6;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 2;
    
    private int id = 5;
    private int hp = 1050;
    private int damage = 2000;
    private int range = 2;
    private int attackCooldown = 2;
    private int splashRange = 1;
    
    private Speed speed = Speed.SLOW;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;
    private TargetType mTType = TargetType.GROUND;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
