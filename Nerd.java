/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nerd extends Card  
{
    public Nerd()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 400;
        damage = 450;
        range = 120;
        attackCooldown = 0;
        splashRange = 15;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}

