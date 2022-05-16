public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int add = 1100;

        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int total = balance + add + bonus;

        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговый счет:" + total);
    }
}
