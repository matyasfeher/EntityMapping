package entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Acer
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Fixed", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value="DF")
public class DiscountFixed extends DiscountType {

    private static final long serialVersionUID = 1L;

    //default constructor
    public DiscountFixed() {
    }
    
    double discount = 0.1;  //10% on all   

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
    }

}
