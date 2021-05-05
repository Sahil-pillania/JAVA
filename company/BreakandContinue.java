package com.company;

public class BreakandContinue {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++)
        {
            if(i==2){
                System.out.println("Continuing the loop when i=2");
                continue;
            }
            System.out.print("Value is ");
            System.out.println(i);

            System.out.println("This is java program");
            if(i==3)
            {
                System.out.println("Breaking the loop");
                break;
            }

        }
    }
}
