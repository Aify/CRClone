/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballista extends Card  
{

    public Ballista()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = -1;
        id = 6;
        hp = 800;
        damage = 550;
        range = 200;
        attackCooldown = 0;
        splashRange = 0;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }

}
