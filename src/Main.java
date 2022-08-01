public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishmentAmount = 1550;
        int bonusAmount = 0;
        int bonusReplenishmentAmount = 100;

        if (replenishmentAmount >= 1000){
            bonusAmount = replenishmentAmount / bonusReplenishmentAmount;
            balance = balance + replenishmentAmount + bonusAmount;
            System.out.println(balance);
            System.out.println(bonusAmount);
        } else {
            balance = balance + replenishmentAmount;
            System.out.println(balance);
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}