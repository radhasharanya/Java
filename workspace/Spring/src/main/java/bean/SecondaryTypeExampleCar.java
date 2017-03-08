package bean;

public class SecondaryTypeExampleCar {
	private String []cars;
	private SecondaryTypeExampleEgine []engine;
	
	public void setCars(String[] cars) {
		this.cars = cars;
	}


	public void setEngine(SecondaryTypeExampleEgine[] engine) {
		this.engine = engine;
	}




	public void data()
	{
		for(String car:cars)
		{
			System.out.println(car);
		}
		for(SecondaryTypeExampleEgine engine:engine)
		{
			System.out.println(engine.getEngine());
		}
	}

}
