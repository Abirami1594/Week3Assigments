package week3.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in javaweek1";
		int count =0;
		String[] a =text.split("");
		for (int i=0; i<a.length; i++){
		for (int j=i+1;j<a.length;j++){
			if (a[i].equalsIgnoreCase(a[j])) {
				a[j]= "";
				count++;
			}
		}
			
		}
		if(count>1) {
			for(int k=0;k<a.length;k++) {
				System.out.println(""+a[k]);
			}
		}
	}

}
