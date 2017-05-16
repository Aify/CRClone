/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class PEKKAHut extends Card  
{
    public PEKKAHut()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 16;
        id = 8;
        hp = 1200;
        damage = 0;
        range = 0;
        attackCooldown = 0;
        splashRange = 0;
        speed = Speed.MEDIUM;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
    
}
