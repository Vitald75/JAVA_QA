// Задание №6 Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов. 
// Для преобразования из String в double используйте метод Double.parseDouble(String s).

public class task_06 {
    public static void main(String [] args){
        double sum = 0;        
        int i; 
        for (i=0; i<args.length; i++) {
            sum = sum + Double.parseDouble(args[i]);
        }
        double avg = sum / i;
        System.out.println("Среднее значение "+ avg);
     }   
}
