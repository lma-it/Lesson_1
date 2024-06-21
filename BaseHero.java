import java.util.ArrayList;
import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random rand;

    protected String name;
    protected static ArrayList<String> names = new ArrayList<>();
    protected int hp;
    protected int maxHp;

    static{
        BaseHero.number = 0;
        BaseHero.rand = new Random();
    }

    public BaseHero(String name){
        if(name.isEmpty() || names.contains(name)){
            this.name = String.format("%s_Name_%d", getClass().toString().replaceAll("class ", ""), ++BaseHero.number);
            this.maxHp = BaseHero.rand.nextInt(100, 200);
            this.hp = maxHp;
        }else{
            this.name = name;
            this.maxHp = BaseHero.rand.nextInt(100, 200);
            this.hp = maxHp;
            names.add(name);
        }
    }

    public String getInfo(){
        return String.format("Name: %s Hp: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage){
        if (this.hp - damage > 0){
            this.hp -= damage;
        }
    }

    public int Attack(BaseHero target){
        int damage = BaseHero.rand.nextInt(10, 20);
        target.GetDamage(damage);
        return damage;
    }
    
}
