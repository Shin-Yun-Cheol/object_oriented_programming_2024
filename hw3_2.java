/* 4X4의 2차원 배열을 만들고 1부터 10까지 정수를 10개만 랜덤하게 생성해서 임의의 위치에 삽입하고 나머지 6개 숫자는 모두 0이다.
 * 10개의 정수 중 중복이 있어도 상관없다.
 */

import java.util.Random; //랜덤한 수 만들기 위해 import

public class hw3_2 {
    public static void main(String args[]){ //20211427 신윤철
        int[][] arr= new int[4][4]; //2차원 배열 생성

        Random random = new Random();

        for(int i=0; i<10; i++){ //10개의 랜덤한 수 넣기
            int j=random.nextInt(4); //랜덤한 행
            int k=random.nextInt(4); //랜덤한 열
            int rand=random.nextInt(9)+1; //1부터 10까지 랜덤한 수 생성

            if(arr[j][k]==0)
                arr[j][k]=rand; //0인 곳에만 랜덤한 수 넣기
            else i--; //똑같은 곳에 넣으려하면 다시 반복
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+"  "); //하나씩 출력
            }
            System.out.println();
        }


    }
}
