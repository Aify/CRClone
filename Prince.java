/**
 * Write a description of class Prince here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prince extends Card 
{
    public Prince()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 1463;
        damage = 325;
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
