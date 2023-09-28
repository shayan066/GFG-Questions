//User function Template for Java

/*Structure of node of binary tree is as follows
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
} */
class Tree
{
    static void inorder(Node root, HashSet<Integer>hs, int x){
        if(root==null) return;
        inorder(root.left, hs,x-1);
        hs.add(x);
        inorder(root.right, hs, x+1);
    }
    //Function to find the vertical width of a Binary Tree.
    public static int verticalWidth(Node root)
	{
	    // code here.
	    HashSet<Integer>hs=new HashSet<>();
	    inorder(root,hs,0);
	    return hs.size();
	}
}
