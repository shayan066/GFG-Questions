

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> q= new LinkedList<>();
        ArrayList<Integer>list= new ArrayList<>();
        q.add(node);
        while(q.size()>0){
            Node temp=q.remove();
            list.add(temp.data);
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        return list;
    }
}
