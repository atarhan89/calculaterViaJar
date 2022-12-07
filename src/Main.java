import hesapMakinesiJar.hesapMakinesiJar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner keyBoard = new Scanner(System.in);

        int sayı1 ;
        int sayı2 ;


        while(true){
        System.out.println("Select the operation you want to run!");
        System.out.println("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Sinus \n" +
                "6: Cosinus \n7: Tangent\n8: Squareroot \n9: Power\n10: Mod ");
        int operand = keyBoard.nextInt();

        switch (operand){



            case 1 :
                System.out.println("addition");
                System.out.println("please your first number");
               sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.add(sayı1,sayı2);
            case 2 :
                System.out.println("subtract");
                System.out.println("please your firs number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your first number");
                sayı2 = keyBoard.nextInt();
                hesapMakinesiJar.subtract(sayı1,sayı2);
                break;
            case 3 :
                System.out.println("multiply");
                System.out.println("please your first number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.multiply(sayı1,sayı2);
                break;
            case 4:
                System.out.println("divide");
                System.out.println("please your first number");
                sayı1 = keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.divide(sayı1,sayı2);
                break;
            case 5 :
                System.out.println("sinus");
                System.out.println("please your firs number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2=keyBoard.nextInt();
                hesapMakinesiJar.sinus(sayı1,sayı2);
                break;
            case 6:

                System.out.println("cosinus");
                System.out.println("please your firs number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2=keyBoard.nextInt();
                hesapMakinesiJar.cosinus(sayı1,sayı2);
            case 7:

                System.out.println("Tangent");
                System.out.println("please your first number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2=keyBoard.nextInt();
                hesapMakinesiJar.tan(sayı1,sayı2);
            case 8 :
                System.out.println("Squareroot");
                System.out.println("please your first number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.sqrt(sayı1, sayı2);
            case 9:
                System.out.println("Power");
                System.out.println("please your first number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.power(sayı1, sayı2);
                break;
            case 10 :
                System.out.println("Mod");
                System.out.println("please your first number");
                sayı1= keyBoard.nextInt();
                System.out.println("please your second number");
                sayı2= keyBoard.nextInt();
                hesapMakinesiJar.mod(sayı1, sayı2);
                break;
            default:
                System.out.println("The function you have entered has been misspelled or has not yet been implemented!");

            break;
        } }

    }
    }