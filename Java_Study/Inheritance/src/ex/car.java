package ex;

public class car {

	int gasoilnegauge;
	
	
	car(int gasoil){
		this.gasoilnegauge=gasoil;
	}
	
	public static void main(String[] args) {
		

	}

}

class HybridCar extends car{
	
	int electroniGauge;
	
	HybridCar(int gasoil,int elcetron) {
		super(gasoil); //car 초기화
		this.electroniGauge = elcetron;
	}
}


class HybridWaterCar extends HybridCar{

	int hybridWater;
	
	HybridWaterCar(int gasoil, int elcetron,int water) {
		super(gasoil, elcetron);
		this.hybridWater = water;
		this.electroniGauge = water;
	}
	
}



