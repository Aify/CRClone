/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Card  
{
    protected int elixirCost;
    protected int amountOfTroops;
    protected int spawnTime;
    
    protected int id;
    protected int hp;
    protected int damage;
    protected int range;
    protected int attackCooldown;
    protected int splashRange;
    
    protected Speed speed;
    
    protected DamageType dType;
    protected TargetType tType;
    protected TargetType MTType;
    
    protected int attackTime;
    
    public Card()
    {
        //Card superclass constructor
    }
    
    public String toString() {
        return "" + id + "[" + amountOfTroops + "[" + elixirCost + "]";
    }

}
