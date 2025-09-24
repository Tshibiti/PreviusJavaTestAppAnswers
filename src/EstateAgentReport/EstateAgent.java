
package EstateAgentReport;

public abstract class EstateAgent implements iEstateAgent {
    String agentName;
    double propertyPrice;
    double Commission = 0.2;
    
   public EstateAgent(String nameOfAgent , double propertyPrice){
        this.agentName = nameOfAgent;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName(){
        return agentName;
    }

    @Override
    public double getPropertyPrice(){
        return propertyPrice;
    }

    @Override
    public double getAgentCommission(){
        return Commission * propertyPrice;
    }
    
    
   
}
