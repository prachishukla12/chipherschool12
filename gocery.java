package test;



import java.util.ArrayList;
import java.util.Scanner;

public class gocery {

    private static Scanner sc= new Scanner(System.in);
    private static GroceryList gl = new GroceryList();

    public static void main(String[] args) {

        boolean quit=false;
        int choice =0;

        printInstructions();

        while(!quit){
            System.out.println("\nEnter Your Choice :  ");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0 :

                    printInstructions();
                    break;

                case 1 :

                    gl.printGroceryList();
                    break;

                case 2 :

                    addItem();
                    break;

                case 3 :

                    modifyItem();
                    break;

                case 4 :

                    removeItem();
                    break;

                case 5 :

                    searchForItem();
                    break;

                case 6 :
                    processArrayList();
                    break;

                case 7 :

                    quit=true;
                    System.out.println("\nThank You. Quitting the Application Now...");
                    break;

                default :

                    System.out.println("\nInvalid Option.");
                    break;

            }
        }
    }

    private static void processArrayList() {

        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(gl.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(gl.getGroceryList());

        String[] myArray = new String[gl.getGroceryList().size()];
        myArray=gl.getGroceryList().toArray(myArray);
    }

    private static void searchForItem() {

        System.out.print("Enter The Grocery Item to search for : ");
        String searchItem = sc.nextLine();

        if(gl.search(searchItem)){
            System.out.println("Found "+searchItem+" in the Grocery List.");
        }
        else{
            System.out.println(searchItem+" is not in the Grocery List.");
        }

    }

    private static void removeItem() {

        System.out.print("Enter The Grocery Item Name - ");
        String item=sc.nextLine();
        gl.removeGroceryItem(item);
    }

    private static void modifyItem() {

        System.out.print("Enter The Grocery Item Name - ");
        String oldItem=sc.nextLine();
        System.out.print("Enter Replacement Item Name - ");
        String newItem= sc.nextLine();
        gl.modifyGroceryItem(oldItem, newItem);

    }

    private static void addItem() {

        System.out.print("Please Enter the Grocery Item - ");
        gl.addGroceryItem(sc.nextLine());
    }

    private static void printInstructions() {

        System.out.println("\nPress - \n");
        System.out.println("\t 0. To Print Choice Options.");
        System.out.println("\t 1. To Print the List of Grocery Items.");
        System.out.println("\t 2. To Add an Item to the Grocery List.");
        System.out.println("\t 3. To Modify an Item in the Grocery List.");
        System.out.println("\t 4. To Remove an Item from the Grocery List.");
        System.out.println("\t 5. To Search for an Item in the Grocery List.");
        System.out.println("\t 6. To Process The Grocery List.");
        System.out.println("\t 7. To Quit the Application.\n");

    }
}
