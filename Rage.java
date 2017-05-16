/**
 * Write a description of class Rage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rage extends Card 
{
    public Rage()
    {
        elixirCost = 2;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 999999;
        damage = 0;
        range = 100;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
