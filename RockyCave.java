/**
 * Spawns 1 Golem every 25 seconds.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockyCave extends Card 
{
    private int elixirCost = 8;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 800;
    private int damage = 260;
    private int range = 1;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.SLOW;
    
    private DamageType dtype;
    private TargetType tType = TargetType.GROUND;
    private TargetType MTType = TargetType.BUILDINGS;
    
    private int attackTime;
    
    public void spawn(){
        
    }
    public String toString(){
        return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
}
