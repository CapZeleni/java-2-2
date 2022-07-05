public class Main {
    public static void main(String[] args) {

        int accountAmount = 200; // сумма на счете

        int incomingPayment = 1600; // входящий платеж
        if (incomingPayment >= 1000) {
            System.out.println((incomingPayment / 100 + incomingPayment + accountAmount) + " остаток на счете");
        } else {
            System.out.println((incomingPayment + accountAmount) + " остаток на счете");
        }
    }
}