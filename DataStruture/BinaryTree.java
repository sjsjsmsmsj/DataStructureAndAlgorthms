package DataStruture;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        
        this.val = val;
        this.left = null;
        this.right = null;

    }
}

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
        
    }

    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inorderTraversalRecursive(root.left);
            System.out.print(root.val + " ");
            inorderTraversalRecursive(root.right);
        }
    }
    
    public boolean search(int key) {
        return searchT( this.root, key );
    }

    private boolean searchT(TreeNode root, int key) {
        if ( root == null ) {
            return false;
        } 
        if ( root.val == key ) {
            return true;
        }
        if ( root.val >= key ) {
            return searchT(root.right, key);
        } else {
            return searchT(root.left, key);
        }
    }

    public TreeNode remove(int index) {
        return remove(root, index);
    }
    public TreeNode remove(TreeNode root, int key) {
        if ( root == null) {
            return null;
        }
        if ( key < root.val ) {
            root.left = remove( root.left, key );
        } else if( key > root.val ) {
            root.right = remove( root.right, key );
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }  else {
                TreeNode temp = root.left;
                while(temp.right != null) {
                    temp = temp.right;
                } 
                root.val = temp.val;
                root.left = remove(root.left, temp.val);
            }
            return root;
        }
        return root;
    }
}
