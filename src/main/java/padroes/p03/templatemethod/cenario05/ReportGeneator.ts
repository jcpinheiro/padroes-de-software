// Classe base abstrata: define o template
abstract class ReportGenerator {

    // Template Method ::: busca -> processa -> exporta
    public generateReport(): void {
        const data = this.fetchData();
        const processed = this.processData(data);
        this.exportReport(processed);
    }

    // Métodos concretos (fixos)
    protected fetchData(): any[] {
        console.log("Buscando dados do banco de dados...");
        return [
            { id: 1, name: "João", sales: 300 },
            { id: 2, name: "Maria", sales: 450 },
            { id: 3, name: "Carlos", sales: 150 },
        ];
    }

    // Método concreto, mas personalizável
    protected processData(data: any[]): any {
        console.log("Processando dados...");
        return data.map(item => ({
            ...item,
            salesWithTax: item.sales * 1.1, // adiciona imposto
        }));
    }

     /*    [
        { id: 1, name: "João", sales: 300, salesWithTax: 330 },
        { id: 2, name: "Maria", sales: 450, salesWithTax: 495 },
        { id: 3, name: "Carlos", sales: 150, salesWithTax: 165 }
    ]
*/

    // Método abstrato (deve ser implementado)
    protected abstract exportReport(data: any[]): void;
}

// Subclasse 1 — Exporta em CSV
class CsvReportGenerator extends ReportGenerator {
    protected exportReport(data: any[]): void {
        console.log("📄 Exportando relatório em CSV...");
        const header = Object.keys(data[0]).join(",");
        const rows = data.map(obj => obj.values().join(","));
        const csv = [header, ...rows].join("\n");
        console.log(csv);
    }
}

// Subclasse 2 — Exporta em JSON
class JsonReportGenerator extends ReportGenerator {
    protected exportReport(data: any[]): void {
        console.log("📄 Exportando relatório em JSON...");
        console.log(JSON.stringify(data, null, 2));
    }
}

// Subclasse 3 — Exporta em PDF (simulado)
class PdfReportGenerator extends ReportGenerator {
    protected exportReport(data: any[]): void {
        console.log("📄 Gerando PDF fictício...");
        data.forEach(d => console.log(`Linha PDF: ${d.name} - R$${d.salesWithTax.toFixed(2)}`));
    }
}

// ---- Uso ----
const csvReport = new CsvReportGenerator();
csvReport.generateReport();

const jsonReport = new JsonReportGenerator();
jsonReport.generateReport();

const pdfReport = new PdfReportGenerator();
pdfReport.generateReport();