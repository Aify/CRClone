/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class BabySparky extends Card  
{
    public BabySparky()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 3;
        id = 4;
        hp = 166;
        damage = 700;
        range = 100;
        attackCooldown = 7;
        splashRange = 30;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn() {

    }

}
