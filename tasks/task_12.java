// 12) Создайте массив из чётных чисел от 10 до 20 и выведите элементы массива на экран сначала в строку, 
// отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). 

public class task_12 {
    public static void main(String [] args){
        int [] evenNumbers = new int[6];
        

         for (int i = 0; i<=5; i++) {
             evenNumbers[i]= 10 + i*2; 
         }

        // реализация через foreach  - кривая) 
        // int j = 0;
        // for (int elem:evenNumbers) {
        //     evenNumbers[j] = 10 + j*2; 
        //     j++;
        // }
        
        for (int i : evenNumbers)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i : evenNumbers)
        {
            System.out.println(i);
        }
               
     }        
}
