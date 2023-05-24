package padroes.p13.adapter.cenario03;

public class StockMarketAdapter implements CSVParser {

	private StockMarketDataParser stockMarketDataParser;
	
	public StockMarketAdapter(StockMarketDataParser stockMarketDataParser) {
		this.stockMarketDataParser = stockMarketDataParser;
	}
	
	@Override
	public void parseCSV() {

		stockMarketDataParser.parseXML();

		// converter para CSV
	}
}
