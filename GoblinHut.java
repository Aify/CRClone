/**
 * Write a description of class GoblinHut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoblinHut extends Card 
{
    public GoblinHut()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1293;
        damage = 50;
        range = 100;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.HYPER;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
