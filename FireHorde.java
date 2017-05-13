/**
 * 6 Fire spirits instead of 3. Now it's a fire HORDE!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireHorde extends Card 
{
    private int elixirCost = 4;
    private int amountOfTroops = 6;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 45;
    private int damage = 85;
    private int range = 3;
    private int attackCooldown = 1;
    private int splashRange = 10;
    
    private Speed speed = Speed.FAST;
    
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
