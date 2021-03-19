package com.em;

import com.em.academia.model.AtividadeStrategy;
import com.em.academia.service.AcademiaServiceStrategy;
import com.em.academia.strategy.model.Basquete;

public class AcademiaMain {

	public static void main(String[] args) {
		//AcademiaServiceAntigo academia = new AcademiaServiceAntigo();
		//AcademiaService academia = new AcademiaService();
		AcademiaServiceStrategy academia = new AcademiaServiceStrategy();
		
		AtividadeStrategy atividade = new AtividadeStrategy();
		
		
		academia.executar(atividade, new Basquete());
		
		
		//Atividade atividade = new Atividade();
		//atividade.setTipo(TipoAtividade.NATACAO);

		//academia.exercitar(atividade);
	}
}
