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

import Container.LLStack;
import Container.StackQ;
import Data.DataClass;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		int ID = 0;
		String name, letter = "";
		LLStack enQStack = new LLStack();
		LLStack deQStack = new LLStack();
		StackQ<DataClass> queue = new StackQ<DataClass>();
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
				System.out.println("Input a name for the data to enqueue: ");
				name = input.nextLine();
				System.out.println("Input an ID for the data to enqueue: ");
				ID = input.nextInt();
				DataClass val = new DataClass(name, ID);
				queue.enQ(val);
				break;
			case "b": // For when user wants to dequeue from the queue
				if (queue.isEmpty()) {
					System.out.println("Queue is empty!");
					break;
				} else {
					while (!queue.isEmpty()) {
						queue.deQ();
					}
					break;
				}
			case "c": // For when user wants to peek from the queue
				if (queue.isEmpty()) {
					System.out.println("Queue is empty!");
					break;
				} else {
					queue.peek();
					break;
				}
			case "d": // For when user wants to display the queue
				if (queue.isEmpty()) {
					System.out.println("Queue is empty!");
					break;
				} else if ((!enQStack.isEmpty() || !deQStack.isEmpty())) {
					System.out.println("Queue: " + queue.toString());
					break;
				}
			case "e": // For when user wants to display enQStack and deQStack
				if (queue.isEmpty() && (!enQStack.isEmpty() || !deQStack.isEmpty())) {
					System.out.println("Queue is empty!");
					break;
				} else if ((!enQStack.isEmpty() || !deQStack.isEmpty())) {
					System.out.println("enQStack: " + queue.getEnQStack().toString());
					System.out.println("deQStack: " + queue.getDeQStack().toString());
					break;
				}
			case "f": // For when user wants to display size of queue
				System.out.println("Queue size: " + queue.queueSize);
				break;
			case "g": // For when user wants to exit
				System.out.println("Good-bye!");
				break;
			default: // When user inputs a number not given
				System.out.println(
						"Letter input not a part of the options selected. Please enter a letter from the choices provided.");
				break;
			}

		} while (letter != "g");
	}

}
