/* 문제 16
 * 가위 바위 보 중 하나를 입력받고 <enter>키를 치면 프로그램이 가위 바위 보 중에서 랜덤하게 하나를 선택하고 비교해서 누가 이겼는지 판단하기
 * 가위 바위 보 대신 "그만"을 입력하면 게임 끝
 * 힌트 1 : String str[] = {"가위", "바위", "보"};
 * 힌트 2 : int n = (int)(Math.random()*3);   //n은 0,1,2 중에서 랜덤하게 결정
 * 힌트 3 : if(str[n].equals("바위"))   // 컴퓨터가 낸 것이 "바위"인지 비교하는 문
 */

import java.util.Scanner;

public class hw3_4 { //20211427 신윤철
    public static void main(String args[]){

        String str[]={"가위", "바위", "보"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        boolean d=true;

        while(d){
            System.out.print("가위 바위 보! >>");

            String user=scanner.nextLine(); //가위 바위 보 입력받기

            int n = (int) (Math.random()*3); //Math.random 은 0이상 1미만 난수를 double 형으로 반환. 3을 곱해서 0이상 3.0미만의 값을 얻고 (int)형으로 변환

            switch(user) {
                case "가위" :
                    if(str[n].equals("가위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 가위, 비겼습니다");
                    else if (str[n].equals("바위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 바위, 컴퓨터가 이겼습니다");
                    else
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 보, 사용자가 이겼습니다");
                    break;
                case "바위" :
                    if(str[n].equals("가위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 가위, 사용자가 이겼습니다");
                    else if (str[n].equals("바위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 바위, 비겼습니다");
                    else
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 보, 컴퓨터가 이겼습니다");
                    break;

                case "보" :
                    if(str[n].equals("가위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 가위, 컴퓨터가 이겼습니다");
                    else if (str[n].equals("바위"))
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 바위, 사용자가 이겼습니다");
                    else
                        System.out.println("사용자 = "+user+" , 컴퓨터 = 보, 비겼습니다");
                    break;

                case "그만" :
                    System.out.println("게임을 종료합니다...");
                    d=false;

                }


        }
    }
}
