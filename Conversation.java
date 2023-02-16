import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {
  /**
   * 
   * Creates a conversation between the user and the computer. 
   * @param string typed in by user
   * @return void
   * 
   */      
  public static void main(String[] arguments) {
    // You will start the conversation here.
    String[] responseList = {"Shocking", "I'm surprised.", "Are you ok?", "Oh wow.", "Mhm."};
    Scanner myObj = new Scanner(System.in);
    System.out.println("How many rounds?");
    String num = myObj.nextLine();
    int rounds = Integer.valueOf(num);
    System.out.println("Hi! What's your name?");
    String userName = myObj.nextLine();
    for (int i = 0; i < rounds; i++){
      System.out.println("What's on your mind right now " + userName + "?");
      String s1 = myObj.nextLine();
      String[] words = s1.split( " ");
      Random random = new Random();
      int index = random.nextInt(responseList.length);
      for (int w = 0; w < words.length; w++) {
        if (words[w].equals("me")){
          words[w] = "you";
        }
        
        if (words[w].equals("am")){
          words[w] = "are";
        }
        if (words[w].equals("you")){
          words[w] = "I";
        }
        if (words[w].equals("my")){
          words[w] = "your";
        }
        if (words[w].equals("your")){
          words[w] = "my";
        }
        if (words[w].equals("I")){
          words[w] = "you";
        }
        else{
          

        }
       
      } 
      System.out.println(String.join(" ", words));
    }
    System.out.println("Bye!!");
  }
}
