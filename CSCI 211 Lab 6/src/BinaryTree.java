//*******************************************************************
//
//      BinaryTreeADT.java		Authors:  Lewis/Chase
//
//	   Defines the interface to a binary tree data structure
//*******************************************************************


import java.util.Iterator;

public interface BinaryTree<T> 
{

	public boolean isEmpty();
	public int size();
	public boolean contains(T targetElement);
	public String toString();
	//public Iterator<T> iterator();
	public void inOrder();
	public void preOrder();
	public void postOrder();
	public Iterator<T> iteratorLevelOrder();
	public void addElement(T el);

}  // interface BinaryTreeADT

