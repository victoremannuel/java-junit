package com.example.service;

import com.example.model.Desempenho;
import com.example.model.Funcionario;
import java.math.BigDecimal;


public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajustarSalario(reajuste);
    }

}
