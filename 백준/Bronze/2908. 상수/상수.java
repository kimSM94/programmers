import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split(" ");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String A = word[0];
        String B = word[1];

        String test = String.valueOf(sb1.append(A).reverse());
        String test2 = String.valueOf(sb2.append(B).reverse());

        if(Integer.parseInt(test)>Integer.parseInt(test2)){
            System.out.println(test);
        }else{
            System.out.println(test2);
        }


    }
}
