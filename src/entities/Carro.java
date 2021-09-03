package entities;

import java.util.Scanner;

public class Carro extends Veiculo{
	private String placa;
	private String chassi;
	
	public Carro() {
		
	}	

	public Carro(String marca, String modelo, Double velocidade, String placa, String chassi) {
		super(marca, modelo, velocidade);
		this.placa = placa;
		this.chassi = chassi;
		
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void acelerar() {
		setVelocidade(getVelocidade() + 10);
		System.out.println("Velocidade do veículo: " + getVelocidade());
	}
	
	public void frear() {
		if(getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 10);
			if(getVelocidade() < 0) {
				setVelocidade(0.0);
			}
			System.out.println("Velocidade do veículo: " + getVelocidade());
		}else {
			System.out.println("Carro está parado!");
		}
	}
	
	public String toString() {
		return "\nTipo do veículo: Carro" +
				"\nMarca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nPlaca: " + getPlaca() +
				"\nChassi: " + getChassi() +
				"\nVelocidade do carro: " + getVelocidade();
	}
}
