/**
 * Write a description of class MiniPekka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniPekka extends Card 
{
    public MiniPekka()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 1056;
        damage = 572;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
