package leetcode62;

import java.util.ArrayList;
import java.util.List;

public class generateTrees {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}

	List list = new ArrayList<TreeNode>();
    public List<TreeNode> generateTrees(int n) {
        
        if( n == 0)
            return list;
        int[] pos = new int[n];
        for( int i = 0;i<n;i++){
            pos[i] = 1;
            TreeNode root = new TreeNode(i+1);
            getResult(root,pos);
            pos[i] = 0;
        }
        return list;
    }

    public void getResult(TreeNode root,int[] pos){

        int flag = 0;
        for( int i = 0;i<pos.length;i++){
            if( pos[i] == 0){
                addNode(root,i);
                pos[i] = 1;
                getResult(root,pos);
                delNote(root,i);
                pos[i] = 0;
                flag = 1;
            }
        }
        if( flag == 0){
            TreeNode ans = getAns(root);
            if( !isExist(ans) )
                list.add(ans);
        }
            

    }
    public boolean isExist(TreeNode ans){
        int size = list.size();
        for( int i = 0;i<size;i++){
            if( isSame((TreeNode)list.get(i),ans) )
                return true;
        }
        return false;
              
    }
    public boolean isSame(TreeNode node1,TreeNode node2){
        if( node1.val != node2.val)
            return false;
        if( node1.left != null && node2.left != null){
            if( !isSame(node1.left,node2.left) )
                return false;
        }else if( node1.left == null && node2.left == null)
            ;
        else 
            return false;
        if( node1.right != null && node2.right != null){
            if( !isSame(node1.right,node2.right) )
                return false;
        }else if( node1.right == null && node2.right == null )
            ;
        else 
            return false;
        return true;
    }
    
    public TreeNode getAns(TreeNode root){
        
        TreeNode ans = new TreeNode(root.val);
        if( root.left != null )
            ans.left = getAns(root.left);
        if( root.right != null)
            ans.right = getAns(root.right);
        return ans;        
    }
    
    
    
    public void addNode(TreeNode root,int i ){
        while( true){
            if( i+1 > root.val ){
                if( root.right == null){
                    root.right = new TreeNode(i+1);
                    return ;
                }else
                    root = root.right;
            }else{
                if( root.left == null){
                    root.left = new TreeNode(i+1);
                    return ;
                }else
                    root = root.left;
            }
        }
    }
    public void delNote(TreeNode root,int i){
        while( true){
            if( i+1 > root.val ){
                if( i+1 == root.right.val ){
                    root.right = null;
                    return ;
                }else
                    root = root.right;
            }else{
                if( i+1 == root.left.val ){
                    root.left = null;
                    return ;
                }else
                    root = root.left;
            }
        }
    }
    




}
