/**
 * Write a description of class Tombstone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tombstone extends Card 
{
    public Tombstone()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 56;
        hp = 422;
        damage = 67;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.FAST;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
