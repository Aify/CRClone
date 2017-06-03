/**
 * Spawns 1 Elite Barbarian every 20 seconds.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliteSpawner extends Card 
{
    public EliteSpawner()
    {
        elixirCost = 7;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1200;
        damage = 100;
        range = 1;
        attackCooldown = 5;
        splashRange = 1;
        speed = Speed.FAST;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn(){
        
    }
}
