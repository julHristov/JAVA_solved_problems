import java.util.Scanner;

public class WordAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int numberOfWords = Integer.parseInt(scanner.nextLine());

        String[] wordArray = word.split("");

        boolean isAnagram = true;

        for (int i = 0; i < numberOfWords; i++){
            String line = scanner.nextLine();
            String[] lineArray = line.split("");
            if(wordArray.length != lineArray.length){
                System.out.println("No");
            }else{
                int index = wordArray.length;

                while (index !=0){
                    int firstCounter = 1;
                    int secondCounter = 0;
                    int startIndex = 0;
                    String currentChar = "";
                    for(int j = startIndex; j < wordArray.length; j++){
                        String current = wordArray[j];
                        if(currentChar.length()==0){
                            currentChar = current;
                        }else{
                            if(currentChar.equals(current)){
                                firstCounter++;
                            }
                        }
                    }
                    startIndex++;
                    for(int y = 0; y < lineArray.length; y++){
                        String secondCurrent = lineArray[y];
                        if(secondCurrent.equals(currentChar)){
                            secondCounter++;
                        }
                    }
                    if(firstCounter == secondCounter){
                        isAnagram = true;
                    } else{
                        isAnagram = false;
                        break;
                    }
                    index--;
                }
                if(isAnagram){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
