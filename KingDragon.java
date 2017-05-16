/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class KingDragon extends Card  
{
    public KingDragon()
    {
        elixirCost = 6;
        amountOfTroops = 1;
        spawnTime = 3;
        id = 4;
        hp = 1800;
        damage = 300;
        range = 80;
        attackCooldown = 7;
        splashRange = 40;
        speed = Speed.MEDIUM;
        tType = TargetType.AIR;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}
