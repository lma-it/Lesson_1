// ИНКАПСУЛЯЦИЯ - свойство системы, позволяющее объединить данные и методы, работающие с ними в классе, при этом скрыв детали реализации и защищая от пользователя этим классом, объектов класса от несанкционированных действий.
// Данный код есть пример Инкапсуляции в ООП. Изначально все методы были public и были все методы отдельно, а не упакованы в powerOn и powerOff. Затем были добавлены эти методы и все методы, который сейчас внутри, поменяли модификаторы доступа на private, кроме метода work. 
import static print_module.print_library.println;

import java.util.ArrayList;

public class Robot {

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
    /*
     * Уровень робота
     */
    private int level;

    /*
     * Имя робота
     */
    private String name;

    private State state;

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    /*
     * Создание робота
     * @param name имя робота. !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot(String name, int level) {
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot.names.indexOf(name) != -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }else{
            this.name = name;
        }

        Robot.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    public Robot(String name) {
        this(name, 1);
    }

    public Robot() {
        this("");
    }


    public void power(){
        if(this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        }else{
            this.powerOff();
            this.state = State.Off;
        }
    }

    


    private void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    /*
     * Загрузка BIOS
     */
    private void startBIOS(){println("Start BIOS...");}
    /*
     * Загрузка OS
     */
    private void startOS(){println("Start OS...");}
    /*
     * Приветствие
     */
    private void sayHi(){println("Hello World...");}
    /*
     * Выгрузка BIOS
     */
    private void stopBIOS(){println("Stop BIOS...");}
    /*
     * Выгрузка OS
     */
    private void stopOS(){println("Stop OS...");}
    /*
     * Прощание
     */
    private void sayBye(){println("Bye...");}
    /*
     * Работа
     */
    public String work(){
        if(this.state == State.On){
            return "I'm working...";
        }
        return "";
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Level: %d", getName(), getLevel());
    }

}
