package test;
import dao.*;





public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CandidatImpl service = new CandidatImpl() ;
		
		System.out.println(service.getCandidatById(1L).toString());
		

	}

}
