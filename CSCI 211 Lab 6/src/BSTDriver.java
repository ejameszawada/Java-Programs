import java.util.Scanner;

public class BSTDriver {

	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<Integer>();
		
		int option;
		int val;
		option = menu();
		while(option!=9)
		{
			switch(option)
			{

				case 1:
					System.out.print("What value would you like to add to the tree: ");
					val = scan.nextInt();
					tree.addElement(val);
					break;
				case 2:
					tree.inOrder();
					break;
				case 3:
					tree.preOrder();
					break;
				case 4:
					tree.postOrder();
					break;
				case 5: 
					System.out.println("The number of elements in this tree is "+tree.size()+ ".");
					break;
					
				case 6:
					System.out.print("What value would you like to search? ");
					val = scan.nextInt();
					if(tree.contains(val))
						System.out.println("This value is in the tree");
					else
						System.out.println("This value is not in the tree");
					
			}
			option = menu();
		}
	}
	
		public static int menu()
		{
			System.out.println("Menu Options");
			System.out.println("-------------");
			System.out.println("1. Add Item");
			System.out.println("2. InOrder Traversal");
			System.out.println("3. PreOrder Traversal");
			System.out.println("4. PostOrder Traversal");
			System.out.println("5. Get element count");
			System.out.println("6. Search for Value");
			System.out.println("9. Quit");
			System.out.print("\nChoice: ");
			Scanner scan = new Scanner(System.in);
			int opt = scan.nextInt();
			return opt;
		}
}