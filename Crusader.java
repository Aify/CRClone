/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crusader extends Card  
{
    public Crusader()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 15;
        hp = 1000;
        damage = 475;
        range = 60;
        attackCooldown = 1;
        splashRange = 0;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn() {

    }
}
