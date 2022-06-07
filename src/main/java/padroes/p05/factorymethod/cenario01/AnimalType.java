package padroes.p05.factorymethod.cenario01;

public enum AnimalType {

	DOG {
		@Override
		public Animal getAnimal() {
			return new Dog();
		}
	},
	CAT {
		@Override
		public Animal getAnimal() {
			return new Cat();
		}
	},
	TIGER {
		@Override
		public Animal getAnimal() {
			return new Tiger();
		}
	},

	LION {
		@Override
		public Animal getAnimal() {
			return new Lion();
		}
	};

	public abstract Animal getAnimal();

}

