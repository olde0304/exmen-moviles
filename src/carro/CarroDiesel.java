package carro;

import IComplementos.IMotor;
import IComplementos.IRelacionDiferencial;
import IComplementos.ISuspencion;

public class CarroDiesel extends Carro{
	
	//Inyeccion de dependencias
	private final IMotor motor;
	private final IRelacionDiferencial relacion;
	private final ISuspencion suspencion;
	
	
	public CarroDiesel(IMotor motor, IRelacionDiferencial relacion, ISuspencion suspencion) {
		this.motor = motor;
		this.relacion = relacion;
		this.suspencion = suspencion;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tipoCarroOffRoad() {
		// TODO Auto-generated method stub
		motor.tipo();
		relacion.tipo();
		suspencion.tipo();
	}
	
}
