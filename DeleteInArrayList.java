import java.util.ArrayList;

public class DeleteInArrayList {
	
	static ArrayList<Integer> people;


	public static void Run(int n) {
		long startTime = System.currentTimeMillis();
		
		people = new ArrayList<Integer>(n);
		
		for(int i=1 ; i<=n; i++) {
			people.add(i);
		}
			
		for(int i=people.size()-1; i>0; i--) {
			if(i%2 !=0)
				people.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 

	}

}
