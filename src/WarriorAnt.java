import java.util.Random;


public class WarriorAnt extends Ant implements ProtectedAnt{
	private final static Random healthPointGenerator = new Random();
	
	public WarriorAnt(String name) {
		super(healthPointGenerator.nextInt(2)+9, name);
	}

	@Override
	public void receiveWarning(ScoutingAnt scoutingAnt, int danger) {
		if( danger >= getHealthPoints()) {
			scoutingAnt.removeProtectedAnt(this);
		}else{
			setHealthPoints(getHealthPoints()- danger);
		}
		
	}

	

}
