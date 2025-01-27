package problem_solving_rearrange_array_element_by_sign;

import java.lang.reflect.Array;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class optimal {
	public static ArrayList<Integer> rerrarenginbysing(ArrayList<Integer>a){
		int n = a.size();
		ArrayList <Integer> ans= new ArrayList<> (Collections.nCopies(n, 0));
		 //ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));\
	int positive =0;
	int negative =0;
		for ( int i=0; i<n; i++) {
			if (a.get(i)<0) {
				ans.set(negative, a.get(i));
				negative+=2;
				
			}
			else
				
			{
				ans.set(positive, a.get(i));
				positive+=2;
			}
		}
		return ans;
	}

 public static void main(String [] args) {
	 ArrayList<Integer>a = new ArrayList<>(Arrays.asList(1,2,-4,-5));
	 ArrayList<Integer> ans = null;
//	try {
		ans = rerrarenginbysing(a);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	 for (int i = 0; i < ans.size(); i++) {
		System.out.print(ans.get(i)+" ");
	}
	 
	 
	
}
}
