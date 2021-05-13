package carro;

import IComplementos.IMotor;
import IComplementos.IRelacionDiferencial;
import IComplementos.ISuspencion;

public class CarroGasolina extends Carro{
	//Composicion 

	private final IMotor motor;
	private final IRelacionDiferencial relacion;
	private final ISuspencion suspencion;

	// Inyeccion de dependecias
	public CarroGasolina( IMotor motor, IRelacionDiferencial relacion, ISuspencion suspencion) {
		this.motor = motor;
		this.relacion = relacion;
		this.suspencion = suspencion;
	}

	@Override
	public void tipoCarroOffRoad() {
		// TODO Auto-generated method stub
		motor.tipo();
		relacion.tipo();
		suspencion.tipo();
	}

}
