package healthculb;

public class Member {
		
		private String Name; 
		private String Phone; 
		private String Sex; 
		private String regDate;
		
		
		public String getName() {
			return Name;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
		public String getPhone() {
			return Phone;
		}
		public void setPhone(String Phone) {
			this.Phone = Phone;
		}
		public String getSex() {
			return Sex;
		}
		public void setSex(String Sex) {
			this.Sex = Sex;
		}
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		@Override
		public String toString() {
			return "NAME : " + Name + " PHONE : " + Phone + "Sex : " + Sex;
		}
	}