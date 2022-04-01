/*
Paolo D.
CS 2-1 | OE7 "Implement Hashing Insert and Search Operation"
*/

import java.util.HashMap;
import java.util.Scanner;

public class OE7_Hash {

    public static void main(String[] args) {
        int ans, ch;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("\n\tAPPLICATION OF HASHING\n");
            System.out.println("\t[1] Insert and Search Data");
            System.out.println("\t[0] System Exit");
            System.out.print("\n\tSelect your choice: ");
            ans = in.nextInt();
        
        switch(ans){
            case 1:{ // okay
                HashMap<Integer, String> studentData = new HashMap<>();
                boolean repeat = true;
                Scanner Scan = new Scanner(System.in);

                do{
                    System.out.print("\n\tID Number: ");
                    Integer IDNumber = Integer.parseInt(Scan.nextLine());

                    System.out.print("\tEnter Name: ");
                    String name = Scan.nextLine();

                    studentData.put(IDNumber, name); //

                    System.out.print("\n\tEnter another student? Press y if yes, n if no: ");
                    String answer = Scan.nextLine();

                    // condition to satisfy in order to loop again
                    if (answer.equals("y") || answer.equals("Y")) {
                        continue;
                    } 
                    else {
                        break;
                    }
                    } while (repeat);
                        
                    System.out.println("\n        ---------------------------------------");
                    System.out.println("\t\t   Student DataBase");
                    System.out.println("\n\t      ID Number  "+ "       Name");		
                    for(int id:studentData.keySet()){
                        System.out.println("\t      "+id+"\t\t"+ studentData.get(id));
                    }
                    System.out.println("        ---------------------------------------");

                    Scanner sc = new Scanner(System.in);
                    System.out.println("\n\n\n\tSearch Data");
                    System.out.print("\n\tEnter ID Number: ");
                    int key = sc.nextInt();

                    boolean flag = studentData.containsKey(key);
                    if(flag == true){
                        System.out.println("\n\n\tStudent Data Exist!");
                        System.out.println("\tStudent Name is: " + studentData.get(key));
                    }
                    else {
                        System.out.println("\n\n\tStudent Does Not Exist in the Table.");
                    }
                break;
            }
            case 0:{
                System.exit(0);
            }

            default:
                System.out.print("\n\tWrong input...");
        }
        
        System.out.print("\n\n\tEnter 1 to Try Again, [0 to exit]: ");
            ch = in.nextInt();
            System.out.println();
            System.out.println();
        }while(ch != 0);
    }
}