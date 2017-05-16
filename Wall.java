/**
 * Blocks enemy from attacking the tower. Troops cannot jump over it.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Wall extends Card 
{
    public Wall()
    {
        elixirCost = 7;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 3000;
        damage = 0;
        range = 0;
        attackCooldown = 0;
        splashRange = 0;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.GROUND;
        
    }
    
    public void spawn(){
    
    }
}