package collection.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpApp {
	public EmpApp() {
	}
	
	public String addEmp(Emp e)
	{
		if(EmpDb.db.containsKey(e.getEmpId()))
		{
			return "Employee already exits";
		}
		else
		{
			EmpDb.db.put(e.getEmpId(), e);
			return "Employee added";
		}
	}
	
	public String findEmp(int empId) throws EmpNotFoundException{
		try {

		if (EmpDb.db.containsKey(empId)) {
			return EmpDb.db.get(empId).getDetails();
		} else {
			throw new EmpNotFoundException("Employee Not found");
		}
		}catch (EmpNotFoundException ee) {
			throw ee;
		}
	
		}

	public String deleteEmp(int empId)throws EmpNotFoundException
	{
		try {
		if(EmpDb.db.containsKey(empId))
		{
			EmpDb.db.remove(empId);
			return "Employee is Deleted";
		}
		else 
		{
			throw new EmpNotFoundException("Employee Not found");
		}
		}catch (EmpNotFoundException ee) {
			throw ee;
		}
	}
	
	public List<String> listEmpByCity(String cityName) {

		List<String> emp = new ArrayList<String>();
		
		Set<Integer> keys = EmpDb.db.keySet();
		
		for (Integer key : keys) {
			Emp e = EmpDb.db.get(key);
			if (e.getCity().equals(cityName))
				emp.add(e.getDetails());
		}

		return emp;
	}

}
