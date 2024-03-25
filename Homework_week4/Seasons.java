import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month name: ");
        String month = input.nextLine();

    switch (month){
        case "January", "january":
            System.out.println("Winter");
        break;

        case "February","february":
            System.out.println("Winter");
            break;

        case "March","march":
            System.out.println("Spring");
            break;

        case "April", "april":
            System.out.println("Spring");
            break;

        case "May","may":
            System.out.println("Spring");
            break;

        case "June","june":
            System.out.println("Summer");
            break;

        case "July","july":
            System.out.println("Summer");
            break;

        case "August","august":
            System.out.println("Summer");
            break;

        case "September","september":
            System.out.println("Autumn Fall");
            break;

        case "October","october":
            System.out.println("Autumn Fall");
            break;

        case "November","november":
            System.out.println("Autumn Fall");
            break;

        case "December","december":
            System.out.println("Winter");
            break;

        default:
            System.out.println("There is no such season");
    }
    }
}
