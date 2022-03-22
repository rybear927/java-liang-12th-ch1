package Chapter08;
//(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display students in
// decreasing order of the number of correct answers.

public class exercise03 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] scores = new int[answers.length][2];
        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            scores[i][0] = i;
            scores[i][1] = correctCount;
        }
        bubbleSortByColumn(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + scores[i][0] + "'s correct count is " +
                    scores[i][1]);

        }
    }

    public static void bubbleSortByColumn(int[][] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i][1] < array[i + 1][1]) {
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
}
