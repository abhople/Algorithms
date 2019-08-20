/**
 * 
 */
package com.test.binarytree;

/**
 * @author Anupam Bhople
 *
 */
public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		} else { 
			root.insert(value);
		}
	}
	
	public void preOrderTraversal() {
		root.preOrderTraversal();
	}
}
