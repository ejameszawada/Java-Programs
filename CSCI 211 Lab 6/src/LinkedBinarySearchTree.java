
//*******************************************************************
//  LinkedBinaryTree.java               Authors:  Lewis/Chase
//
//  Implements the BinaryTreeADT interface
//  Modified by Bob Wilson for CS210 Lab 9
//  11/04/2006
//*******************************************************************
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedBinarySearchTree<T extends Comparable<? super T>> implements BinarySearchTree<T>{
	protected int count;
	protected BinaryTreeNode<T> root;

	/*****************************************************************
	 * Creates an empty binary tree.
	 *****************************************************************/
	public LinkedBinarySearchTree() {
		count = 0;
		root = null;
	}

	/*****************************************************************
	 * Creates a binary tree with the specified element as its root.
	 *****************************************************************/
	public LinkedBinarySearchTree(T element) {
		count = 1;
		root = new BinaryTreeNode<T>(element);
	}

	/*****************************************************************
	 * Returns true if this binary tree is empty and false otherwise.
	 *****************************************************************/
	public boolean isEmpty() {
		return count != 0;
	}

	/*****************************************************************
	 * Returns true if this binary tree is empty and false otherwise.
	 *****************************************************************/
	public int size() {
		return count;
	}

	/*****************************************************************
	 * Returns true if this tree contains an element that matches the specified
	 * target element and false otherwise.
	 *****************************************************************/
	public boolean contains(T targetElement)
	{
		return contains(root, targetElement);
	}

	private boolean contains(BinaryTreeNode<T> node, T targetElement)
	{
		if(node == null)
			return false;
		if(targetElement == node.element)
			return true;
		else {
			return contains(node.getLeftChild(), targetElement) || contains(node.getRightChild(), targetElement);
		}
			
	}
	

	/*****************************************************************
	 * Performs an inorder traversal on this binary tree by calling an overloaded,
	 * recursive inorder method that starts with the root.
	 *****************************************************************/
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(BinaryTreeNode<T> node)
	{
		
		if(node != null) {
			
			inOrder(node.getLeftChild());
			
			System.out.print(node.element + " ");
			
			inOrder(node.getRightChild());
		}
	
	}

	/*****************************************************************
	 * Performs an preorder traversal on this binary tree by calling an overloaded,
	 * recursive preorder method that starts with the root.
	 *****************************************************************/
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryTreeNode<T> node)
	{
		if(node != null) {
		
		System.out.print(node.element + " ");
		
		preOrder(node.getLeftChild());
		
		preOrder(node.getRightChild());
		}

	}
	/*****************************************************************
	 * Performs an postorder traversal on this binary tree by calling an overloaded,
	 * recursive postorder method that starts with the root.
	 *****************************************************************/
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(BinaryTreeNode<T> node)
	{
		if(node != null) {
			postOrder(node.getLeftChild());
			
			postOrder(node.getRightChild());
			
			System.out.print(node.element + " ");
		}
	}

	/*****************************************************************
	 * Performs a levelorder traversal on this binary tree, using a
	 * java.util.LinkedList templist.
	 *****************************************************************/
	public Iterator<T> iteratorLevelOrder() {
		Queue<BinaryTreeNode<T>> node = new LinkedList<BinaryTreeNode<T>>();
		LinkedList<T> results = new LinkedList<T>();
		node.offer(root);
		while (!node.isEmpty()) {
			BinaryTreeNode<T> dequeued = node.poll();
			if (dequeued != null) {
				results.offer(dequeued.getElement());
				node.offer(dequeued.getLeftChild());
				node.offer(dequeued.getRightChild());
			} else
				results.offer(null);
		}
		return results.iterator();
	}
	
	/**
	 * This function is called by the user program to add an element to the tree.  If the added element is the first one in the tree
	 * then this function should add that element; however, if the element is not the first element in the tree, then this function should
	 * use the private addElement function to either add it to the left or right child. NOTE: If it is the left or right child,
	 * there is no need to utilize the private addElement function.
	 */

	public void addElement(T el)
	{
			
		BinaryTreeNode<T> comparableElement = new BinaryTreeNode<T>(el);
		if(root == null) {
			count = 1;
			root = new BinaryTreeNode<T>(el);
		}
		else
		{
			if(comparableElement.getElement().compareTo(root.getElement()) < 0){
				if(root.getLeftChild() == null) {
					root.setLeft(new BinaryTreeNode <T>(el));
				count++;
				}
				else
					addElement(root.getLeftChild(), comparableElement);
			}
			else {
				if(root.getRightChild() == null) {
					root.setRight(new BinaryTreeNode <T>(el));
				count++;
				}
				else
					addElement(root.getRightChild(), comparableElement);
			}
		}
		
	}
	
	/**
	 * Private addElement function that adds  new element to the tree
	 * @param r - Tree node that has to add the element to its tree
	 * @param n - Tree node that has to be added to the tree
	 */
	private void addElement(BinaryTreeNode<T> r, BinaryTreeNode<T> n)
	{
		
		if(n.getElement().compareTo(r.getElement()) < 0) {
			if(r.getLeftChild() == null) {
				r.setLeft((n));
				count++;
			}
			else
				addElement(r.getLeftChild(), n);
		}
		else {
			if(r.getRightChild() == null) {
				r.setRight((n));
				count++;
			}
			else
				addElement(r.getRightChild(), n);
		}
		
	}
		
}