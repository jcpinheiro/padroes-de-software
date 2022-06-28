package padroes.p12.flyweight.cenario03.model;

public class PixelType {

	private final Character character;
	private final Integer treasureReward;

	public PixelType(Character character, Integer treasureReward) {
		this.character = character;
		this.treasureReward = treasureReward;
	}

	public Character getCharacter() {
		return character;
	}
	
	public Integer getTreasureReward() {
		return treasureReward;
	}
}
