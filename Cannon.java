/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Card 
{
    public Cannon()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 742;
        damage = 127;
        range = 110;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
