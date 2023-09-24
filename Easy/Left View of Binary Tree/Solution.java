
//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    static void helper(Node root, ArrayList<Integer> list, int level){
        if(root==null) return;
        
        if(list.size()<level){
            list.add(root.data);
        }
        helper(root.left, list, level+1);
        helper(root.right, list, level+1);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list= new ArrayList<>();
      helper(root, list, 1);
      return list;
    }
}

