/**
 * Write a description of class Archers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archers extends Card 
{
    public Archers()
    {
        elixirCost = 3;
        amountOfTroops = 2;
        spawnTime = 1;
        id = -1;
        hp = 254;
        damage = 86;
        range = 100;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
