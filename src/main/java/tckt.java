/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author romel
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


class Main {

  public static void main(String[] args) {
    // Creating Queue using the LinkedList class
    Queue<Integer> numbers = new LinkedList<>();
    int num = (1);
     
    
    for (int i=1; i<=5; i++){
    Scanner fName = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Name :");
    String Name = fName.nextLine();  // Read user input
    System.out.println("Queue: " + num++);
    numbers.offer(i);
    }
    
    //1
       
    //enqueue
    
    System.out.println("Queue List : " + numbers);
    // dequeue
    
    // delete element from the front of the queue
    int removedNumber = numbers.poll();
    System.out.println("\t\t\tCounter 1 \n"+"\t\tNow Serving: " + removedNumber);
    System.out.println("\t\tRemoved Element: " + removedNumber);

    System.out.println("\t\tWaiting List: " + numbers);
    }
}
  