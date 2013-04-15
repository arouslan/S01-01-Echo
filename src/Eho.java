/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 15.04.13
 * Time: 11:30
 */
public class Eho {
    public static void main(String[] args) {
        if (args.length > 0) {
            // распечатаем все что попало в командную строку
            for (String arg : args) {
              System.out.println("-> " + arg);
            }
        } else {
             // Вешаем эхо клавиатуры
            System.out.println("Тут будет эхо");
        }

    }
}
