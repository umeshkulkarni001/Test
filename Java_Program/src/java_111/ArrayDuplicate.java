package java_111;

public class ArrayDuplicate {
	    static int getMissingNo(int a[], int n)
	    {
	        int i, total;
	        total = (n + 1) * (n + 2) / 2;
	        for (i = 0; i < n; i++)
	            total -= a[i];
	        return total;
	    }
	 
	    /* program to test above function */
	    public static void main(String args[])
	    {
	        int a[] = { 11,22,33,55, };
	        int miss = getMissingNo(a, 5);
	        System.out.println(miss);
	    }
}
	
