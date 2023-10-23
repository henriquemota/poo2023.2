public class Main extends Thread {
	
	String nome = "";
	
	public Main(String nome) {
		this.nome = nome;
	}
  
  public static void main(String[] args) {
    Main thread1 = new Main("Thread 1");
    Main thread2 = new Main("Thread 2");
    
    //thread1.execute();
    //thread2.execute();
    
    thread1.start();
    thread2.start();
    System.out.println("Código rodando fora da thread");
  }
  
  public void execute() {
	  for(int i = 1; i<10; i++) {
  		System.out.println(this.nome + " - " + i);  
	  }
  }
  
  public void run() {		  
	  for(int i = 1; i<10; i++) {
			try {
				if (this.nome == "Thread 1")
					this.sleep(1000);
				else 
					this.sleep(500);
			} catch (Exception e) {
				System.out.print("Uma excecao foi lancada");
			}
	  		System.out.println(this.nome + " - " + i);  
	  }
  }

}