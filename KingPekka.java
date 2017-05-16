/**
 * One hits all units but slow lazy and weak.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KingPekka extends Card 
{
    public KingPekka()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 2;
        id = 5;
        hp = 1050;
        damage = 2000;
        range = 2;
        attackCooldown = 2;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn(){
        
    }
}
