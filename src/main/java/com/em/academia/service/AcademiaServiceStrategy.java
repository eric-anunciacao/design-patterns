package com.em.academia.service;

import java.util.logging.Logger;

import com.em.academia.model.AtividadeStrategy;
import com.em.academia.strategy.model.EsporteStrategy;

public class AcademiaServiceStrategy {

	private static final Logger LOGGER = Logger.getLogger(AcademiaServiceStrategy.class.getName());
	
	public void executar(AtividadeStrategy atividade, EsporteStrategy esporte) {
		esporte.pratica(atividade);
		
		
		LOGGER.info("Minutos praticados: " + atividade.getMinutosPraticados());
		LOGGER.info("Calorias perdidas: " + atividade.getCaloriasPerdidas());
		LOGGER.info("Nome do esporte: " + esporte.nome());
	}



	
	
}
