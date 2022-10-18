import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(",");
        int rotations = scanner.nextInt();

        while (rotations > 0){
            String[] tempArr = new String[1];
            tempArr[0] = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(i == arr.length - 1){
                    arr[arr.length - 1] = tempArr[0];
                }else{
                    arr[i] = arr[i + 1];
                }
            }
            rotations--;
        }
        System.out.println(String.join(",", arr));
    }
}
