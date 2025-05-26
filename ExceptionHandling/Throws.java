package ExceptionHandling;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws EligibilityException {
        String branch = "mech";
        int minPer = 60;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter branch");
        String input = sc.next();
        System.out.println("Enter Percentage");
        int per = sc.nextInt();
        if((per >= 60 && per <= 100) && input.equals(branch))
            System.out.println("Eligible");
        else
            throw new EligibilityException("Not eligible");
    }
}

class EligibilityException extends Exception {
    public EligibilityException(String msg) {
        super(msg);
    }
}