/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trump extends Card  
{
    public Trump()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 8;
        hp = 1500;
        damage = 400;
        range = 100;
        attackCooldown = 1;
        splashRange = 0;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}
