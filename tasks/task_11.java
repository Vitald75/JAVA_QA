// Задание №11 Создайте условный оператор switch case для проверки дня недели 
//(день недели можно передать через Scanner или инициализировать прямо в коде). Вывести в консоль значение дня недели,
import java.util.Scanner;
public class task_11 {
    public static void main(String [] args){
        System.out.println("Введи номер дня недели 1-7, а я угадаю его название). Чтобы закончить введи 0");
        Scanner scanner = new Scanner(System.in);
        String day = " ";
        while (true) {
           if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введено не целое число.");   
         } else {
            int number = scanner.nextInt();
            switch (number) {
                case 1: 
                    day = "Monday";
                    break;
                case 2: 
                    day = "Tuesday";
                    break;
                case 3: 
                    day = "Wednesday";
                    break;
                case 4: 
                    day = "Thursday";
                    break;
                case 5: 
                    day = "Friday";
                    break;
                case 6: 
                    day = "Saturday";
                    break;
                case 7: 
                    day = "Sunday";
                    break;
                default:
                    day = "Ошибка ввода.";
                    break;
            }
            System.out.println(number  +  " - " + day);
            if (number==0) { break; }
        }
        } 
    }
}
