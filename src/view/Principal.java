package view;

import controller.RestoDivController;

public class Principal {

	public static void main(String[] args) {

		RestoDivController rd = new RestoDivController();

		int dividendo = 25;
		int divisor = 3;
		int restoDivisao = rd.restoDivisao(dividendo, divisor);

		System.out.print(restoDivisao);

	}
}
