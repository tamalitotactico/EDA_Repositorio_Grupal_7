package Ejercicios;

public class HashTable{
	User usuario[]=new User[10];
	int cant=0;
	public HashTable() {
	}
    public void put(User us) {
		int posi=us.hashCode()%usuario.length;
		if(usuario[posi]==null) {
			usuario[posi]=us;
			cant++;
			us.setPosi(posi);
			System.out.println("Se inserto un usuario nuevo.");
		}
		else {
			usuario[posi]=us;
			us.setPosi(posi);
			System.out.println("Se reemplazo un usuario previamente registrado.");
		}
    }
    
    public void remove(String key) {
    	boolean prueba=false;
    	for(int i=0;i<usuario.length;i++) {
    		if(usuario[i]!=null) {
    		if(usuario[i].getKey().equals(key)) {
    			usuario[i]=null;
    			cant--;
    			prueba=true;
    			System.out.println("Se elimino satisfactoriamente el usuario.");
    			break;
    		}
    		}
    	}
    	if(prueba=false) {
    		System.out.println("No se encontro algun usuario con esa key");
    	}
    }
    
    public void size() {
    	System.out.print("La cantidad de usuarios registrados es "+cant);
    }
    
    public boolean isEmpty() {
    	if(cant==0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public void get(String key) {
    	boolean inter=false;
    	for(int i=0;i<usuario.length;i++) {
    		if(usuario[i]!=null) {
    		if(usuario[i].getKey().equals(key)) {
    			System.out.println("La id del nombre ingresado es "+usuario[i].getid()+" y su email es "+usuario[i].getEmail());
    			inter=true;
    			break;
    		}
    		}
    	}
    	if(inter=false) {
    		System.out.println("No se encontro ninguna coincidencia con el nombre ingresado.");
    	}
    	
    }
    public void clear() {
    	for(int i=0;i<usuario.length;i++) {
    		usuario[i]=null;
    	}
    	System.out.println("Se elimino satisfactoriamente el registro de usuarios.");
    }

    public String toString() {
    	String text="";
    	for(int i=0;i<usuario.length;i++) {
    		if(usuario[i]!=null) {
    			text=text+usuario[i].getPosi()+")"+usuario[i].getName()+": id("+usuario[i].getid()+"), email("+usuario[i].getEmail()+")\n";
    		}
    	}
    	return text;
    }
    public int hashCode() {
    	int hash=0;
    	for(int i=0;i<usuario.length;i++) {
    		if(usuario[i]!=null) {
    			hash=hash+usuario[i].hashCode();
    		}
    	}
    	return hash;
    }

    public boolean containsKey(String key) {
    	boolean contains=false;
    	for(int i=0;i<usuario.length;i++) {
    		if(usuario[i]!=null) {
    			if(usuario[i].getKey()==key) {
    				contains=true;
    				break;
    			}
    		}
    	}
    	return contains;
    }
   public boolean containsValue(int id) {
	   boolean contains=false;
		for(int i=0;i<usuario.length;i++) {
			if(usuario[i]!=null) {
				if(usuario[i].getid()==id) {
					contains=true;
					break;
				}
			}
		}
		return contains;
   }
 

}
