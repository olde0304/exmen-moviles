package carro;

import IComplementos.IMotor;
import IComplementos.IRelacionDiferencial;
import IComplementos.ISuspencion;

public class EnsanblarCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Polimorfismo

		//new CarroDiesel(new CarroDiesel(IMotor motor, IRelacionDiferencial diferencial, ISuspencion supencion)).tipoCarroOffRoad();
		//new CarroDiesel(IMotor motor, IRelacionDiferencial diferencial, ISuspencion supencion).tipoCarroOffRoad();
		
		new CarroDiesel().tipoCarroOffRoad();
	}

	
}
