import java.util.Scanner;

public class MergingAndSquashing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] array = new String[number];

        String result = "";
        String secontResult = "";

        for(int i = 0; i < number; i++){
            String current = scanner.nextLine();
            array[i] = current;
        }
        for(int i = 0; i < array.length - 1; i++){
            String current = array[i];
            String[] splitCurrent = current.split("");
            String second = array[i + 1];
            String[] splitSecond = second.split("");
            result += splitCurrent[1] + splitSecond[0] + " ";

            int sum = Integer.parseInt(splitCurrent[1]) + Integer.parseInt(splitSecond[0]);
            String s = String.valueOf(sum);
            if(sum > 9){
                String[] sArray = s.split("");
                String secondElement = sArray[1];
                secontResult += splitCurrent[0] + secondElement + splitSecond[1] + " ";
            }else{
                secontResult += splitCurrent[0] + s + splitSecond[1] + " ";
            }
        }
        System.out.println(result);
        System.out.println(secontResult);
    }
}
