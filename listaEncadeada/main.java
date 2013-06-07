package listaEncadeada;

public class main {

	public static void main(String[] args) {
	
		ListaEncadeada list = new ListaEncadeada();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list.toString());

		list.remove(2);

		System.out.println(list.toString());

	}

	

}
