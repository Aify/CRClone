/**
 * Write a description of class Valkyrie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Valkyrie extends Card 
{
    public Valkyrie()
    {
        elixirCost = 4;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1548;
        damage = 211;
        range = 1;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
