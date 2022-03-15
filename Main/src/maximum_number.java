import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.io.File;

import static java.lang.Integer.parseInt;


public class maximum_number {
    public static void main(String[] args) throws IOException {
        int n;
        int m = Integer.MIN_VALUE;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] line;
        int C = parseInt(buff.readLine());
        while(C > 0){
            line = buff.readLine().split(" ");
            n = parseInt(line[0]);
            for(int i = 1; i <= n;i++){
                if(parseInt(line[i]) > m)
                {
                    m = parseInt(line[i]);
                }
            }
            C -= 1;
        }
        System.out.println(m);
    }
}
