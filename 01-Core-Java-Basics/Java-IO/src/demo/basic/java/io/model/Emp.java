package demo.basic.java.io.model;

import java.io.Serializable;

public class Emp implements Serializable {
	int empno;
	String ename;
	float sal;

	// above data members (step-4)
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSal(float sal) {
		this.sal = sal;
	} // above set methods (step-5)

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public float getSal() {
		return sal;
	} // above get methods (step-6)
}
