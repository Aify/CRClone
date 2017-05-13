/**
 * Twists opponents minds and turn them into your troops.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MindTwister extends Card 
{
  private int elixirCost = 8;
  private int amountOfTroops = 1;
  private int troopID;
  private int spawnTime = 1;

  private int id = 5;
  private int hp = 750;
  private int damage = 50;
  private int range = 20;
  private int attackCooldown = 1;
  private int splashRange = 5;

  private Speed speed = Speed.MEDIUM;
  
  private DamageType dType;
  private TargetType tType = TargetType.GROUND;
  private TargetType MTType = TargetType.GROUND;

  private int attackTime;

  public void spawn(){

    }
  public String toString(){
	return "" + troopID + "[" + amountOfTroops + "[" + elixirCost + "]";
  }
}
