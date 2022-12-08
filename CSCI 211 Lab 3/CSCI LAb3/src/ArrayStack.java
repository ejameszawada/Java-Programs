import java.util.Arrays;

//pulled mostly all of this from the chapter 12 powerpoint (on blackboard) and edited so it would work with the driver.
public class ArrayStack<T>
{
    private int top;  
    private T[] stack;
    private final static int DEFAULT_CAPACITY = 100;

    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }

    
    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity)
    {
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    
	private void expandCapacity() //if the stack gets full, double it's size
    {
        stack = Arrays.copyOf(stack, stack.length * 2);   
    }
	
	private boolean isEmpty() { //is empty method, returns false

		return false;
	}
	
    private int size() {// the size of the array as an int
		return stack.length;
	}
	
    public void push(T element)
    {
        if (size() == stack.length) 
            expandCapacity();

        stack[top] = element;
        top++;
    }


	
	public T pop() throws EmptyCollectionException //pops the top element off the top of the stack
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        top--;
        T result = stack[top];
        stack[top] = null; 

        return result;
    }
    

}
