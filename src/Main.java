
public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int refill = 200;
        int bonus;

        if (refill <= 300) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }
        clientAccount = clientAccount + refill + bonus;

        System.out.println("На Вашем счету " + clientAccount + " рублей, в том числе " + bonus + " бонусных рублей");
    }
}