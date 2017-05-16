/**
 * Write a description of class GoblinBarrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoblinBarrel extends Card 
{
    public GoblinBarrel()
    {
        elixirCost = 3;
        amountOfTroops = 3;
        spawnTime = 1;
        id = 5;
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
