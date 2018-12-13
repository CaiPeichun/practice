package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 员工表的实体类
 * @author caipch
 * @date 2018年12月13日
 */
@Entity
@Table(name="emp")
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="EMPNO")
	private Integer empno;
	@Column(name="ENAME")
	private String ename;
	@Column(name="JOB")
	private String job;
	/*@Column(name="MGR")
	private Integer mgr;
	@Column(name="HIREDATE")
	private Date hiredate;
	@Column(name="SAL")
	private Integer sal;
	@Column(name="COMM")
	private Integer comm;*/
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DEPTNO")
	private Dept dept;
	
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "员工 [员工编号=" + empno + ", 员工姓名=" + ename + ", 职位=" + job + ", 部门=" + dept.getDname() + "]";
	}
}
