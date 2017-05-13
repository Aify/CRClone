/**
 * Blocks enemy from attacking the tower. Troops cannot jump over it.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Wall extends Card 
{
    private int elixirCost = 7;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;

    private int id = 5; 
    private int hp = 3000;
    private int damage = 0;
    private int range = 0;
    private int attackCooldown = 0;
    private int splashRange = 0;
    
    private Speed speed = Speed.SLOW;
    
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