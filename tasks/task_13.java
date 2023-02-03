// 13) Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. 
// Напоминаем, что первый и второй члены последовательности равны единицам, 
// а каждый следующий — сумме двух предыдущих.

public class task_13 {
    public static void main(String [] args){
        int [] fiboArray = new int[20];
        fiboArray[0] = 1;
        fiboArray[1] = 1;
        
        for (int i=2; i<=19; i++) {
            fiboArray[i] = fiboArray[i-1] +fiboArray[i-2];;
        }

        for (int i : fiboArray)
        {
            System.out.println(i);
        }
                
     }        
}
