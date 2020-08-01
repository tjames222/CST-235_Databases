package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	
	// Declaring Properties
	@NotNull()
	@Size(min=5, max=15)
	String firstName;
	
	@NotNull()
	@Size(min=5, max=15)
	String lastName;
	
	////////// Getter and setter for firstName
	public String getfirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstNameIn) {
		this.firstName = firstNameIn;
	}
	
	////////// Getter and setter for lastName
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastNameIn) {
		this.lastName = lastNameIn;
	}
	
	////////// Default constructor
	public User() {
		firstName = "Tim";
		lastName = "James";
	}

}
