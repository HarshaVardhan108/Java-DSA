package ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Bank.services();
    }
}

class Bank {
    public static void services() {
        try {
            Atm.transaction();
        } catch (Exception e) {
            System.out.println("Exception received");
        }
    }
}

class Atm {

    public static void transaction() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter pin");
            int pin = sc.nextInt();
            System.out.println("Balance amount is 1000");
        } catch (Exception e) {
            System.out.println("Exception handled");
            throw e;
        }
    }
}