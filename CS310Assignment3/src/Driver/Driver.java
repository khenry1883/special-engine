/* This class must contain the main method.
 * Use this class to create an object of the StackQ class to demonstrate all the functions of the Queue implemented as two stacks.
 * Display a Menu (similar to Homework 1) to perform the following operations:
 * enQueue
 * deQueue
 * Peek
 * Display queue
 * Display enQStack and deQStack
 * Display size of the queue
 * Exit
 */
package Driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		String letter = "";
		//public LLStack<E> enQStack;
		//public LLStack<E> deQStack;
		public StackQ<E> queue;
		do {
			// Intro to program
			System.out.println("User Menu:");
			System.out.println("Input Choice:");
			System.out.println("a. Enqueue in the queue");
			System.out.println("b. Dequeue from the queue");
			System.out.println("c. Peek from the queue");
			System.out.println("d. Display the queue");
			System.out.println("e. Display enQStack and deQStack");
			System.out.println("f. Display size of queue");
			System.out.println("g. Exit");

			// Asks user for letter to input
			Scanner input = new Scanner(System.in);
			letter = input.nextLine();

			switch (letter) {
			case "a": // For when user wants to enqueue in the queue
				System.out.print("Input a value to enqueue: ");
				ID = input.next();
				System.out.println("Insert Student Name: ");
				name = input.next();
				System.out.println("Insert Student Age: ");
				age = input.nextInt();
				Student stud = new Student(ID, name, age);
				main.insertStudent(stud);
				break;
			case "b": // For when user wants to dequeue from the queue
				System.out.println("Input a value to dequeue: ");
				ID = input.next();
				main.searchStudent(ID);
				main.deleteStudent(ID);
				break;
			case "c": // For when user wants to peek from the queue
				
				break;
			case "d": // For when user wants to display the queue
				main.displayAll();
				break;
			case "e": //For when user wants to display enQStack and deQStack
				break;
			case "f": //For when user wants to display size of queue
				break;
			case "g": // For when user wants to exit
				System.out.print("Good-bye!");
				break;
			default: // When user inputs a number not given
				System.out.println(
						"Letter input not a part of the options selected. Please enter a letter from the choices provided.");
				break;
			}

		} while (letter != "g");
	}

	}

}
