/**
 * Write a description of class SpearGoblins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearGoblins extends Card 
{
    public SpearGoblins()
    {
        elixirCost = 2;
        amountOfTroops = 3;
        spawnTime = 1;
        id = 46;
        hp = 110;
        damage = 50;
        range = 100;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.HYPER;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
