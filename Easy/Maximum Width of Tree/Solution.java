// User function Template for Java

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
} */

class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int maxWidth=0;
        while(!q.isEmpty()){
            int n = q.size();
            maxWidth=Math.max(maxWidth,n);
            for(int i=0; i<n; i++){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return maxWidth;
    }
}
