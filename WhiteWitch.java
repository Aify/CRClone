/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class WhiteWitch extends Card  
{
	public WhiteWitch()
	{
		elixirCost = 7;
		amountOfTroops = 1;
		spawnTime = 10;


<<<<<<< HEAD
    private int id = 3;
    private int hp = 220;
    private int damage = 320;
    private int range = 0;
    private int attackCooldown = 7;
    private int splashRange = 50;
    
    private Speed speed = Speed.MEDIUM;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target
=======
		id = 62;
		hp = 220;
		damage = 320;
		range = 0;
		attackCooldown = 7;
		splashRange = 50;
			
		speed = Speed.MEDIUM;

		tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
		MTType = TargetType.ALL;  // my t type, what the troop prefers to target
	}
>>>>>>> e9facda71d83a70bbe9508f69bb4c56ed140322c


    public void spawn() {

    }

}
