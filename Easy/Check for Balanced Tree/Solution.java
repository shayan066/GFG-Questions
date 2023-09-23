
//User function Template for Java

/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    int height(Node node){
        if(node==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null) return true;
	int lh=height(root.left);
	int rh=height(root.right);
	if(Math.abs(lh-rh)>1) return false;
	return (true && isBalanced(root.left) && isBalanced(root.right));
    }
}
