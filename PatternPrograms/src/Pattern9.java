//*
//**
//***
//****
//*****
//*****
//****
//***
//**
//*
public class Pattern9 {
    public static void main(String[] args) {

        //Outer Loop
        for (int i = 1; i <= 5; i++) {
            //Inner loop for spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Loop for Stars
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            //Inner loop for spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Loop for Stars
            System.out.println();
        }
    }
}