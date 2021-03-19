package com.em.academia.strategy.model;

import com.em.academia.model.AtividadeStrategy;

public class Volei implements EsporteStrategy {

	public void pratica(AtividadeStrategy atividade) {
		atividade.setMinutosPraticados(40);
		atividade.setCaloriasPerdidas(110);
	}
	
	public String nome() {
		return "A classe q ta chamando já deveria saber...........";
	}

}
