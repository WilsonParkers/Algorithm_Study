import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            int s=0;
 
            for(int i=0; i<num; i++){
                int sum = 0;
                String result = "#"+ (i+1) +" ";
                for(int j=0;j<10; j++){
                    s = sc.nextInt();
                    if(s%2 == 1){
                        sum += s;
                    }
                }
                System.out.println(result + sum);
            }
    }
}
