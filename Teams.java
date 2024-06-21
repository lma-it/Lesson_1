import static print_module.print_library.printf;
import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        // int teamCount = 10;
        // Random rand = new Random();
        // int magicianCount = rand.nextInt(0, teamCount);
        // int priestCount = teamCount - magicianCount;

        //printf("magicianCount: %d, priestCount: %d", magicianCount, priestCount);

        // Priest[] priests = new Priest[priestCount];
        // Magician[] magicians = new Magician[magicianCount];

        // for (int i = 0; i < priestCount; i++){
        //     priests[i] = new Priest("Priest_Name");
        //     println(priests[i].getInfo());
        // }

        //println();

        // for (int i = 0; i < magicianCount; i++){
        //     magicians[i] = new Magician("Mage_Name");
        //     println(magicians[i].getInfo());
        // }

        // Создание teams с учетом Полиморфизма.
        var teams = new ArrayList<BaseHero>();

        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0; // rand.nextInt(0, teamCount);
        int priestCount = 0; //teamCount - magicianCount;

        for (int i = 0; i < teamCount; i++){
            if (rand.nextInt(2) == 0){
                teams.add(new Priest(""));
                priestCount++;
            }else{
                teams.add(new Magician(""));
                magicianCount++;
            }

            println(teams.get(i).getInfo());
        }
        printf("magicianCount: %d, priestCount: %d", magicianCount, priestCount);
    }
}
