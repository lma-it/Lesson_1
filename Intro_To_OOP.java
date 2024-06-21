import static print_module.print_library.println;
import static print_module.print_library.printf;

/**
 * Intro_To_OOP
 */
public class Intro_To_OOP {

    public static void main(String[] args) {

        // int ax = 0;
        // int ay = 2;
        // int bx = 0;
        // int by = 1;
        // println(distance(ax, ay, bx, by));

        Point2D a = new Point2D(2, 10);
        Point2D b = new Point2D(3, 12);

        println(a);
        println(b);
        println(Point2D.distance(a, b));

        Robot robot = new Robot("Valle");
        Robot robot1 = new Robot("Valle");

        println(robot);
        println(robot1);

        robot.power();
        printf("%s %s", robot.getName(), robot.work());
        robot.power();
        robot.work();
        
        robot.power();
        robot.power();

        Magician mage = new Magician("Archmage");
        println(mage.getInfo());
        Priest priest = new Priest("Vul-Jin");
        println(priest.getInfo());

        // Полиморфизм

        BaseHero baseMage = new Magician("Lora");
        println(baseMage.getInfo());
        BaseHero basePriest = new Priest("Jakil");
        println(basePriest.getInfo());
        BaseHero basePriest1 = new Priest("Jakil");
        println(basePriest1.getInfo());
        
        println(mage.getInfo());
        println(priest.getInfo());
        println(mage.Attack(priest));
        println(priest.getInfo());
        println(mage.getInfo());
        println(priest.Attack(mage));
        println(mage.getInfo());



    }

    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


}