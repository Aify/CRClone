/**
 * Advanced Xbow shoots air and ground.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliteXBow extends Card 
{
    public EliteXBow()
    {
        elixirCost = 8;
        amountOfTroops = 1;
        spawnTime = 2;
        id = 17;
        hp = 1400;
        damage = 26;
        range = 180;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
