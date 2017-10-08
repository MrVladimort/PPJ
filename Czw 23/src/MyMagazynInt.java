
public interface MyMagazynInt {
	
	public void przyjmijKontener(Kontener k) throws MyMagazynFullEx;

	public Kontener wydajKontener() throws MyMagazynEmptyEx;

}
