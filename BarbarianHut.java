/**
 * Write a description of class BarbarianHut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarbarianHut extends Card 
{
    public BarbarianHut()
    {
        elixirCost = 7;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 8;
        hp = 1936;
        damage = 159;
        range = 1;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
