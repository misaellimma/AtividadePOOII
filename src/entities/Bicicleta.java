package entities;

public class Bicicleta extends Veiculo{
	private String registroDoQuadro;

	public Bicicleta() {
		super();
	}

	public Bicicleta(String marca, String modelo, Double velocidade, String registroDoQuadro) {
		super(marca, modelo, velocidade);
		this.registroDoQuadro = registroDoQuadro;
	}

	public String getRegistroDoQuadro() {
		return registroDoQuadro;
	}

	public void setRegistroDoQuadro(String registroDoQuadro) {
		this.registroDoQuadro = registroDoQuadro;
	}
	
	public void acelerar() {
		setVelocidade(getVelocidade() + 5);
		System.out.println("Velocidade da bicicleta: " + getVelocidade());
	}
	
	public void frear() {
		if(getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 5);
			if(getVelocidade() < 0) {
				setVelocidade(0.0);
			}
			System.out.println("Velocidade da bicicleta: " + getVelocidade());
		}else {
			System.out.println("Bicicleta está parada!");
		}
	}
	
	public String toString() {
		return "\nTipo do veículo: Bicicleta" +
				"\nMarca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nNumero do registro do quadro: " + getRegistroDoQuadro() +
				"\nVelocidade do veiculo: " + getVelocidade();
	}
}
