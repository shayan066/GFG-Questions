

//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    static void helper(Node root,ArrayList<Integer>list){
        if(root==null) return;
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
        
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
        
    }

}
