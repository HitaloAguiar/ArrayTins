package unitins;

public class LinkedTins<T> {

	private Node<T> head;
	private int size = 0;

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		
		return head == null;
	}
	
	@Override
	public String toString() {
		
		if (isEmpty())
			return null;
		
		Node<T> aux = head;
		
		String values = "[ ";
		
		while (aux != null) {
			
			if (aux.getNext() != null)
				values += aux.getData() + ", ";
			
			else
				values += aux.getData() + " ]";
							
			aux = aux.getNext();
		}
		
		return values;
	}
	
	public void add (T newElement) {
		
		if (isEmpty()) {
			
			head = new Node<T>(newElement);
		}
		
		else {
			
			Node<T> aux = head;
			
			while (aux.getNext() != null) {
				
				aux = aux.getNext();
			}
			
			aux.setNext(new Node<T>(newElement));
		}
		
		size++;
	}
	
//	public void addFirst (T newElement) {
//		
//		if (isEmpty()) {
//			
//			head = new Node<T>(newElement);
//		}
//		
//		Node<T> aux = head;
//		
//		while (aux.getNext() != null) {
//			
//			aux = aux.getNext();
//		}
//		
//		for (int i = (size-1); i > 0; i--) {
//			
//			aux.setNext(aux);
//			
//			
//		}
//	}
	
	public T getFirst() {
		
		return head.getData();
	}
	
	public T getLast() {
		
		Node<T> aux = head;
		
		while (aux.getNext() != null) {
			
			aux = aux.getNext();
		}
		
		return aux.getData();
	}
	
	public T get(int index) {
		
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		
		Node<T> aux = head;
		
		for (int i = 0; i < size; i++) {
			
			if (i == index)
				break;
			
			aux = aux.getNext();
				
		}
		
		return aux.getData();
	}
}
