import java.util.ArrayList;

class QueueADT<T>
{
	/*Please implement all Queue functionality
	Remember you CANNOT use the Java API to do this.*/
	private ArrayList<T> data = new ArrayList<T>();
	public QueueADT(){}
	
	public void enqueue(T A)
	{
		data.add(A);
	}
	
	public T dequeue() throws Exception
	{
		return data.remove(0);
	}
	
	public Boolean isEmpty()
	{
		if (data.size() == 0) {
			return true;
		} return false;
	}
	
}
