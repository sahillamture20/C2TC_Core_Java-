package com.java.sahil;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] gain = {-4,-3,-2,-1,4,3,2};
		int max = 0, current = 0;
        for(int i=0; i<gain.length; i++){
        	current += gain[i];
            max = Math.max(current, max);
            
        }
        System.out.println(max);
		
	}

}
