/**
 * Write a description of class BombTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombTower extends Card 
{
    public BombTower()
    {
        elixirCost = 5;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1672;
        damage = 176;
        range = 120;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
