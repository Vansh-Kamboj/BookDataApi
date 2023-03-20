package com.text;

public class jsonob_creat {
		public int id;
		public String name;
		public String place;	
		public jsonob_creat(int id, String name, String place) {
			super();
			this.id = id;
			this.name = name;
			this.place = place;
		}
		public jsonob_creat() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlace() {
			return place;
		}
		

		public void setPlace(String place) {
			this.place = place;
		}	
		@Override
		public String toString() {
			return "jsonob_creat [id=" + id + ", name=" + name + ", place=" + place + "]";
		}

	

}
