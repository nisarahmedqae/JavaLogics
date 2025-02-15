package naveenautomationlabs.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // for getter and setter
@Getter
@Setter
public class CustomerData {

	private String name;
	private int age;
	private double percentage;
	private boolean isActive;
}
