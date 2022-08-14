package Ejercicios;

public class User {
	private int id;
	private String name;
	private String email;
	private int posi;
	
	public User() {
		
	}
	
	public User(int pId, String pName, String pEmail) {
		id = pId;
		name = pName;
		email = pEmail;
	}
		
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = id;
	    result = prime * result + ((email == null) ? 0 : email.hashCode());
	    result = prime * result + (int) (id ^ (id >>> 32));
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    if(result<0) {
	    	result=result*-1;
	    }
	    return result;
	}
	public void setPosi(int K) {
		posi=K;
	}
	public int getPosi() {
		return posi;
	}
	public String getKey() {
		return name;
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
}
