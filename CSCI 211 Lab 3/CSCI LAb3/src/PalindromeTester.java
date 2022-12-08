public class PalindromeTester 
{
	
	Boolean isPalindrome(String str) throws Exception
	{
		ArrayStack<Character> s = new ArrayStack<Character>();
		QueueADT<Character> q = new QueueADT<Character>();
		
		int length = str.length();
		for(int i = 0; i < length; i++) {
			s.push(str.charAt(i));
			q.enqueue(str.charAt(i));
		}
		
		Boolean P = true;
		int Count = 0;
		
		while(q.isEmpty() == false){
			if(s.pop().equals(q.dequeue()) != true)
			{
				P = false;
			}
			Count++;
		}
		
		return P;	
		
	}
	
}