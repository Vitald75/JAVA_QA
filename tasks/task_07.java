// Задание №7 С помощью класса Scanner ввести целое число.
// Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”, 
// иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
// Используем оператор if-else. 

import java.util.Scanner;

public class task_07 {
    public static void main(String [] args){
        System.out.println("Введи целое число:");
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введено не целое число.");   
         } else {
            int number = scanner.nextInt();
            if ((number>=0) & (number<=10)) {
                System.out.println("Положительное число меньше либо равно 10 или ноль");
            }  else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }  
        }
        } 
    }

