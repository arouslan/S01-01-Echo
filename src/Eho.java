import java.util.Scanner;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 15.04.13
 * Time: 11:30
 */
public class Eho {
    public static void main(String[] args) {
        System.out.println("Программа для вывода эха");
        if (args.length > 0) {
            // распечатаем все что попало в командную строку
            System.out.println("Режим эха с командной строки");
            for (String arg : args) {
                System.out.println("-> " + arg);
            }
        } else {
            // Вешаем эхо клавиатуры
            Scanner scn = new Scanner(System.in);
            System.out.println("Режим эха с клавиатуры (для выхода exit)");
            String sStr;
            while (scn.hasNext() ) {
                sStr = scn.next();
                if(sStr.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println("-> " + sStr);
            }
            System.out.println("Эхо выключено");
        }
    }

}
