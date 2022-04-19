package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajustaSalarioService {
	
	List<ValidaReajuste> validacoes = new ArrayList<>();
	
	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		
		validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));
			
		
		BigDecimal salarioAjustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioAjustado);
	}

}
