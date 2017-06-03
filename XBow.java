/**
 * Write a description of class XBow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class XBow extends Card 
{
    public XBow()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 1330;
        damage = 26;
        range = 230;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.SLOW;
        tType = TargetType.BUILDINGS;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn(){
        
    }
}
