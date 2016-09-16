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
@DiscriminatorColumn(name="Quantity", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value="DQ")
public class DiscountQuantity extends DiscountType {

    private static final long serialVersionUID = 1L;

    //default constructor
    public DiscountQuantity() {
    }  

    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more 

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
