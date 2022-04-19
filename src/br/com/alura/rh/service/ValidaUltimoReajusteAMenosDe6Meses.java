package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidaUltimoReajusteAMenosDe6Meses implements ValidaReajuste{
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate ultimoReajuste = funcionario.getDataUltimoReajuste();
		Long tempoUltimoReajuste = ChronoUnit.MONTHS.between(ultimoReajuste, LocalDate.now());
		if(tempoUltimoReajuste < 6 ) {
			throw new ValidacaoException("Ultimo reajuste a menos de 6 meses!");
		}
	}

}
