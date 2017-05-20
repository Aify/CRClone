/**
 * Write a description of class Lightning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lightning extends Card 
{
    public Lightning()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 0;
        damage = 864;
        range = 9999999;
        attackCooldown = 1;
        splashRange = 65;
        speed = Speed.SLOW;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
