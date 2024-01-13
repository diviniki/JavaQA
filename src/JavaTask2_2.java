//!!! Программа по расчету бонусов за пополнение счета
public class JavaTask2_2 {

    public static void main(String[] args) {


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int count = 1570;
        int incomeSum = 200;

        if (count + incomeSum > 1000) {
            count = count + incomeSum;
            System.out.println("Итоговый счет: " + count);
            System.out.println("Количество бонусных рублей: " + incomeSum / 100);
        } else {
            count = count + incomeSum;
            System.out.println("Итоговый счет: " + count);
            System.out.println("Количество бонусных рублей: " + 0);
        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
