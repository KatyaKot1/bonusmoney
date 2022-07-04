public class Main {
    public static void main(String[] args) {
        int account = 1000;
        int payment = 1100;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finalaccount = account + payment + bonus;

        System.out.println("Сумма на счете: " + finalaccount);
        System.out.println("Бонусные рубли: " + bonus);
    }


}
