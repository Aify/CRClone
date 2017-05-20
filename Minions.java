/**
 * Write a description of class Minions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minions extends Card 
{
    public Minions()
    {
        elixirCost = 3;
        amountOfTroops = 3;
        spawnTime = 1;
        id = 5;
        hp = 190;
        damage = 84;
        range = 40;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.FAST;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
