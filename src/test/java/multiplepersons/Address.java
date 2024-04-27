
package multiplepersons;
/**
 * 
 * To generate the test data on run time, first of all we need to create an instance of Faker class. 
 * Once instance of faker class is created we can start using it for creating the data.
 * @author bharg
 *
 */

public class Address {

    private String state;
    private String country;
    private Abc abc;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Abc getAbc() {
        return abc;
    }

    public void setAbc(Abc abc) {
        this.abc = abc;
    }

}
