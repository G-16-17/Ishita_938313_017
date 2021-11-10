package adm.inheritance;

public class BasicCalc {

		private int o1;
		private int o2;
		
		public int geto1() {
			return o1;
		}
		public void seto1(int o1) {
			this.o1 = o1;
		}
		public int geto2() {
			return o2;
		}
		public void seto2(int o2) {
			this.o2 = o2;
		}
		
		public int add() {
			return o1+o2;
		}
		
		public int product() {
			return o1*o2;
		}
		
		@Override
		public String toString() {
			//String.format(format,args);
			
			String str = String.format("%-10s:%-10s",o1,o2);
			return str;
		}
		

}
