package listaEncadeada;

public class ListaEncadeada {
	private int size;
	private No head;
	
	public ListaEncadeada(){
		this.head = null;
		this.size = 0;
	}
	
	public No getNo(int position){
		//Lança excessão se a posição solicitada for menor que zero ou maior que o tamanho da lista;
		if(position < 0 || position >= size){throw new IndexOutOfBoundsException();} 
		No temp = this.head;
		//Percorre a lista até encontrar o valor na posição desejada, que estará em 'temp'
		for(int i = 0; i < position; i++){
			temp = temp.getNext();
		}
		return temp;
	}
	
	public void addPosition(Object obj, int position){
		if(position < 0 || position > size){
			throw new IndexOutOfBoundsException();
		}else{
			//temp recebe o nó da posição anterior
			No temp = this.getNo(position - 1);
			//add na posição e set o próximo
			temp.setNext(new No(obj, temp.getNext()));
		}
		this.size++;
	}
	
	public void addFirst(Object obj){
		this.addPosition(obj, 0);
	}
	
	public void add(Object obj){
		this.addPosition(obj, size);
	}
	
	public void remove(int position){
		if(position < 0 || position > size){throw new IndexOutOfBoundsException();}
		No temp = this.head;
		
		for(int i = 0; i < position -1; i++){
			temp = temp.getNext();
		}
		//Condições para a exclusão, se a posição é zero, perde a head,
		//se for o último apenas seta o valor para null e se estiver em qualquer
		//outra posição apaga a referência dele e para ele.
		if(position == 0){this.head = this.head.getNext();}
		else if(position == this.size -1){temp.setNext(null);}
		else{temp.setNext(temp.getNext().getNext());}
	}
	
	
	public void printer(){
		if(this.size == 0){
			System.out.println("[*EMPTY*]");
		}else{		
			for(int i = 0; i < this.size; i++){
				System.out.print(this.head.getObject()+"| ");
				head = head.getNext();
			}
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
