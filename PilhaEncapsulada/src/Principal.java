
public class Principal {

	public static void main(String[] args) {
		
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("Jos�");
		System.out.println(p.topo());
		System.out.println(p.tamanho());

		// Afeta todo o c�digo --> p.setTopo(6);

		// Desempilhando
		System.out.println("-----------------");
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
	}
}
