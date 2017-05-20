/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Card 
{
    public Knight()
    {
        elixirCost = 3;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 1399;
        damage = 159;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
