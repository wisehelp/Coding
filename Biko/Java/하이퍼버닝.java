package Biko.Java;

import java.util.Scanner;

public class 하이퍼버닝 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 몬스터 수
        long level = sc.nextInt(); //시작 레벨

        int[] q = new int[n]; // 최소 요구 레벨
        int[] u = new int[n]; // 보상 레벨

        // 몬스터 정보
        for(int i = 0; i < n; i ++){
            q[i] = sc.nextInt();
            u[i] = sc.nextInt();
        }


        // 사냥 가능 몬스터 중 보상 제일 큰 몬스터 뽑기
        for(int i = 0; i < n; i ++){
            int reward = -1; // 가장 큰 보상 (임시)
            int index = -1; // 해당 몬스터 번호

            for(int k = 0; k < n; k++){
                //이미 사냥한 몬스터 q[k]==0
                if(q[k] != 0 && q[k] <= level && u[k] > reward){
                    reward = u[k]; // 더 큰 보상 설정
                    index = k; // 해당 몬스터 번호
                }
            }
            if(index == -1){
                break;
            }
            level += u[index];
            q[index] = 0; // 사냥 완료!
        }
        System.out.println(level);

    }
}
