/**
 * 
 */
package com.test.binarytree;

import java.util.Queue;

import javax.management.Query;

/**
 * @author Anupam Bhople
 *
 */
public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int value) {
		this.data = value;
	}

	// Recursive
	public void insert(int value) {

		if (value == data) {
			return; // Dups not allowed; hence no-op
		}

		// check leftChild
		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode(value);
			} else {
				leftChild.insert(value);
			}
		}

		// check rightChild
		if (value > data) {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public void preOrderTraversal() {
		System.out.println(data);
		if(leftChild!=null) leftChild.preOrderTraversal();
		if(rightChild!=null) rightChild.preOrderTraversal();
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the leftChild
	 */
	public TreeNode getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild
	 *            the leftChild to set
	 */
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public TreeNode getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild
	 *            the rightChild to set
	 */
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

}
