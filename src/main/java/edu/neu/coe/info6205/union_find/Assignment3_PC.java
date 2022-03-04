package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class Assignment3_PC {

        public static int count(int n){
            UF_HWQUPC uf = new UF_HWQUPC(n);
            Random random = new Random();
            int cnt =0;

            while(uf.components()!=1)
            {
                int p= random.nextInt(n);
                int q= random.nextInt(n);
                cnt++;
                if(!uf.connected(p,q))
                    uf.union(p,q);
            }

            return  cnt;
        }

        public static void main(String args[]){
            System.out.println("Enter number of sites (n): ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println("Number of sites entered: " + n + " and number of pairs created: " + count(n));
            }
        }

