import java.util.Scanner;

public class IsAListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int numberOfArrays = Integer.parseInt(line);

        for(int i = 0; i < numberOfArrays; i++){
            boolean isSorted = true;
            String[] currentArray = scanner.nextLine().split(",");
            for(int j = 0; j < currentArray.length - 1; j++){
                if(Integer.parseInt(currentArray[j + 1]) < Integer.parseInt(currentArray[j])){
                    isSorted = false;
                    break;
                }
            }
            if(!isSorted){
                System.out.println(false);
            }else{
                System.out.println(true);
            }

        }
    }
}
