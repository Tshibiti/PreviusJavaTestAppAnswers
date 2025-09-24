
package EstateAgentReport;


public class EstateAgentSales extends EstateAgent {

    public EstateAgentSales(String nameOfAgent, double propertyPrice) {
        super(nameOfAgent, propertyPrice);
    }
    
    public void printProperty(){
         System.out.println("ESTATE AGENT REPORT");
        System.out.println("*******************************");
        System.out.println("ESATE AGENT NAME: "+getAgentName());
        System.out.println("PROPERTY PRICE: R"+getPropertyPrice());
        System.out.println("AGENT COMMISSION: R"+getAgentCommission());
    }
}
