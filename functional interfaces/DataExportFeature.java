// Interface with default method
interface Exportable {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON using default implementation.");
    }
}

class SalesReport implements Exportable {
    @Override
    public void exportToCSV() {
        System.out.println("SalesReport exported to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("SalesReport exported to PDF.");
    }

}

class EmployeeReport implements Exportable {
    @Override
    public void exportToCSV() {
        System.out.println("EmployeeReport exported to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("EmployeeReport exported to PDF.");
    }

    @Override
    public void exportToJSON() {
        System.out.println("EmployeeReport exported to JSON (custom implementation).");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        Exportable salesReport = new SalesReport();
        Exportable employeeReport = new EmployeeReport();

        salesReport.exportToCSV();
        salesReport.exportToPDF();
        salesReport.exportToJSON(); 

        System.out.println();

        employeeReport.exportToCSV();
        employeeReport.exportToPDF();
        employeeReport.exportToJSON();  
    }
}
