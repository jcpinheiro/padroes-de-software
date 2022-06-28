package padroes.p13.adapter.cenario03;

public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockMarket = new StockMarketAdapter(new StockMarketDataParser());
		
		realEstate.parseCSV();
		machineLearning.parseCSV();
		stockMarket.parseCSV();
	}
}
