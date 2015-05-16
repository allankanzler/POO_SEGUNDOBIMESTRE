package exemplostatic;

public class Main {
	
	public static void main(String[] args) {
	
		String  nome =" all an ";
		System.out.println(nome);
		nome.trim();
		System.out.println(nome);
		System.out.println(nome.trim());
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		String nome2 = nome.toUpperCase();
		String nome3 = nome.trim();
		System.out.println(nome+nome2+nome3);
		nome.trim();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(nome3);
		
	}

}
