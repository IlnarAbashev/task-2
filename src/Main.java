public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int depositAmount = 1500;
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int result = balance + depositAmount + bonus;

        System.out.println("Итоговый счет :" + result);
        System.out.println(bonus);
    }
}