package com.example.service;

import com.example.model.Desempenho;
import com.example.model.Funcionario;
import java.math.BigDecimal;


public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if (desempenho == Desempenho.A_DESEJAR) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        } else if (desempenho == Desempenho.BOM) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.reajustarSalario(reajuste);
        } else if (desempenho == Desempenho.OTIMO) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.2"));
            funcionario.reajustarSalario(reajuste);
        } else {
            System.out.println("Desempenho não encontrado");
        }
    }

}
