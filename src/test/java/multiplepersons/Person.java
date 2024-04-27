
package multiplepersons;

import java.util.List;

public class Person {

    private String email;
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
    private List<Long> mobileNumber = null;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public List<Long> getMobileNumber() {
//        return mobileNumber;
//    }

	/*
	 * // public void setMobileNumber(List<Long> mobileNumber) { //
	 * this.mobileNumber = mobileNumber; // }
	 */
}
