import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;

/**
 * Write a description of class Troop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Troop extends Actor
{
    public int playerNumber;
    
    private int id;
    private int hp;
    private int damage;
    private int range;
    private int attackCooldown;
    private int splashRange;
    
    private Speed speed;
    
    private DamageType dType;
    private TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
    private TargetType mTType = TargetType.GROUND;  // my t type, what the troop prefers to target
    
    // are we currently doing our attack 
    private boolean attacking;
    // are we in range of starting an attack
    private boolean inRange;
    // are we currently targeting something
    private boolean targeting;
    
    private Troop targetedEnemy;
   
    private int positionX;
    private int positionY;

    public boolean active = false;
    private Date spawnTime;
    
    // represents the amount of time it takes to finish an attack
    private int attackTime;
    private int curAttack = 0;    

    /**
     * Act - do whatever the Troop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        if(active)
        {
            //if active, act
            positionX = getX();
            positionY = getY();
            
            getTarget();
            
            move();
            
            if (attacking) {
                attack();
            }
        }
        else if(spawnTime != null)
        {
            //if we have a spawntime we were just spawned and are waiting to go active
            if(new Date().after(spawnTime)) //this actually means "is now later than when we are supposed to spawn?"
            {
                //if true, go active and clear spawnTime 
                active = true;
                spawnTime = null;
            }
        }
    }
    
    public void move() {
        if (active) {
            
            if (targeting && !inRange && !attacking) {
                // get the direction we want to move in, which is towards the targetted enemy
                double a = getAngleToTarget(targetedEnemy);
                
                double distanceX = 0;
                double distanceY = 0;
                // now we know the angle, we can caculate based on our speed how much to move
                switch (speed) {
                    case SLOW:
                        distanceX = 10 * Math.sin(a);
                        distanceY = 10 * Math.cos(a);
                        break;
                    case MEDIUM:
                        distanceX = 20 * Math.sin(a);
                        distanceY = 20 * Math.cos(a);
                        break;
                    case FAST: 
                        distanceX = 30 * Math.sin(a);
                        distanceY = 30 * Math.cos(a);
                        break;
                    case HYPER:
                        distanceX = 40 * Math.sin(a);
                        distanceY = 40 * Math.cos(a);
                        break;
                }
                
                if (targetedEnemy.positionY > positionY) {
                    setLocation((int) (getX() + distanceX), (int) (getY() + distanceY));
                } else {
                    setLocation((int) (getX() + distanceX), (int) (getY() - distanceY));
                }
            } else {
                // move towards the closest path
                
            }
        }
    }
    
    public void getTarget() {
        Troop closestEnemy = null;
        
        if (MyWorld.allTroops.get(0) == null) {
            return;
        }
        double closestDistance = getDistanceToTarget(MyWorld.allTroops.get(0));
        
        // code to find closest enemy
        for (Troop t : MyWorld.allTroops) {
            // check if t is the closest enemy and is in range, etc etc
            if ((checkIsEnemy(t)) && (checkCanHit(t))) {
                if (getDistanceToTarget(t) < closestDistance) {
                    closestEnemy = t;
                    closestDistance = getDistanceToTarget(t);
                    break;
                }
            }
        }
        
        if (closestEnemy == null) {
        } else {
        
            // check if closest enemy is inside our attack range
            if (closestDistance < range) {
                attacking = true;
            } else if (closestDistance <= (range + 10000)) {
                targetedEnemy = closestEnemy;
                targeting = true;
            } else {
                // set the path as the target
                targeting = false;
                inRange = false;
            }
        }
        
    }
    
    public boolean checkCanHit(Troop t) {
        if (mTType == TargetType.ALL) {
            return true;
        }
        
        if (t.getTargetType() == mTType) {
            return true;
        }
        
        return false;
    }
    
    public boolean checkIsEnemy(Troop t) {
        return (t.playerNumber == this.playerNumber);
    }
    
    public void attack() {
        curAttack++;
        if (curAttack >= attackTime) { 
            targetedEnemy.takeDamage(damage);
            curAttack = 0;
            attacking = false;
        }
    }
    
    public double getAngleToTarget(Troop t) {
        double angle = 0.0;
        
        angle = Math.asin((t.positionX - positionX)/getDistanceToTarget(t));
        return angle;
    }
    
    public double getDistanceToTarget(Troop t) {
        int xDistance = t.positionX - positionX;
        int yDistance = t.positionY - positionY;

        if (xDistance == 0) {
            if (yDistance == 0) {
                return 0;
            }
        }

        int aSquaredPlusBSquared = (xDistance * xDistance) + (yDistance * yDistance);
        return Math.sqrt(aSquaredPlusBSquared);
    }
    
    public void takeDamage(int damage) {
        hp -= damage;
        
        if (hp <= 0) {
            getWorld().removeObject(this);
        }
    }
    
    public int getID() {
        return id;
    }
    
    public int getHP() {
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

    public DamageType getDamageType() {
        return dType;
    }

    public TargetType getTargetType() {
        return tType;
    }
    
    public TargetType getMTargetType() {
        return mTType;
    }
    
    public void setID(int id) {
        this.id = id;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setAttackCooldown(int attackCooldown) {
        this.attackCooldown = attackCooldown;
    }

    public void setSplashRange(int splashRange) {
        this.splashRange = splashRange;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void setDamageType(DamageType dType) {
        this.dType = dType;
    }

    public void setTargetType(TargetType tType) {
        this.tType = tType;
    }
    
    public void setMTargetType(TargetType mTType) {
        this.mTType = mTType;
    }
    
    public void setAttackTime(int attackTime) {
        this.attackTime = attackTime;
    }
    
    public void setSpawnTime(Date spawnTime) {
        this.spawnTime = spawnTime;
    }
   
}
