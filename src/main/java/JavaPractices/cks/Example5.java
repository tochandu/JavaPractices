package JavaPractices.cks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Example5 {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1!= null & o2!= null)
                    return Double.compare(Double.parseDouble(o2),Double.parseDouble(o1));
                else
                 return 0;
            }
        });
                    //Output
        for(int i=0;i<n;i++)
                    {
                        System.out.println(s[i]);
                    }
                }

    }
