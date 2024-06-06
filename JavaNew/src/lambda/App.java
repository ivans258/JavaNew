package lambda;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lambda lambdaEjecutor = new Lambda() {
			
			@Override
			public void ejecutar() {
				// TODO Auto-generated method stub
				System.out.println("App.main(...).new Lambda() {...}.ejecutar()");
			}
		};
		
		
		Lambda lamnbdaEjecutorV1 = ()->{
			System.out.println("App.main() -> desde lambda ");
		};
		
	}

}
