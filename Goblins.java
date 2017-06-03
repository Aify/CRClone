/**
 * Write a description of class Goblins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblins extends Card 
{
    
    public Goblins()
    {
        elixirCost = 2;
        amountOfTroops = 3;
        spawnTime = 2;
        id = -1;
        hp = 169;
        damage = 106;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.HYPER;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }

}
