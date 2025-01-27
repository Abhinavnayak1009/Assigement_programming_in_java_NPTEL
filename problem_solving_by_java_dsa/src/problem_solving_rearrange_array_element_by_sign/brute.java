package problem_solving_rearrange_array_element_by_sign;

import java.util.ArrayList;

public class brute {
	public static int [] remake (int a[], int n) {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer>neg = new ArrayList<Integer>();
		for (int i=0; i<n;i++) {
			if (a[i]>0)
				pos.add(a[i]);
			else
				neg.add(a[i]);
		}
		for (int i=0; i<n/2; i++) {
			a[2*i]= pos.get(i);
			a[2*i+1]= neg.get(i);
		}
		return a;
	}

	public static void main (String [] args) {
		int n=6;
		System.out.println("hello");
//		int a[] = new int[n];
	int	a[]= {1,2,-6,-5,-8,3  };
	int[] ans= remake(a,n);
	for (int i = 0; i < ans.length; i++) {
		System.out.print(ans[i]+" ");
		
	}
	}
}
