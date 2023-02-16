package swingprojectpractice;

import java.util.LinkedList;

public class LinkedlistImple {
	public static void main(String[] args) {
		Linkedlist parent = null;

		for (int i = 0; i <= 9; i++) {
			Linkedlist node = new Linkedlist();
			node.age = i;
			node.name = "Name_" + i;
			LinkedlistImple.addDataIntoLinkList(node, parent);
			if (parent == null) {
				parent = node;
			}

		}

		updateDataFromLinkList(parent, 0, 1,50);
		//deleteDataFromLinkList(parent, 0, 1);
		readFromlinkedlist(parent);

//		Linkedlist node = parent;
//		while(node !=null) {
//			System.out.println("name"+node.getName()+" age"+node.getAge());
//			node = node.getNode();
//			
//		}

	}

	// insert data into node;
	private static void addDataIntoLinkList(Linkedlist node, Linkedlist parent) {

		if (parent == null) {
			parent = node;
		} else if (parent.getNode() == null) {
			parent.setNode(node);
		} else {
			addDataIntoLinkList(node, parent.getNode());
		}
	}

	// read data form link list;
	private static void readFromlinkedlist(Linkedlist node) {

		if (node.getNode() == null) {
			// print data
			System.out.println("Name:" + node.getName() + " age:" + node.getAge());
		} else {
			System.out.println("Name:" + node.getName() + " age:" + node.getAge());
			readFromlinkedlist(node.getNode());

			// print data;
		}
	}

//deleting data from the linked list 
	private static void deleteDataFromLinkList(Linkedlist node, int currentPosition, int deleteAtPosition) {
		if (node == null) {
			throw new IndexOutOfBoundsException(
					"node index " + deleteAtPosition + " not available size is " + currentPosition);
		} else if (node.getNode() != null && currentPosition + 1 == deleteAtPosition) {
			Linkedlist deletedItemNode = node.getNode();
			Linkedlist nextNode = deletedItemNode.getNode();
			node.setNode(nextNode);
		} else {
			deleteDataFromLinkList(node.getNode(), ++currentPosition, deleteAtPosition);
		}
	}
//update the the linked list

	private static void updateDataFromLinkList(Linkedlist node, int currentPosition, int updateAtPosion, int age) {
		if (node == null) {
			throw new IndexOutOfBoundsException(
					"node index " + updateAtPosion + " not available size is " + currentPosition);
		} else if (node.getNode() != null && currentPosition + 1 == updateAtPosion) {
			Linkedlist deletedItemNode = node.getNode();
			deletedItemNode.setAge(age);
		} else {
			updateDataFromLinkList(node.getNode(), ++currentPosition, updateAtPosion, age);
		}
	}
}
