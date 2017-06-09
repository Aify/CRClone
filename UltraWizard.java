/**
 * A wizard with all three wazard's power combined. Fire, Ice, electricity.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltraWizard extends Card 
{
    public UltraWizard()
    {
        elixirCost = 9;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 59;
        hp = 600;
        damage = 185;
        range = 80;
        attackCooldown = 1;
        splashRange = 5;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
