/**
 * 
 */
package test;

/**
 * @author tsai203m
 *
 */
public class ListElement {
	
	public ListElement next;
	public ListElement previous;
	private int data;
	private ListElement head;
	private ListElement tail;
	
	public ListElement() {
		this.next=null;
		this.data=0;
	}

	public void setData(int data) {
		this.data=data;
	}
	
	public int getData() {
		return this.data;
	}
	
	
	public void printLinkedListTail() {
		
		ListElement curr = tail;
		while(curr != null) {
			System.out.print(curr.data+" ");  
			curr = curr.previous;
		}
		
	}
	
	public void printLinkedListHead() {
		
		ListElement curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");  
			curr = curr.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListElement le = new ListElement();
		le.setData(5);

	}

}
