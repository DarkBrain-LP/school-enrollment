package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static String schoolName = "LP-School";
    private static int userSelection;
    private static boolean selectedInrollment = false;
    private static String users ;

    private static Scanner sc = new Scanner(System.in);

    public Date readDate() throws Exception{
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        return new SimpleDateFormat(dateFormat).parse(scanner.nextLine());
    }

    public static void showMainMenue(){
        System.out.println("Bienvenue sur la plateforme d'inscription à" + schoolName);

        System.out.println("\n\n\nSelectionnez l'opération que vous voulez faire");
        System.out.println("1: Inscription");
        System.out.println("2: Connexion");
    }

    public static int menueOperation(){
        selectedInrollment = true;
        userSelection = sc.nextInt();
        System.out.println("Vous avez sélectionné l'option " + userSelection);
        return userSelection;
    }

    public static void enrollmentOperation(){
        String username = sc.nextLine();
        String password = sc.nextLine();
        String name = sc.nextLine();
        String firstName = sc.nextLine();
        int age = sc.nextInt();
    }

    public static boolean loginOperation(){
        String username = sc.nextLine();
        String password = sc.nextLine();

        return true;
    }



    public static void main(String[] args){
        showMainMenue();
        menueOperation();

        if(selectedInrollment){

        }
    }
}
