package airtel_jio_recharge;

public class Airtel {

	
		protected int datapack1 = 499;
		public int datapack2 =699;
		int voicepack1=99;
		int voicepack2=149;
		protected void combopack1() {
			int combo1 = datapack1+voicepack1;
			System.out.println("Recharged with:"+combo1);
		}
        public void combopack2() {
        	int combo2 = datapack2+voicepack2;
        	System.out.println("Recharged with:"+combo2);
        }
	}


