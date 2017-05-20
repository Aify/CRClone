/**
 * Write a description of class Musketeer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musketeer extends Card 
{
    public Musketeer()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 598;
        damage = 176;
        range = 120;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
