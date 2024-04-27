
package multiplepersons;

import com.github.javafaker.Faker;

/**
 * To generate the test data on run time, first of all we need to create an instance of Faker class. 
 * @author bharg
 *
 */

public class Abc {
	Faker faker = Faker.instance();

    private String district;
    private Integer pincode;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

}
