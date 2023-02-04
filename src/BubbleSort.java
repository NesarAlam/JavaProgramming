import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,5,6,6,6,7,8,9};
		int count = 0;
		for(int i =1;i<array.length;i++)
		{
			if(array[i]==array[i-1] && count < 1)
			{
				System.out.println(array[i]);
				count++;
			}
			else
			{
				count =0;
			}
		}
}
}
