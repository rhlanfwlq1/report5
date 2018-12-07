package jp.ac.uryukyu.ie.e185739;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;


    /**
     *コンストラクタ。
     * @param name
     * @param maximumHP
     * @param attack
     */


    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void attack (LivingThing opponent){
        if (!isDead()){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded (int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
