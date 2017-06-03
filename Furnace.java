/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class Furnace extends Card  
{
    public Furnace()
    {
        elixirCost = 5;
        amountOfTroops = -1;
        spawnTime = 40;
        id = 3;
        hp = 1100;
        damage = 0;
        range = 0;
        attackCooldown = 0;
        splashRange = 0;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}
