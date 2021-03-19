package com.em.academia.service;

import java.util.logging.Logger;

import com.em.academia.model.Atividade;

public class AcademiaService {

	private static final Logger LOGGER = Logger.getLogger(AcademiaService.class.getName());
	
	public void exercitar(Atividade atividade) {
		
		atividade.executar();

		LOGGER.info("Resumo da atividade: " + atividade.getTipo());
		LOGGER.info("Minutos praticados: " + atividade.getMinutosPraticados());
		LOGGER.info("Calorias perdidas: " + atividade.getCaloriasPerdidas());
	}

	
}
