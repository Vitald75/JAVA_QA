import java.util.Scanner;

public class task_05 {
    public static void main(String [] args){
        System.out.println("Введи число, а я угадаю четное оно или нет. Чтобы закончить введи 0");
        Scanner scanner = new Scanner(System.in);
        while (true) {
           if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введено не целое число.");   
         } else {
            int number = scanner.nextInt();
            String result = (number % 2 == 0) ? "Четное" : "Нечетное";
            System.out.println(number +  " - " + result);
            if (number==0) { break; }
        }
        } 
    }
}
