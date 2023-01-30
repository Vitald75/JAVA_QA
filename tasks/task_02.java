// Задание №2
// В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n

public class task_02 {
    public static void main(String [] args){
        byte n = 56;
        System.out.println("Сумма цифр числа " + n +  " = " + ((int) Math.floor(n / 10) + (n % 10)));
        
     }    
}
