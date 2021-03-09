package mx.edu.j2se.DeLaMora.tasks;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {

		// TASK NO REPETITIVE

		Task mytask = new Task("meeting in a cafe", 10);
		mytask.setActive(true);
		System.out.println("Task:\t" + mytask.getTitle());
		System.out.println("Start Time\t:" + mytask.getTime());


		if (mytask.isActive()) {
			System.out.println("The task\t:" + mytask.getTitle() + "\t is active");
		} else {
			System.out.println("The task\t:" + mytask.getTitle() + "\t is inactive");
		}

		System.out.println("The task will be repeated?:\t" + mytask.isRepeated());


		System.out.println("The task will start at:\t" + mytask.getTitle() + "\tis\t" + mytask.getStartTime());
		System.out.println("The task will end at:\t" + mytask.getTitle() + "\tis\t" + mytask.getEndTime());
		System.out.println("The task have an interval:\t" + mytask.getTitle() + "\tof\t" + mytask.getRepeatInterval());


		// TASK REPETITIVE

		Task mytask2 = new Task("breakfast", 9, 10, 5);
		mytask2.setActive(true);
		System.out.println("Task:\t" + mytask2.getTitle());
		System.out.println("Start time of this task\t:" + mytask2.getStartTime() + "\tand this will end at:\t" + mytask2.getEndTime());
		System.out.println("The task have an interval:\t" + mytask2.getTitle() + "\tof\t" + mytask2.getRepeatInterval());

		if (mytask2.isActive()) {
			System.out.println("The task\t:" + mytask2.getTitle() + "\t is active");
		} else {
			System.out.println("The task\t:" + mytask2.getTitle() + "\t is inactive");
		}

		System.out.println("The task will be repeated?:\t" + mytask2.isRepeated());

		// TASK LIST
		Task mytask3 = new Task("Hacer ejercicio",10);
		ArrayTaskList arrayBla = new ArrayTaskList();
		arrayBla.add(mytask3);
		System.out.println("La tarea agregada tiene indice " + arrayBla.getTask(0));


	}





}








