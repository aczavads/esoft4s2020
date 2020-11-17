package aula20201112.modeloOOMercadoPersistente.pessoa;

public class PessoaNãoClienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PessoaNãoClienteException(String message) {
        super(message);
	}

}
