package listaDuplamenteEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DLinkedList lista1 = new DLinkedList();
		lista1.addFirst(new DNode("2", null,null));
		lista1.addFirst(new DNode("1", null,null));
		lista1.addLast(new DNode("3", null,null));
				
		System.out.println("Imprimindo os elementos \n" + lista1);

        for (int index = 1; index <= 50; index++) {
        	lista1.addLast(new DNode(index + "", null,null));        	
        }
        
        System.out.println("Imprimindo os elementos \n" + lista1);
	}

}
