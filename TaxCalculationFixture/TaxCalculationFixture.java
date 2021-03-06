 
public class TaxCalculationFixture {
       private double taxableIncome;
 
       public void setTaxableIncome(double taxableIncome) {
              this.taxableIncome = taxableIncome;
       }
 
       public double tax() {
              double tax = 0;
              if (taxableIncome <= 250000)
                     tax = 0;
              if (taxableIncome >= 250001 && taxableIncome <= 500000)
                     tax = (taxableIncome / 100) * 10;
              if (taxableIncome >= 500001 && taxableIncome <= 1000000)
                     tax = (taxableIncome / 100) * 20;
              if (taxableIncome >= 1000001)
                     tax = (taxableIncome / 100) * 30;
              return tax;
       }
}