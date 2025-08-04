package Biko.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 아이템구매 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int w = Integer.parseInt(br.readLine());

        for(int i = 0; i <= w / p; i++) {
            int check = w - p * i;
            if(check % q == 0) {
                System.out.println(i + " " + (check / q));
                break;
            }
        }
    }
}
