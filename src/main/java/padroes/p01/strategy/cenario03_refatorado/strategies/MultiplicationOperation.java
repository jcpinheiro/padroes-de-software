package padroes.p01.strategy.cenario03_refatorado.strategies;

public class MultiplicationOperation implements OperationStrategy {

	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}

}
