import java.util.Scanner;

public class hw1_2 { //20211427 신윤철
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하십시오>>");
        int score = scanner.nextInt(); // 숫자 입력받기

        int ten=score/10; //10의 자리 숫자 구하기
        int one=score%10; //1의 자리 숫자 구하기
        int clap=0;

        if(ten==3 || ten==6 || ten==9)
            clap++;

        if(one==3 || one==6 || one==9)
            clap++;

        if(clap==2)
            System.out.println("박수짝짝");

        else if(clap==1)
            System.out.println("박수짝");

        else
            System.out.println("그냥 숫자");
    }
}
