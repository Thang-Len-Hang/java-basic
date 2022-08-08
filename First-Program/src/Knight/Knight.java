package Knight;

public class Knight {

	//private RescuingDimselQuest quest = new RescuingDimselQuest();
	//private SlyDragonQuest quest = new SlyDragonQuest();
	//private SingYoYeYoQuest quest = new SingYoYeYoQuest();
	
	private Quest quest; // dependency of Knight (Creating has a relationship - no declare variable)

	public String goQuest() {
		return quest.goQuest();
	}
	
	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public static void main(String[] args) {
		Knight knight = new Knight();
		//knight.setQuest(new RescuingDimselQuest());
		//knight.setQuest(new SlyDragonQuest());
		knight.setQuest(new GreateMatrimonyQuest());
		System.out.println(knight.goQuest());
	}

	
}
