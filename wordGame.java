import java.util.Scanner;
import java.util.Random;
class range{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
	
		
		int[] answer = new int[4];
		for (int i = 0; i<4; i++){
			int newNum = rand.nextInt(9)+1;
			for (int j = 0; j<answer.length; j++){
				while(newNum == answer[j]){
					newNum = rand.nextInt(9)+1;
				}
			}
			answer[i] = newNum;
		}
		for (int i = 0; i<answer.length; i++){
			System.out.print (answer[i] +" ");
		}
		System.out.println ("");
		////////////user input//////////
		boolean going = true;
		
		while (going){
		int hit = 0;
		int blow = 0;	
		
		int[] a = new int[4];
		
		
			System.out.println ("input a number ");		
			int num = scan.nextInt();
			a[0] = num;
		for (int i = 1; i<a.length; i++){
			System.out.println ("input a number ");		
			 num = scan.nextInt();
			
			int j = 0;
			while (j<i){
				if(num == a[j]){
					System.out.println ("input a unique number ");		
					 num = scan.nextInt();
					 j=0;
				}else{
					
					a[i] = num;
					j++;
				}					
					
				
			}
		}
		for (int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println ("");
	
	
		for (int i = 0; i<answer.length; i++){	
			
			for (int j = 0; j<a.length; j++){
				if(j == i && a[j] == answer[i]){
					hit++;
				}else{
					if(a[j] == answer[i]){
					blow++;
				}
				}
			
			}
		}
		
		System.out.println (hit+" hit , "+blow+" blow.");
		if(hit == 4){
			System.out.println ("you won");
			going = false;
		}
		}
	}
}