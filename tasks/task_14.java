import java.util.Arrays;

// 14) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел 
// из отрезка [10;99]. Вывести массив на экран.     

public class task_14 {
    public static void main(String [] args){
        int [][] randomArray = new int[8][5];
       
        
        for (int i=0; i<=7; i++) {
            for (int j=0; j<=4; j++) {
                randomArray[i][j]=(int) (10 + Math.random() * 90);
            }
        }
   
        for (int [] row : randomArray) {
            for (int elem: row) {
                System.out.print(elem + "\t");
            }
            System.out.println();  
        }

        // альтернативный вывод, по строкам
        Arrays.stream(randomArray).map(Arrays::toString).forEach(System.out::println);
     }        
}
