package adm.inheritance;

public class InheritanceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Animal();
		ani.whoAmI();
		ani = new dog();
		ani.whoAmI();
		ani = new snake();
		ani.whoAmI();
	}
}
	
	class Animal {
		public void whoAmI() {
			System.out.println("I am an Animal");
		}
	}
	
	class dog extends Animal {
		public void whoAmI() {
			System.out.println("I am a Dog");
		}
	}
	
	class cow extends Animal {
		public void whoAmI() {
			System.out.println("I am a cow");
		}
	}
	
	class snake extends Animal {
		public void whoAmI() {
			System.out.println("I am a Snake");
		}
	}

