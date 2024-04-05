import java.util.Scanner;
public class hw1_3 {
    public static void main(String args[]) { //20211427 신윤철
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("연산>>");
            int num1 = scanner.nextInt();
            String operator = scanner.next();
            int num2 = scanner.nextInt();

            int result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return; // 프로그램 종료
                    }
                    break;
            }

            System.out.println(num1+operator+num2+"의 계산결과는 "+ result);
        }
    }
}