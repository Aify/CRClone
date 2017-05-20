/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Card 
{
    public Fireball()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 1;
        damage = 572;
        range = 9999999;
        attackCooldown = 1;
        splashRange = 50;
        speed = Speed.FAST;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
