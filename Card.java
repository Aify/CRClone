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
        //safe defaults
        elixirCost = 1;
        amountOfTroops = 1;
        spawnTime = 1;
        id = -1;
        hp = 100;
        damage = 100;
        range = 50;
        attackCooldown = 1;
        splashRange = 1;
        speed = Speed.MEDIUM;
        tType = TargetType.GROUND;
        MTType = TargetType.ALL;
        
    }
    
    public String toString() {
        return "" + id + "[" + amountOfTroops + "[" + elixirCost + "]";
    }
    
    public int getElixirCost() {
        return elixirCost;
    }
    
    public int getAmountOfTroops() {
        return amountOfTroops;
    }
    
    public int getSpawnTime() {
        return spawnTime;
    }
    
    public int getId() {
        return id;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getRange() {
        return range;
    }
    
    public int getAttackCooldown() {
        return attackCooldown;
    }
    
    public int getSplashRange() {
        return splashRange;
    }
    
    public Speed getSpeed() {
        return speed;
    }
    
    public DamageType getDType() {
        return dType;
    }
    
    public TargetType getTType() {
        return tType;
    }
    
    public TargetType getMTType() {
        return MTType;
    }
    
    public int getAttackTime() {
        return attackTime;
    }

    
    
}
