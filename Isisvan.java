/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isisvan extends Card  
{
    public Isisvan()
    {
        elixirCost = 3;
        amountOfTroops = 3;
        spawnTime = 1;
        id = 7;
        hp = 0;
        damage = 0;
        range = 2000;
        attackCooldown = 0;
        splashRange = 0;
        speed = Speed.FAST;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}
