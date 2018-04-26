import java.util.Optional;

public class OptionalChallenge {

	public static void main(String[] args) {

		Optional<Warrior> optWarrior = Warrior.getWarrior();
		
		Optional<Warrior> strongestWarrior = getEmpty()
				.or(() -> Warrior.getWarrior())
				.or(() -> optWarrior);
		
		System.out.println(strongestWarrior.get().name);
		
	}

	static Optional<Warrior> getEmpty() {
		return Optional.empty();
	}

	
	static class Warrior {
		private String name;
		public Warrior(String name) {
			this.name = name;
		}
		
		static Optional<Warrior> getWarrior() {
			return Optional.of(new Warrior("Kratos"));
		}
	}
}
