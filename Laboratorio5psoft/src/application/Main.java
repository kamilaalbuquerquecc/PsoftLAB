package application;

import rota.Rota;
import rota.RotaCarro;
import rota.RotaMetro;
import rota.RotaOnibus;
import rota.RotaPedestre;

public class Main {

	public static void main(String[] args) {
		
		RotaPedestre pedestre = new RotaPedestre();
		RotaCarro carro = new RotaCarro();
		RotaOnibus onibus = new RotaOnibus();
		RotaMetro metro = new RotaMetro();
		double distancia = 7.2;
		
		Rota rota = new Rota(distancia,pedestre);
		System.out.println("Calculando a rota de Pedestre…");
		rota.calcularRota();
		System.out.println(rota.toString());
		
		rota.mudaRota(carro);
		System.out.println("Calculando a rota de Carro…");
		rota.calcularRota();
		System.out.println(rota.toString());
		
		rota.mudaRota(onibus);
		System.out.println("Calculando a rota de Onibus…");
		rota.calcularRota();
		System.out.println(rota.toString());
		
		rota.mudaRota(metro);
		System.out.println("Calculando a rota de Metro…");
		rota.calcularRota();
		System.out.println(rota.toString());

	}

}
