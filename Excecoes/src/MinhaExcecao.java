
public class MinhaExcecao extends Exception {
	
	String message = "Uma exceção do tipo minha excecao foi gerada";
	
	public String getMessage() {
		return this.message;
	}
	
	public void MetodoDaExcecaoEspecifica() {
		System.out.println("método da excecao específica");
	}

}
