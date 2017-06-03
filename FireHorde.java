/**
 * 6 Fire spirits instead of 3. Now it's a fire HORDE!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireHorde extends Card 
{
    public FireHorde()
    {
        elixirCost = 4;
        amountOfTroops = 6;
        spawnTime = 1;
        id = -1;
        hp = 45;
        damage = 85;
        range = 3;
        attackCooldown = 1;
        splashRange = 10;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
