import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberBadGrades = Integer.parseInt(scanner.nextLine());
        int badGradesCounter = 0;
        String nextLine = scanner.nextLine();;
        int numberOfProblemsCounter = 0;
        double sumOfGrades = 0;
        String lastProblem = "";
        boolean isBadGrade = false;
        while (!nextLine.equals("Enough")){
            numberOfProblemsCounter++;
            lastProblem = nextLine;
            int grade = Integer.parseInt(scanner.nextLine());
            sumOfGrades+=grade;
            if(grade <=4) {
                badGradesCounter++;
                if(badGradesCounter == numberBadGrades){
                    isBadGrade = true;
                   break;
                }
            }
            nextLine = scanner.nextLine();
        }
        if(isBadGrade){
            System.out.printf("You need a break, %d poor grades.", badGradesCounter);
        }else{
            double avgScore = sumOfGrades / numberOfProblemsCounter;
            System.out.printf("Average score: %.2f\n", avgScore);
            System.out.printf("Number of problems: %d\n", numberOfProblemsCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }

        }
    }

