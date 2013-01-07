import java.util.Random;


public class ScoutingAnt {
	
	private final static Random dangerGenerator = new Random();
	private ProtectedAnt[] protectedAnts = new ProtectedAnt[0];
	
	public void addProtectedAnt(ProtectedAnt protectedAnt){
		ProtectedAnt[] temp = new ProtectedAnt[protectedAnts.length + 1];
		for (int i = 0; i < protectedAnts.length; i++){
			temp[i] = protectedAnts[i];
		}
		temp[temp.length - 1] = protectedAnt;
		protectedAnts = temp;
		System.out.println("Ich passe nun auf eine neue Ameise auf!");
	}

	public void removeProtectedAnt(ProtectedAnt protectedAnt){
		ProtectedAnt[] temp = new ProtectedAnt[protectedAnts.length -1];
		int antCounter = 0;
		for (int i = 0; i< protectedAnts.length; i++){
			if (!protectedAnt.equals(protectedAnts[i])){
				temp[antCounter++] = protectedAnts[i];
			}
		}
		protectedAnts = temp;
		System.out.println("ich passe nun auf  eine Ameise weniger auf");
	}
	
	public void warn() {
		for(ProtectedAnt ant : protectedAnts) {
			ant.receiveWarning(this, dangerGenerator.nextInt(11));
		}
	}
}
