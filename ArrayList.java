import java.util.*;
//ArrayList<String> gfg = new ArrayList<String>();
//gfg.add("Geeks");

public class ToDoList
{
   public static void main(String[] args)
   {
       // Rewrite this code to use an ArrayList instead of an array
      ArrayList<String> toDoList = new ArrayList<String>();
     // String[] toDoList = new String[3];
      toDoList.add("Do homework");
      toDoList.add("Help make dinner");
      toDoList.add("Call grandma");
      // toDoList[0] = "Do homework";
      // toDoList[1] = "Help make dinner";
      // toDoList[2] = "Call grandma";

       // changing element 1
      toDoList.set(1,"Order pizza");
       //toDoList[1] = "Order pizza";

      System.out.println(toDoList.size() + "things to do!");
       //System.out.println(toDoList.length + " things to do!");
      System.out.println("Here's the first thing to do: " + toDoList.get(0));
       //System.out.println("Here's the first thing to do: "
        //   + toDoList[0] );

       // remove item 0 and move everything down
       //  (this can be done in 1 command with ArrayList)
      toDoList.set(0, toDoList.get(1));
       //toDoList[0] = toDoList[1];
      toDoList.set(1, toDoList.get(2));
       //toDoList[1] = toDoList[2];
      toDoList.set(2, "");
       //toDoList[2] = "";

      System.out.println("Here's the next thing to do: " + toDoList.get(0));
      // System.out.println("Here's the next thing to do: "
             // + toDoList[0] );
                      

       // Why is an ArrayList better than an array for a toDoList?
       // Answer: because you can add new things to do after the last thing dynamically, while with an array there is a maximum number of things that can be added.
   }
}
