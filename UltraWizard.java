/**
 * A wizard with all three wazard's power combined. Fire, Ice, electricity.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltraWizard extends Card 
{
    private int elixirCost = 9;
    private int amountOfTroops = 1;
    private int troopID;
    private int spawnTime = 1;
    
    private int id = 5;
    private int hp = 600;
    private int damage = 185;
    private int range = 80;
    private int attackCooldown = 1;
    private int splashRange = 5;
    
    private Speed speed = Speed.MEDIUM;
    
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
