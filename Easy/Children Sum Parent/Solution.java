

//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        int left_node=0, right_node=0;
        
        if((root==null) || (root.left==null && root.right==null)) return 1;
        else{
            if(root.left!=null){
                left_node = root.left.data;
                }
            if(root.right!=null){
                right_node= root.right.data;
            }
            if((root.data == left_node + right_node) && isSumProperty(root.left)!=0 && 
            isSumProperty(root.right)!=0) return 1;
        }
        return 0;
    }
}
