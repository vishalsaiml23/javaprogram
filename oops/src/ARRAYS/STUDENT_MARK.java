package ARRAYS;

public class STUDENT_MARK {
	public static void main(String[] args) {
		int a[] = {86,98,78,88};
		int b[] = {78,97,89,69};
		int max=a[0];
		  int min=a[0];
		System.out.println("-----Student Marks-----");
		for(int i=0;i<a.length;i++) {
			System.out.println("Student 1 Mark: "+a[i]);
			 
			  for (int j=1;j<a.length;j++) {
				  if(a[j]>max) {
					  max=a[j];
					  }
				  else if(a[j]<min) {
					  min=a[j];
				  }else
					  continue;
				  }
			
		}
		System.out.println("Maximum Mark Scored by Student 1 : "+max);
		System.out.println("Manimum Mark Scored by Student 1 : "+min);
		System.out.println("------------");
		for(int j=0;j<b.length;j++) {
			System.out.println("Student 2 Mark: "+b[j]);
			 
			  for (int x=1;x<b.length;x++) {
				  if(b[x]>max) {
					  max=b[x];
					  }
				  else if(b[x]<min) {
					  min=b[x];
					 
				  }else
					  continue;
				  }
			
	}
		    System.out.println("Maximum Mark Scored by Student 2 : "+max);
			System.out.println("Manimum Mark Scored by Student 2 : "+min);  
	}
}
