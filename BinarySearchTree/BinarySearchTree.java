/**
 * 
 */
package com.test.binarytree;

/**
 * @author Anupam Bhople
 *
 */
public class BinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tree binTree = new Tree();
		binTree.insert(10);
		binTree.insert(12);
		binTree.insert(88);
		binTree.insert(-9);
		binTree.insert(34);
		binTree.insert(2);
		binTree.insert(66);
		binTree.insert(72);
		binTree.insert(14);
		
		binTree.preOrderTraversal();
		
	}

}
