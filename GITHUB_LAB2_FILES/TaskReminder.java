/**
* @author Erin, Laila, Deuel
* 
*/ 
import java.util.Scanner;

public class TaskReminder {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        TaskList taskList = new TaskList();

	        while (true) {
	            System.out.println("\n1. Add Task\n2. View Tasks\n3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task name: ");
	                    String taskName = scanner.nextLine();
	                    System.out.print("Enter deadline: ");
	                    String deadline = scanner.nextLine();
	                    taskList.addTask(taskName, deadline);
	                    break;
	                case 2:
	                    taskList.displayTasks();
	                    break;
	                case 3:
	                    System.out.println("Exiting program...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}


