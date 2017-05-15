/**
 * Write a description of class Goblins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblins extends Card 
{
    private int elixirCost = 2;
    private int amountOfTroops = 3;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 169;
    private int damage = 106;
    private int range = 1;
    private int attackCooldown = 1;
    private int splashRange = 1;
    
    private Speed speed = Speed.HYPER;
    
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
