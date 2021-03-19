package com.em.academia.model;

import com.em.model.academia.enums.TipoAtividadeAntigo;

public class AtividadeAntiga {

	private TipoAtividadeAntigo tipo;
	private int minutosPraticados;
	private int caloriasPerdidas;

	public TipoAtividadeAntigo getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtividadeAntigo tipo) {
		this.tipo = tipo;
	}

	public int getMinutosPraticados() {
		return minutosPraticados;
	}

	public void setMinutosPraticados(int minutosPraticados) {
		this.minutosPraticados = minutosPraticados;
	}

	public int getCaloriasPerdidas() {
		return caloriasPerdidas;
	}

	public void setCaloriasPerdidas(int caloriasPerdidas) {
		this.caloriasPerdidas = caloriasPerdidas;
	}

}
