package Chapter08;
//(Compute the weekly hours for each employee) Suppose the weekly hours for all
//employees are stored in a two-dimensional array. Each row records an employee’s
// seven-day work hours with seven columns. For example, the following array
//stores the work hours for eight employees. Write a program that displays
// employees and their total hours in increasing order of the total hours.
//Su M T W Th F Sa
/*
2 4 3 4 5 8 8
7 3 4 3 3 4 4
3 3 4 3 3 2 2
9 3 4 7 3 4 1
3 5 4 3 6 3 8
3 4 4 6 3 4 4
3 7 4 8 3 8 4
6 3 5 9 2 7 9
*/

import java.io.File;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) throws Exception{
        File file = new File("chapter08/ch08ex04input.txt");
        Scanner input = new Scanner(file);
        int[][] employeeHours = new int[8][7];
        while (input.hasNext()) {
            for (int i = 0; i < employeeHours.length; i++) {
                for (int j = 0; j < employeeHours[i].length; j++) {
                    employeeHours[i][j] = input.nextInt();
                }
            }
        }
        input.close();

        int[][] employeesInOrder = new int[employeeHours.length][2];
        for (int i = 0; i < employeeHours.length; i++) {
            employeesInOrder[i][0] = i;
            employeesInOrder[i][1] = getSumOfEmployeeHours(i, employeeHours);
        }
        bubbleSortByColumn(employeesInOrder);

        for (int i = 0; i < employeesInOrder.length; i++) {
            System.out.println("Employee " + employeesInOrder[i][0] + "'s total hours: " + employeesInOrder[i][1]);

        }

    }

    public static void bubbleSortByColumn(int[][] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][1] > array[i + 1][1]) {
                    int temp = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = temp;
                    temp = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = temp;
                    unsorted = true;
                }
            }
        }
    }
    
    public static int getSumOfEmployeeHours(int employee, int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[employee].length; i++) {
            sum += array[employee][i];
        }
        return sum;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
