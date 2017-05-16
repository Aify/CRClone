/**
 * Write a description of class GiantSkeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GiantSkeleton extends Card 
{
    public GiantSkeleton()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 2660;
        damage = 172;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
