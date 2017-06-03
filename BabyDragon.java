/**
 * Write a description of class BabyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyDragon extends Card 
{
    public BabyDragon()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1064;
        damage = 133;
        range = 63;
        attackCooldown = 1;
        splashRange = 30;
        speed = Speed.FAST;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
