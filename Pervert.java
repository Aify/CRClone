/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pervert extends Card  
{
    public Pervert()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 610;
        damage = 100;
        range = 40;
        attackCooldown = 1;
        splashRange = 0;
        speed = Speed.HYPER;
        tType = TargetType.GROUND;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn() {

    }
}
