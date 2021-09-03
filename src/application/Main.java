package application;

import java.util.Scanner;

import entities.Bicicleta;
import entities.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipoVeiculo = 0;
		
		while(tipoVeiculo != 1 && tipoVeiculo != 2 && tipoVeiculo != 3) {
			System.out.println("Informe o tipo de veículo:\n(1 para Carro, 2 para Bicicleta ou 3 sair) ");
			tipoVeiculo = sc.nextInt();
			sc.nextLine();
			
			switch (tipoVeiculo) {
			case 1:
				tipoCarro();
				break;
			case 2:
				tipoBicicleta();
				break;
			case 3:
				break;
			default:
				System.out.println("Valor informado não corresponde nenhum veículo\n");
				break;
			}
		}
	}
	
	public static void tipoCarro() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a marca do carro: ");
		String marca = sc.nextLine();
		System.out.println("Informe o modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Informe a placa do carro: ");
		String placa = sc.nextLine();
		System.out.println("Informe o chassi do carro: ");
		String chassi = sc.nextLine();
		System.out.println("Informe a velocidade carro: ");
		Double velocidade = sc.nextDouble();
		
		Carro carro = new Carro(marca, modelo, velocidade, placa, chassi);
		
		System.out.println("Velocidade atual do veículo: " + carro.getVelocidade());
		
		carro.controlarVelocidade();
		
		System.out.println(carro.toString());
	}
	
	public static void tipoBicicleta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a marca do bicicleta: ");
		String marca = sc.nextLine();
		System.out.println("Informe o modelo do bicicleta: ");
		String modelo = sc.nextLine();
		System.out.println("Informe o número do registro do quadro da bicicleta: ");
		String registroDoQuadro = sc.nextLine();
		System.out.println("Informe a velocidade da bicicleta: ");
		Double velocidade = sc.nextDouble();
		
		Bicicleta bicicleta = new Bicicleta(marca, modelo, velocidade, registroDoQuadro);
		
		bicicleta.controlarVelocidade();
		System.out.println(bicicleta.toString());
	}
}
