package com.company;

public class Main {

    public static void main(String[] args) {

        //System.out.println(minNumberOfJumps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        //System.out.println(minNumberOfJumps(new int[] {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3}));
        System.out.println(minNumberOfJumps(new int[] {2,1,2,3,1}));

    }

    public static int minNumberOfJumps(int[] array) {

        if (array.length <= 1)
            return 0;

        if (array[0] == 0)
            return -1;

        int jumps = 1;
        int steps = array[0];
        int maxReach = array[0];

        for(int i=0; i < array.length; i++){

            if (i == array.length - 1)
                return jumps;

            maxReach = Math.max(maxReach, i+array[i]);

            if(steps==0){
                if(i>maxReach){return -1;}
                jumps++;
                steps=maxReach-i;
            }

            steps--;

        }

        return -1;

    }

}
