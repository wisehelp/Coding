package Biko.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 메이플스토리새로운직업고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        String[] job = new String[n];
        for(int i = 0; i < n; i++) job[i] = br.readLine();


        int k = Integer.parseInt(br.readLine());
        String[] myjob = new String[k];
        for(int i = 0; i < k; i++) myjob[i] = br.readLine();

        boolean[] newjob = new boolean[n];
        for(int i = 0; i < n; i++) {
            boolean nn = false;
            for(int j = 0; j < k; j++) {
                if(job[i].equals(myjob[j])) {
                    nn = true;
                    break;
                }
            }
            newjob[i] = !nn;
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(newjob[i]) count++;
        }

        System.out.println(count);
        for(int i = 0; i < n; i++){
            if(newjob[i]) System.out.println(job[i]);
        }

    }
}
