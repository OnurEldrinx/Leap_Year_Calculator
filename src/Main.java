import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Leap Years: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 , etc.

        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("Enter a year value: ");
        year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 == 0)){


            if (year % 400 == 0){

                System.out.println(year + " is a leap year!");

            }else {

                System.out.println(year + " is not a leap year!");

            }


        }else if ((year % 4 == 0) && (year % 100 != 0)){

            System.out.println(year + " is a leap year!");

        }else{

            System.out.println(year + " is not a leap year!");

        }





    }
}
