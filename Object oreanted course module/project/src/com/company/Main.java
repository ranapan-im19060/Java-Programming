package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int parse =0 ;
        int parse2 = 0;
        //Inventory inventory[] = new Inventory[200];
        Furniture furniture[] = new Furniture[200];
        Electronic electronic[] = new Electronic[200];
        boolean flag = true;
        System.out.println("Welcome to Inventory Management System");
        while(flag){
            System.out.println("\nPlease select the relevant option\n1.Add product to inventory\n2.View current inventory\n3.Delete object from inventory \n4.ShutDown the system\n\n");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number == 1 ){
                System.out.println("\nPlease select the category\n1.Electronic\n2.Furniture\n\n");
                int second = scanner.nextInt();
                scanner.nextLine();

                if(second == 1){
                    System.out.println("What is the type:");
                    String type = scanner.nextLine();
                    System.out.println("Who is the manufacture:");
                    String manufacture = scanner.nextLine();
                    Electronic name = new Electronic(type,manufacture);
                    electronic[parse] = name;
                    parse = parse + 1;
                }else if(second == 2){
                    System.out.println("What is the type:");
                    String type = scanner.nextLine();
                    System.out.println("Who is the manufacture:");
                    String manufacture = scanner.nextLine();
                    Furniture name = new Furniture(type,manufacture);
                    furniture[parse2] = name;
                    parse2 = parse2 + 1;

                }else{}
            }else if(number == 2){
                System.out.println("\n\n*******************\nPrinting electronic inventory.........");
                for(int i = 0; i<parse; i++){
                    System.out.println("type is --> " + electronic[i].getType() + "/ manufacture --> " + electronic[i].getManufacture() );
                }
                System.out.println();
                System.out.println("\n\n*******************\nPrinting furniture inventory.........");
                for(int i = 0; i<parse2; i++){
                    System.out.println("type is --> " + furniture[i].getType() + "/ manufacture --> " + furniture[i].getManufacture() );
                }
                System.out.println("\n\n");
            }else if (number == 4){
                System.out.println("Machine is stopped.......");
                flag =false;
            } else if (number == 3){
                System.out.println("Please select the category");
                System.out.println("1 --> Electronic Devices\n2 --> Furniture");
                int selection = scanner.nextInt();
                scanner.nextLine();
                if(selection == 1){
                    System.out.println("Please select the number of electronic device that you want to remove");
                    for(int i = 0; i<parse; i++){
                        System.out.println("NUMBER --> " + parse + "type is --> " + electronic[i].getType() + "/ manufacture --> " + electronic[i].getManufacture() );
                    }
                    System.out.println("Enter the number");
                    int item = scanner.nextInt();
                    scanner.nextLine();

                }else if(selection == 2){
                    System.out.println("Please select the number of furniture object that you want to remove");
                    for(int i = 0; i<parse; i++){
                        System.out.println("NUMBER --> " + parse + "type is --> " + electronic[i].getType() + "/ manufacture --> " + electronic[i].getManufacture() );
                    }
                }else{
                    System.out.println("Error");
                }
            }else{
                System.out.println("Please select a correct option\n");
            }
        }

    }
}
