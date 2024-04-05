import java.util.Scanner;
public class hw1_1 {   //20211427 신윤철
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2자리수 점수 입력(10~99)>>>");
        int score = scanner.nextInt(); //점수입력받기
        scanner.nextLine();

        int ten=score/10; //10의 자리 숫자 구하기
        int one=score%10; //1의 자리 숫자 구하기

        if(ten/one==1)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");

        else
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다");

    }
}
