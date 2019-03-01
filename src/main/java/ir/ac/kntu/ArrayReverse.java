package ir.ac.kntu;

import java.util.Arrays;

public class ArrayReverse{
    public static void reverse(String[] array){
		int middle=array.length/2;
		String temp;
		int j=array.length-1;

		for (int i = 0 ; i < middle; i++){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		
    }
    public static void main(String[] args){

        reverse(args);
        //show reversed array
        System.out.println("args = " + Arrays.toString(args));
    }

}
