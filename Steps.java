import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int stepsSum = 0;

        boolean isReached = false;
        while (stepsSum < goal){
            String line = scanner.nextLine();
            if(line.equals("Going home")){
                int finalSteps = scanner.nextInt();
                stepsSum+=finalSteps;
                if(stepsSum >= goal){
                    isReached = true;
                    break;
                }else{
                    break;
                }
            }else{
                int currentSteps = Integer.parseInt(line);
                stepsSum+=currentSteps;
                if(stepsSum >= goal){
                    isReached = true;
                }
            }
        }
        int diff = Math.abs(stepsSum - goal);
        if(isReached){
            if(diff != 0){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
            }else{
                System.out.println("Goal reached! Good job!");
            }
        } else{
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
