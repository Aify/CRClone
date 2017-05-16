/**
 * Write a description of class Bomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomber extends Card 
{
    public Bomber()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 2;
        id = 5;
        hp = 311;
        damage = 271;
        range = 80;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }

}
