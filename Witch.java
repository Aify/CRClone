/**
 * Write a description of class Witch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Witch extends Card 
{
    public Witch()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 3;
        id = 63;
        hp = 665;
        damage = 69;
        range = 100;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
