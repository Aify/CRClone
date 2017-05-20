/**
 * Write a description of class Giant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Giant extends Card 
{
    public Giant()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 3344;
        damage = 211;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn(){
        
    }
}
