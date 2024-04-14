import java.util.Scanner;

public class hw3_1 {  //20211427 신윤철
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");

        char s1 = scanner.next().charAt(0); // 알파벳 하나 받기
        int cnt=s1-'a'; //반복횟수 설정하기

        for(int i=0; i<=cnt; i++ ){ //받은 알파벳 - a 만큼 반복
            for(char j='a'; j<=s1; j++){ //a부터 받은 알파벳까지
                System.out.print(j);

            }
            System.out.println(); //줄바꿈
            s1--; //하나씩 줄어들면서 출력

        }
    }
}
