// Задание №9 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.,
public class task_09 {
    public static void main(String [] args){
        int i = 1;
        while (i<101) {
            if ( i % 5 == 0 ) {System.out.println(i);}
            i++;
        }
     }   
}
