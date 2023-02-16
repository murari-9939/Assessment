package swingprojectpractice;


public class EngineTest {
	
	
public static void main(String[] args) {
	Engine e = getEngine(1);
	System.out.println("Name: "+e.getManuactrualName()+" capacity:"+e.capacityInHp());
}


public static Engine getEngine(int id) {
	Engine engine = null;
	switch(id) {
	case 1:
		Bus bus = new Bus();
		engine=bus;
		break;
	case 2:
		Train train= new Train();
		engine=train;
		break;
	case 3:
		Car car = new Car();
		engine=car;
		break;
	case 4:
		Bike bike= new Bike();
		engine=bike;
		break;
	
	}
	
	return engine;
}

}
