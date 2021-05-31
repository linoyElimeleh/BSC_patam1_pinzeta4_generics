package test;


public class GenericFactory<Product> {
	
	private interface Creator<_______>{
		public _______ create(); // no unhandled exceptions
	}
	
	Map<String,_____________> map;
	
	public GenericFactory(){
		map=new __________<>();
	}
	
	public void insertProduct(String key, Class<__________> c) {
	}	
	
	public Product getNewProduct(String key){
		return null;
	}
}
