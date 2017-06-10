/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class ArcherGod extends Card  
{
    public ArcherGod()
    {
        elixirCost = 9;
        amountOfTroops = 1;
        spawnTime = 12;
        id = 1;
        hp = 1500;
        damage = 1200;
        range = 150;
        attackCooldown = 7;
        splashRange = 40;
        speed = Speed.FAST;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public void spawn() {

    }
}
