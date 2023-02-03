// 15) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class task_15 {
    public static void main(String [] args){
        int [] randomArray = new int[11];
        int [] results = new int [3];
       
        for (int i=0; i<=10; i++) {
            randomArray[i] = (int) (-2 + Math.random() * 4);
            System.out.print( randomArray[i] + " ");
            results[randomArray[i]+1]++;
        }
        System.out.println("");
        for (int i : results)
        {
            System.out.print(i + " ");
        }
         
        int max = results[0];
        for (int i : results)
        {
            if (i > max) {max = i; }
        }

        System.out.println("");

        int maxCount = 0;
        int numberMax = 0;

        // реализация через for i=0
        // for (int i=0; i<=results.length-1; i++)
        // {
        //     if (results[i] == max) {
        //         maxCount++; 
        //         numberMax = i;
        //     }
        // }
        
        // реализация через for each 
        int j = 0;
        for (int count : results){
            if ( count == max) {
                    maxCount++; 
                    numberMax = j;
            }
            j++;
        }

        if (maxCount==1) {
            System.out.println("Число " + (numberMax-1) + " встречается " + max + " раз.");
        }
     
    }
}