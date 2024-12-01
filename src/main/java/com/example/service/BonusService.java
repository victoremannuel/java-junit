package com.example.service;

import com.example.model.Funcionario;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			// valor = BigDecimal.ZERO;
			throw new IllegalArgumentException("funcionário com salário superior a 1000 reais, não tem direito a bonus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
