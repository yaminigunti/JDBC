package com.cts.CA.model;
import java.io.Serializable;
import java.time.LocalDate;
	
	@SuppressWarnings("serial")
	public class College implements Serializable /* implements Comparable<College> */ {

		private String cname;
		private String sname;
		private LocalDate joinDate;
		private double fee;

		public College() {
			/* default constructor */
		}

		public College(String cname, String sname, LocalDate joinDate, double fee) {
			super();
			this.cname =cname ;
			this.sname = sname;
			this.joinDate = joinDate;
			this.fee = fee;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public LocalDate getJoinDate() {
			return joinDate;
		}

		public void setJoinDate(LocalDate joinDate) {
			this.joinDate = joinDate;
		}

		public double getFee() {
			return fee;
		}

		public void setFee(double fee) {
			this.fee = fee;
		}

		@Override
		public String toString() {
			StringBuilder output = new StringBuilder("Cname : ");
			output.append(cname);
			output.append("\tSname : ");
			output.append(sname);
			output.append("\tJoin Date :");
			output.append(joinDate);
			output.append("\tFee : ");
			output.append(fee);
			return output.toString();
		}
		
}
