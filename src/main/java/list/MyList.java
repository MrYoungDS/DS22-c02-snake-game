package edu.cmu.qatar._15121.hw5.list;

/**
 * A generic linked list class that you will write so that it implements the
 * SimpleList and SimpleQueue interfaces.
 * 
 * NAME:
 * Andrew ID:
 * Hours worked:
 */
public class MyList<DataType> implements SimpleList<DataType>, SimpleQueue<DataType> {
	private ListNode head;
	private ListNode last;

	private int size;

	/**
	 * private inner class to provide the nodes of the Linked List
	 */
	private class ListNode {
		private DataType data;
		private ListNode next;

		private ListNode(DataType data) {
			this.data = data;
			this.next = null;
		}

		public String toString() {
			return data.toString();
		}
	}

	/*
	 * This getter is needed for the autograder, don't change or remove it.
	 */
	public ListNode getHead() {
		return head;
	}

	public static void main(String[] args) {
		// Your testcases here.
	}
}