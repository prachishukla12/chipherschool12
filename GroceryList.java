package test;



import java.util.ArrayList;

public class GroceryList {

      private ArrayList<String> groceryList = new ArrayList<String>();

      public void addGroceryItem(String item){

          groceryList.add(item);

      }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){

          System.out.println("You have "+groceryList.size()+" items in your Grocery List");

          for(int i=0;i<groceryList.size();i++){
              System.out.println((i+1)+". "+groceryList.get(i));
          }
      }

      public void modifyGroceryItem(String currentItem, String newItem){

          int position = findItem(currentItem);
          if(position>=0){
              modifyGroceryItem(position,newItem);
          }
          else{
              System.out.println("\nItem Not Found in the Grocery List\n");
          }

      }

      private void modifyGroceryItem(int position, String newItem){

          groceryList.set(position,newItem);

          System.out.println("Grocery Item "+(position+1)+" has been modified.");
      }

      public void removeGroceryItem(String item){

          int position = findItem(item);
          if(position>=0){
             removeGroceryItem(position);
          }
          else{
              System.out.println("\nItem Not Found in the Grocery List\n");
          }

      }

      private void removeGroceryItem(int position){

          String theitem=groceryList.get(position);

          groceryList.remove(position);

          System.out.println("The Grocery Item - "+theitem+" has been removed");

      }

      private int findItem(String searchItem){

          /**boolean exists=groceryList.contains(searchItem);

          int position = groceryList.indexOf(searchItem);

          if(position>=0){
              return groceryList.get(position);
          }
          return null;*/

          return groceryList.indexOf(searchItem);
      }

      public boolean search(String searchItem){

          int position=findItem(searchItem);
          if(position>=0)
              return true;
          else
              return false;

      }
}


