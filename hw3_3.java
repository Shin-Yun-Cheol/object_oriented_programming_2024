/* 명령행 인자 중에서 정수 만을 골라 합을 구하기
 * ex) 2 3 aa 5 6.7 -> 결과값 : 10
 * 힌트 1 : main()의 매개변수 처리
 * 힌트 2 : NumberFormatException
 */

import java.util.Scanner;

public class hw3_3 {  //20211427 신윤철
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        int add=0;
        String line = scanner.nextLine(); //문자열로 나누기
        String[] tokens = line.split("\\s+"); //tokens 배열에 공백으로 구분해서 입력받은 거 하나씩 넣기

        //tokens 배열에 있는 걸 String token 변수에 하나씩 넣기
        /* token 변수에 있는 값을 정수로 바꾸기, 실수도 바꾸고 싶다면
         * double value = Double.parseDouble(token)
         *int value2 = (int)value; 추가
         */
        for (String token : tokens)
        {
            try{
                int value=Integer.parseInt(token);
                add+=value;
            }catch (NumberFormatException e){
                continue;

            }
        }

        System.out.println(add);
        scanner.close();


    }
}
