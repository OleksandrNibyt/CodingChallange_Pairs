import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

    public static int countPairs(List<Integer> numbers, int k) {
        // Write your code here

        int count = 0;
        int tmp = numbers.get(0) + k;

        for (int i = 0; i < numbers.size(); i++){
            if ((tmp + k) == numbers.get(i) ){
                System.out.println(">" + " " + tmp +" "+ numbers.get(i));
                count++;
            }
            if ((tmp - k) == numbers.get(i)){
                System.out.println("<" + " " + tmp +" "+ numbers.get(i));
                count++;
            }
            else {
            tmp = numbers.get(i);

            }

        }







        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());
        */
        //int k = Integer.parseInt(bufferedReader.readLine().trim());
        //List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = List.of(4,2,3,1,4,5, 7, 8, 2);

        int k = 2;
        int result = Result.countPairs(numbers, k);
        System.out.println(String.valueOf(result));

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
