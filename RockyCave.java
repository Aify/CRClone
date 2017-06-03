/**
 * Spawns 1 Golem every 25 seconds.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockyCave extends Card 
{
    public RockyCave()
    {
        elixirCost = 8;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 800;
        damage = 260;
        range = 1;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn(){
        
    }
}
