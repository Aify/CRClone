/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Card 
{  
    public Rocket()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1;
        damage = 493;
        range = 99999999;
        attackCooldown = 1;
        splashRange = 30;
        speed = Speed.SLOW;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
