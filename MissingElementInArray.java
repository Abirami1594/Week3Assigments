package week3.day1;
import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		for (int i=0;i<a.length;i++)
		{  if((i+1)!=a[i]) {
			System.out.println(" The missing Elemen is " +(i+1));
			break;
		}
			}
		}

}
