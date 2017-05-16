/**
 * Twists opponents minds and turn them into your troops.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MindTwister extends Card 
{
  public MindTwister()
    {
        elixirCost = 8;
        amountOfTroops = 1;
        spawnTime = 1;
        id = 5;
        hp = 750;
        damage = 50;
        range = 20;
        attackCooldown = 1;
        splashRange = 5;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.GROUND;
        
    }
  
  public void spawn(){

    }
}
