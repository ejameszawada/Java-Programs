public class BinaryTreeNode<T>
{
	int count;
	public T element;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;

	public void setLeft(BinaryTreeNode<T> l)
	{
		left  = l;
	}

	public void setRight(BinaryTreeNode<T> r)
	{
		right  = r;
	}

	public void setValue(T val)
	{
		element = val;
	}

	public BinaryTreeNode<T> getLeftChild()
	{
		BinaryTreeNode<T> temp = left;
		return temp;
	}

	public BinaryTreeNode<T> getRightChild()
	{
		BinaryTreeNode<T> temp = right;
		return temp;
	}

	public T getElement()
	{
		T val = element;
		return val;
	}

	BinaryTreeNode()
	{
		left = null;
		right = null;
		element = null;
	}

	BinaryTreeNode(T val)
	{
		left = null;
		right = null;
		element = val;
	}

	public int numChildren()
	{
		int count = 0;

		if (left!=null)
			count++;
		if (right != null)
			count ++;

		return count;
	}

}