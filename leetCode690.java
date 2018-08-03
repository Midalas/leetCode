
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetCode690 {

	public static void main(String[] args) throws Exception {
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(2);
		temp1.add(3);
		Employee e1 = new Employee();
		e1.id = 1;
		e1.importance = 5;
		e1.subordinates = temp1;

		Employee e2 = new Employee();
		e2.id = 2;
		e2.importance = 3;
		e2.subordinates = new ArrayList<Integer>();

		Employee e3 = new Employee();
		e3.id = 3;
		e3.importance = 3;
		e3.subordinates = new ArrayList<Integer>();

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		int id = 1;

		int x = getImportance(employees, id);

		System.out.println();
	}

	// runtime 39ms
	public static int getImportance(List<Employee> employees, int id) {
		int res = 0;
		for (Employee e : employees) {
			if (e.id == id) {
				res += e.importance;
				for (Integer t : e.subordinates)
					res += getImportance(employees, t);
			}
		}
		return res;
	}

	// fastest solution runtime 9ms
	HashMap<Integer, Employee> map;

	public int getImportance1(List<Employee> employees, int id) {
		map = new HashMap<>();
		for (Employee e : employees)
			map.put(e.id, e);
		return helper(map.get(id));

	}

	public int helper(Employee em) {
		int res = em.importance;
		for (int sub : em.subordinates) {
			res += helper(map.get(sub));

		}
		return res;

	}

}
