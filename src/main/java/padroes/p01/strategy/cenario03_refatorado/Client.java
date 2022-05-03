package padroes.p01.strategy.cenario03_refatorado;


import padroes.p01.strategy.cenario03_refatorado.strategies.*;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));

		System.out.println(calc.getResult(new OperationStrategy() {
			@Override
			public int calculate(int num1, int num2) {
				return (int) Math.pow(num1, num2);
			}
		})  );

		System.out.println(
				calc.getResult((int num1, int num2) -> (int) Math.pow(num1, num2) ));

	}
}
