// Задание №10 Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
// n! = 1*2*...*n;​
// 0! = 1;
// 5! = 1*2*3*4*5;
// Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.

public class task_10 {
    public static void main(String [] args){
        int randomN = (int) (Math.random() * 6); 
        int fackToReal = 1;
        for (int i=1; i<=randomN; i++) {
            fackToReal = fackToReal * i;
        }
                
        System.out.println("Факториал " + randomN + "! = " + fackToReal);
       
     }        
}
