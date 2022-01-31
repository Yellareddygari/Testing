package org.college;

public class Dept extends Hostel {
	public void dptName() {
		System.out.println("DPT:CSC");
		
	}
	
    public static void main(String[] args) {
	Dept s=new Dept();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.stName();
	s.stId();
	s.stDpt();
	s.hstName();
	s.dptName();
}
}
