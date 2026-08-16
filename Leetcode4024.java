class Solution {

    public int nearestDrone(int[][] drones, int[] target) {

      int MDist = 0;

      int n = drones.length;

        int ans = -1;

        int min = Integer.MAX_VALUE;

        for(int i = 0;i < n;i++){

            int x1 = drones[i][0];

            int  y1 = drones[i][1];

            int range = drones[i][2];

            int x2 = target[0];

            int y2 = target[1];

             int d1 = Math.abs(x1 - x2);

            int d2 = Math.abs(y1 - y2);

            MDist = d1 + d2;

            if(MDist <= range && min > MDist){

                min = Math.min(min,MDist);

                ans = i;

                }

        }

        return ans;

    }

}