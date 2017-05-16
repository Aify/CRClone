/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class CocanutCannon extends Card  
{
    public CocanutCannon()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 2;
        id = 9;
        hp = 300;
        damage = 300;
        range = 140;
        attackCooldown = 7;
        splashRange = 50;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}

