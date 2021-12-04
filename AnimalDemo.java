class Animal{
    static int count;
    String name;
    
    void setName(String name){
         this.name = name;
    }

    String getName(){
    	return name;
    }

    static void updateCount(){
    	count++;
    	System.out.println(count);
    }
}



class AnimalDemo{
	public static void main(String[] args){
          Animal cat = new Animal();
          cat.setName("puffy");
          System.out.println(cat.getName());
          cat.updateCount();

           Animal dog = new Animal();
          dog.setName("pluto");
          System.out.println(dog.getName());
          dog.updateCount();
	}
}