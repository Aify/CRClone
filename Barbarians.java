/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbarians extends Card  
{
    public Barbarians()
    {
        elixirCost = 5;
        amountOfTroops = 4;
        spawnTime = 1;
        id = -1;
        hp = 700;
        damage = 130;
        range = 10;
        attackCooldown = 1;
        splashRange = 0;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn() {

    }
}
