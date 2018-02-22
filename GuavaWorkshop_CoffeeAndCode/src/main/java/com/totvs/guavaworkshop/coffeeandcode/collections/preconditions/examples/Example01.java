package com.totvs.guavaworkshop.coffeeandcode.collections.preconditions.examples;

import java.math.BigDecimal;
import com.google.common.base.Preconditions;
import com.totvs.agridatagenerator.vo.EquipamentoVO;
import com.totvs.agridatagenerator.vo.enums.TipoEquipamentoEnum;

public class Example01 {

	public static void main(String[] args) {

		EquipamentoVO equipamento = new EquipamentoVO("1000", "Trator #1000", TipoEquipamentoEnum.PROPRIO, null, BigDecimal.ZERO, null, true);

		try {
			EquipamentoBO.inserir(equipamento);
		} catch (Exception e) {
			System.out.println("Falha: " + e.getMessage());
		}

	}

	public static class EquipamentoBO {

		public static void inserir(EquipamentoVO equipamento) {
			Preconditions.checkNotNull(equipamento);
			Preconditions.checkNotNull(equipamento, "Equipamento � obrigat�rio.");

			Preconditions.checkNotNull(equipamento.getCodigo(), "C�digo do equipamento � obrigat�rio.");

			// throws IllegalArgumentException
			Preconditions.checkArgument(TipoEquipamentoEnum.PROPRIO.equals(equipamento.getTipo()), "Equipamento %s n�o � do tipo Pr�prio.", equipamento.getCodigo());

			// throws IllegalStateException
			Preconditions.checkState(equipamento.isDisponivel(), "Equipamento %s n�o est� Dispon�vel.", equipamento.getCodigo());

			// Preconditions.checkElementIndex(index, 10);
			// Preconditions.checkPositionIndex(index, 10);

			EquipamentoDAO.inserir(equipamento);
		}

	}

	public static class EquipamentoDAO {

		public static void inserir(EquipamentoVO equipamento) {
			// TO DO;
		}

	}

}
