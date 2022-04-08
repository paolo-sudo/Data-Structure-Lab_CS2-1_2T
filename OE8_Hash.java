/*
Paolo D.
CS 2-1 | OE8 "Implement Hashing Insert, Search, Delete and Update Operation"
 */

import java.util.HashMap;
import java.util.Scanner;

public class OE8_Hash {

    public static void main(String[] args) {
        int ans, ch, repeat=1;
        Scanner in = new Scanner(System.in);

        HashMap<Integer, String> studentData = new HashMap<>();
        boolean repeat2 = true;
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n\n\tHASHING PROGRAM");
        System.out.println("\tENTER STUDENT DATA AS MANY AS YOU LIKE!\n");

        do{
            System.out.print("\n\tID Number: ");
            Integer IDNumber = Integer.parseInt(Scan.nextLine());

            System.out.print("\tEnter Name: ");
            String name = Scan.nextLine(); // Insert Operation

            studentData.put(IDNumber, name); // Stores what the user has entered

            System.out.print("\n\tEnter another student? Press y if yes, n if no: "); // Will ask if the user wants to enter another data or not
            String answer = Scan.nextLine();

            // if operation when the user chose either y or n
            if (answer.equals("y") || answer.equals("Y")) { 
                continue;
            }else{
                break;
            }
            } while (repeat2);

        while(repeat!=0){
        System.out.println("\n\tAPPLICATION OF HASHING\n");
        System.out.println("\t[1] Search Data");
        System.out.println("\t[2] Delete Data");
        System.out.println("\t[3] Insert Data");
        System.out.println("\t[4] Print Data");
        System.out.println("\t[5] System Exit");
        System.out.print("\n\tSelect your choice: ");
        ans = in.nextInt();

        do{
           
        switch(ans){
            case 1:{ // Search Operation
                System.out.println("\n        ---------------------------------------");
                System.out.println("\t\t   Student DataBase");
                System.out.println("\n\t      ID Number  "+ "       Name");		
                for(int id:studentData.keySet()){
                    System.out.println("\t      "+id+"\t\t"+ studentData.get(id)); // Will get the updated student Data
                }
                System.out.println("        ---------------------------------------");

                Scanner sc = new Scanner(System.in);
                System.out.println("\n\n\tSearch Student Data");
                System.out.print("\n\tEnter ID Number: ");
                int key = sc.nextInt();

                boolean flag = studentData.containsKey(key);
                if(flag == true){
                    System.out.println("\n\n\tStudent Data Exist!");
                    System.out.println("\tStudent Name is: " + studentData.get(key)); // Will search in the current/updated student Data
                }
                else {
                    System.out.println("\n\n\tStudent Does Not Exist in the Table.");
                }

                    break;
            }
            case 2:{ // Delete Operation
                System.out.println("\n        ---------------------------------------");
                System.out.println("\t\t   Student DataBase");
                System.out.println("\n\t      ID Number  "+ "       Name");		
                for(int id:studentData.keySet()){
                    System.out.println("\t      "+id+"\t\t"+ studentData.get(id)); // Will get the updated student Data
                }
                System.out.println("        ---------------------------------------");

                Scanner scan = new Scanner(System.in);
                System.out.println("\n\n\tDelete Student Data");
                System.out.print("\n\tDelete ID Number: ");
                int IDDelkey = scan.nextInt();
                    

                boolean del = studentData.containsKey(IDDelkey);
                if(del == true){
                    System.out.println("\tStudent To Be Deleted: " + studentData.remove(IDDelkey)); // Will delete the ID that the user has entered
                    System.out.println("\n\n\tStudent Data Deleted...");
                }
                else {
                    System.out.println("\n\n\tStudent Does Not Exist in the Table.");
                }
                    
                System.out.println("\n        ---------------------------------------");
                System.out.println("\t\t   Student DataBase");
                System.out.println("\n\t      ID Number  "+ "       Name");		
                for(int idd:studentData.keySet()){
                    System.out.println("\t      "+idd+"\t\t"+ studentData.get(idd)); // Will get the updated student Data
                }
                System.out.println("        ---------------------------------------");
                break;
            }
            case 3:{ // Insert Operation
                System.out.println("\n        ---------------------------------------");
                System.out.println("\t\t   Student DataBase");
                System.out.println("\n\t      ID Number  "+ "       Name");		
                for(int id:studentData.keySet()){
                    System.out.println("\t      "+id+"\t\t"+ studentData.get(id)); // Will get the updated student Data
                }
                System.out.println("        ---------------------------------------");

                System.out.println("\n\n\tInsert Student Data");
                do{
                    System.out.print("\n\tID Number: ");
                    Integer IDNumber = Integer.parseInt(Scan.nextLine());
        
                    System.out.print("\tEnter Name: ");
                    String name = Scan.nextLine();
        
                    studentData.put(IDNumber, name); // Stores what the user has entered
        
                    System.out.print("\n\tEnter another student? Press y if yes, n if no: "); // Will ask if the user wants to enter another data or not
                    String answer = Scan.nextLine();
        
                    // if operation when the user chose either y or n
                    if (answer.equals("y") || answer.equals("Y")) { 
                        continue;
                    }else{
                        break;
                    }
                    } while (repeat2);
                break;
            }
            case 4:{ // Print Operation
                System.out.println("\n\n\tCurrent and Updated Student Data");
                System.out.println("\n        ---------------------------------------");
                System.out.println("\t\t   Student DataBase");
                System.out.println("\n\t      ID Number  "+ "       Name");		
                for(int id:studentData.keySet()){
                    System.out.println("\t      "+id+"\t\t"+ studentData.get(id)); // Will get the current/updated student Data
                }
                System.out.println("        ---------------------------------------");
                break;
            }
            case 5:{
                System.out.println("\n\tThank You For Trying The Program!\n\n"); // Exit the Program
                System.exit(0);
            }

            default:
                System.out.print("\n\tWrong input...");
        }
        
        System.out.print("\n\n\tEnter 1 to Try Again, [0 to exit]: "); // Will repeat the process of the Program
            ch = in.nextInt();
            System.out.println();
            System.out.println();
        }while(ch != 0);
    }
    }
}