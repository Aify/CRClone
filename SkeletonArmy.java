/**
 * Write a description of class SkeletonArmy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkeletonArmy extends Card 
{
    public SkeletonArmy()
    {
        elixirCost = 3;
        amountOfTroops = 14;
        spawnTime = 1;
        id = 5;
        hp = 67;
        damage = 67;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
