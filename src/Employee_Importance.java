import java.util.*;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class Employee_Importance {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.importance = 5;
        List<Integer> subordinates1 = new ArrayList<>();
        subordinates1.add(2);
//        subordinates1.add(3);
        emp1.subordinates = subordinates1;

        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.importance = 3;
        emp2.subordinates = new ArrayList<>();

        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.importance = 3;
        emp3.subordinates = new ArrayList<>();
        List<Employee> employees = new LinkedList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        int id = 1;
        System.out.println(getImportance(employees, id));
    }

    public static int getImportance(List<Employee> employees, int id) {
        int res = 0;
        HashMap<Integer, Employee> map = new HashMap<>();
        Iterator<Employee> iterator = employees.iterator();
        Stack<Integer> stack = new Stack<>();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            map.put(employee.id, employee);
            if (employee.id == id)
                res += employee.importance;
        }
        stack.addAll(map.get(id).subordinates);
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            res += map.get(tmp).importance;
            stack.addAll(map.get(tmp).subordinates);
        }
        return res;
    }
}
