import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersArr = line.split("");
        int maxNum = 0;
        int currentSum = 0;

        for (int i = 0; i < numbersArr.length; i++){
            currentSum+=Integer.parseInt(numbersArr[i]);
        }
        if(currentSum > maxNum){
            maxNum = currentSum;
            currentSum = 1;
        }

        for(int i = 0; i < numbersArr.length; i++){
         currentSum*= Integer.parseInt(numbersArr[i]);
        }
        if(currentSum > maxNum){
            maxNum = currentSum;
            currentSum = 0;
        }

        for(int i = 0; i < numbersArr.length; i++) {
            currentSum = Integer.parseInt(numbersArr[i]) + (Integer.parseInt(numbersArr[1 + i])
                    * Integer.parseInt(numbersArr[i + 2]));
            if (currentSum > maxNum) {
                maxNum = currentSum;
                break;
            } else {
                currentSum = 0;
                currentSum = (Integer.parseInt(numbersArr[i]) * Integer.parseInt(numbersArr[1 + i]))
                        + Integer.parseInt(numbersArr[i + 2]);
                if(currentSum > maxNum){
                    maxNum = currentSum;
                    break;
                }
            }
            break;
        }
        System.out.println(maxNum);
    }
}
