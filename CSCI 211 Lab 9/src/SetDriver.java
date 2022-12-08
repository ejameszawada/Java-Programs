import java.util.Random;
import java.util.TreeSet;

public class SetDriver {

	
	public static void main(String [] args)
	{
		
		TreeSet<Integer> set1 =new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();

		Random r = new Random();
		int size =r.nextInt(5)+1;
		
		for(int j = 0; j<size;j++)
			set1.add(r.nextInt(10));
	
		size = r.nextInt(5)+1;
		
		for(int j = 0; j<size; j++)
				set2.add(r.nextInt(10));
		
		MSet<Integer> A = new MSet<Integer>(set1);
		MSet<Integer> B = new MSet<Integer>(set2);
		
		MSet<Integer> answer;
		
		answer = A.Intersection(B);
		System.out.println(set1+ " Intersect  " + set2+" = "+answer);

		answer = B.Union(A);
		System.out.println("\n"+ set1+ " Union  " + set2+" = "+answer);

		answer= A.SetDifference(B);
		System.out.println("\n"+ set1+ " -  " + set2+" = "+answer);

		answer= B.SetDifference(A);
		System.out.println("\n"+ set2+ " -  " + set1+" = "+answer);
		
		boolean dj = A.isDisjoint(B);
		
		System.out.println("\n"+ set1+ " Disjointed from  " + set2+" = "+dj);
		
	}
}