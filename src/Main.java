public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int depositAmount = 200;

        int newBalance;
        int bonusAmount = depositAmount / 100;
        if (depositAmount <= 1000) {
            newBalance = balance + depositAmount;
            System.out.println(newBalance + " руб.");
        } else {
            newBalance = balance + depositAmount + bonusAmount;
            System.out.println("Ваш балланс равен: " + newBalance + " руб.");
            System.out.println("Сумма бонусов составила: " + bonusAmount + " руб.");
        }
    }
}