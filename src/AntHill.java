
public class AntHill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarriorAnt ant1 = new WarriorAnt("Hans");
		WorkerAnt ant2 = new WorkerAnt("Hugo");
		
		ScoutingAnt scout = new ScoutingAnt();
		scout.addProtectedAnt(ant1);
		scout.addProtectedAnt(ant2);
		

	}

}
