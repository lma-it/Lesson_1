
/*
 * Данный класс создан для реализации примера Наследования в ООП
 */
public class Magician extends BaseHero{
//           дочерний       родительский

    private int mana;
    private int maxMana;

    
    public Magician(String name) {
        super(name);
        this.maxMana = Magician.rand.nextInt(50, 150);
        this.mana = maxMana;
    }


    // public int Attack(){
    //     int damage = Magician.rand.nextInt(20, 30);
    //     this.mana -= (int)(damage * 0.8);
    //     if (mana < 0) return 0;
    //     else return damage;
    // }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}
