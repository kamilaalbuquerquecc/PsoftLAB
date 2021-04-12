package application;

import java.util.Scanner;

import padraoStrategy.StrategyRota;
import rota.Rota;
import rota.RotaCarro;
import rota.RotaMetro;
import rota.RotaOnibus;
import rota.RotaPedestre;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RotaPedestre pedestre = new RotaPedestre();
		RotaCarro carro = new RotaCarro();
		RotaOnibus onibus = new RotaOnibus();
		RotaMetro metro = new RotaMetro();
		
		Rota rota = new Rota();
		
		while(true) {
			System.out.println("Como você vai chegar nesse lugar? (pedestre, carro, onibus, metro)");
			String transporte = sc.next();
		
			if(transporte.equals("pedestre")) {
				rota.tipoTransporte(pedestre);
			}
			else if(transporte.equals("carro")) {
				rota.tipoTransporte(carro);
			}
			else if(transporte.equals("onibus")) {
				rota.tipoTransporte(onibus);
			}
			else if(transporte.equals("metro")) {
				rota.tipoTransporte(metro);
			}
			else {
				System.out.println("Digite novamente!");
			}
			System.out.println("----------------------------");
		 }
		

	}

}
