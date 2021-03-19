package com.em.model.academia.enums;

import com.em.academia.model.Atividade;

public enum TipoAtividade {

	CORRIDA {

		@Override
		public void executa(Atividade atividade) {
			atividade.setMinutosPraticados(15);
			atividade.setCaloriasPerdidas(150);

		}
	},
	NATACAO {

		@Override
		public void executa(Atividade atividade) {
			atividade.setMinutosPraticados(45);
			atividade.setCaloriasPerdidas(100);

		}
	},
	FUTEBOL {

		@Override
		public void executa(Atividade atividade) {
			atividade.setMinutosPraticados(90);
			atividade.setCaloriasPerdidas(200);

		}
	},
	BASQUETE {

		@Override
		public void executa(Atividade atividade) {
			atividade.setMinutosPraticados(20);
			atividade.setCaloriasPerdidas(80);

		}
	},
	VOLEI {

		@Override
		public void executa(Atividade atividade) {
			atividade.setMinutosPraticados(40);
			atividade.setCaloriasPerdidas(110);

		}
	};

	public abstract void executa(Atividade atividade);
}
