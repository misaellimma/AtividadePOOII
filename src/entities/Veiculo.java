package entities;

import java.util.Scanner;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private Double velocidade = 0.0;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String marca, String modelo, Double velocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void controlarVelocidade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nVelocidade atual do ve�culo: " + velocidade);
		
		int opcao = 1;
		while(opcao != 0) {
			System.out.println("Para acelerar o Veiculo digite 1, para frear digite 2 e para sair digite 0: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 0:
				break;
			case 1:
				acelerar();
				break;
			case 2:
				frear();
				break;
			default:
				System.out.println("Valor informado incorretamente\n");
				break;
			}
		}
	}

	public abstract void acelerar();
	public abstract void frear();
	
}
