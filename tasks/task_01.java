//Задание №1
//В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. 
public class task_01 {
    public static void main(String [] args){
        int q = 56;
        int w = 10;
        System.out.println("Результат деления "+ q + " на " + w + ": " + "целая часть - " + (int) Math.floor(q/w) + ", в остатке " + q % w);
        
     }   
}
