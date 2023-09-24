
//User function Template for Java

/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    static void helper(Node root, ArrayList<Integer> list, int level){
        if(root==null) return;
        
        if(list.size()<level){
            list.add(root.data);
        }
        helper(root.right, list, level+1);
        helper(root.left, list, level+1);
    }
    
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> list=new ArrayList<>();
        helper(node, list, 1);
        return list;
    }
}
