package urban.sandbox.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto bala = new Produto("Bala Juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}

}
