/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isis extends Card  
{
    public Isis()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = -1;
        id = 1;
        hp = 150;
        damage = 1300;
        range = 0;
        attackCooldown = 0;
        splashRange = 35;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.BUILDINGS;
        
    }
    
    public void spawn() {

    }
}
