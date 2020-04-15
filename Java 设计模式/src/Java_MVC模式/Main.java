package Java_MVCģʽ;

class Employee{
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}	
}

class EmployeeView{
	public void printEmployeeDetails(String name, String no) {
		System.out.println("Employee: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + no);
	}
}

class EmployeeController {
	  private Employee model;
	  private EmployeeView view;

	  public EmployeeController(Employee model, EmployeeView view) {
	    this.model = model;
	    this.view = view;
	  }

	  public void setEmployeeName(String name) {
	    model.setName(name);
	  }

	  public String getEmployeeName() {
	    return model.getName();
	  }

	  public void setEmployeeId(String rollNo) {
	    model.setId(rollNo);
	  }

	  public String getEmployeeId() {
	    return model.getId();
	  }

	  public void updateView() {
	    view.printEmployeeDetails(model.getName(), model.getId());
	  }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee model = new Employee();
		model.setName("lenhart");
		model.setId("1");
		EmployeeView view = new EmployeeView();
		
		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView();
		controller.setEmployeeName("tom");
		controller.updateView();
	}

}
