/**
 * Arrows are sharp!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrows extends Card 
{

    public Arrows()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 0;
        damage = 243;
        range = 9999999;
        attackCooldown = 1;
        splashRange = 20;
        speed = Speed.FAST;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
