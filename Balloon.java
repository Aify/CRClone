/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Card 
{
    
    public Balloon()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 7;
        hp = 1396;
        damage = 798;
        range = 1;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.MEDIUM;
        tType = TargetType.AIR;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn(){
        
    }

}
