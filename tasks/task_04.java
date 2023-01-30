// Задание № 4 товар А стоит 200 руб и на него скидка 15%, а товар Б стоит 30 руб. Клиент взял 10 A и 2 Б. Выведите итоговую цену.
public class task_04 {
    public static void main(String [] args){
        int priceA = 200;
        int discountA = 15;
        int countA = 10;
        int priceB = 30;
        int discountB = 0;
        int countB = 2;
        System.out.println("Итоговая цена:" + ((priceA * countA)*(100-discountA)/100 + (priceB * countB)*(100-discountB)/100) + " руб.");
        
     } 

}
