package functionalinterface; 

public class FunctionalInterfaceUse {

	public static void main(String [] args){

		Validador<String> validadorCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.println(validadorCep.validar(args[0]));
		
	}
}