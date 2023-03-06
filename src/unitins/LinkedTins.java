package unitins;

public class LinkedTins<T> {

	private Node<T> head;
	private Node<T> tail;
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
			
			tail = head;
		}
		
		else {
			
			Node<T> aux = tail;
			
			aux.setNext(new Node<T>(newElement));
			
			aux.getNext().setPrevious(tail);
			
			tail = aux.getNext();
		}
		
		size++;
	}
	
	public void addFirst (T newElement) {
		
		if (isEmpty()) {
			
			head = new Node<T>(newElement);
			
			tail = head;
		}
		
		else {
		
			Node<T> aux = head.getNext();
			
			head = new Node<T>(newElement);
			
			head.setNext(aux.getPrevious());
			
			aux.getPrevious().setPrevious(head);
		}
		
		size++;
	}
	
	public void addLast(T newElement) {
		
		if (isEmpty()) {
			
			head = new Node<T>(newElement);
			
			tail = head;
		}
		
		else {
			
			Node<T> aux = tail;
			
			aux.setNext(new Node<T>(newElement));
			
			aux.getNext().setPrevious(tail);
			
			tail = aux.getNext();
		}
		
		size++;
	}
	
	public void add (T newElement, int index) {
		
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		
		if (isEmpty()) {
			
			head = new Node<T>(newElement);
			
			tail = head;
		}
		
		else {
		
			Node<T> aux = head;
			
			for (int i = 0; i < size; i++) {
				
				if (i == index)
					break;
				
				aux = aux.getNext();		
			}
			
			Node<T> oldNext = aux.getNext();
			
			Node<T> oldPrevious = aux.getPrevious();
			
			aux = new Node<T>(newElement);
			
			aux.setNext(oldNext.getPrevious());
			
			oldNext.getPrevious().setPrevious(aux);
			
			oldPrevious.setNext(aux);
			
			aux.setPrevious(oldPrevious);
		}
		
		size++;
	}
	
	public T getFirst() {
		
		return head.getData();
	}
	
	public T getLast() {
		
		return tail.getData();
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
