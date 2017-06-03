/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juggernut extends Card  
{
    public Juggernut()
    {
        elixirCost = 7;
        amountOfTroops = 1;
        spawnTime = -1;
        id = 4;
        hp = 3500;
        damage = 800;
        range = 0;
        attackCooldown = 2;
        splashRange = 0;
        speed = Speed.SLOW;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn() {

    }
}
