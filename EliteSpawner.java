/**
 * Spawns 1 Elite Barbarian every 20 seconds.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliteSpawner extends Card 
{
    private int elixirCost = 7;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 1200;
    private int damage = 100;
    private int range = 1;
    private int attackCooldown = 5;
    private int splashRange = 1;
    
    private Speed speed = Speed.FAST;
    private DamageType dType;
    private TargetType tType = TargetType.BUILDINGS;
    private TargetType mTType = TargetType.GROUND;
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
