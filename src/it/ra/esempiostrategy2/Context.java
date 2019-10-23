package it.ra.esempiostrategy2;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public int[] executeStrategy(int[] array)
	{
		return strategy.sort(array);
	}
}
