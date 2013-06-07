package listaEncadeada;

public class No {
	private No next;
	private Object object;
	
	public No(Object obj){
		this.setObject(obj); 
	}

	public No(Object obj, No next) {
		this.object = obj;
		this.next = next;
	}

	public No getNext() {
		return this.next;
	}

	public void setNext(No next) {
		this.next = next;
	}

	public Object getObject() {
		return this.object;
	}
	
	private void setObject(Object obj) {
		this.object = obj;
		
	}

}














