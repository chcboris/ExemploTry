//https://www.devmedia.com.br/tratando-excecoes-em-java/25514

public class aumentafrase {

// -----------------------------------------------------------------------------------------------------	
//	tentativa com erro, vai levantar uma exceção
//
//	public static void main(String args[])
//	{
//	    String frase = null;
//	    String novaFrase = null;
//	    novaFrase = frase.toUpperCase();
//	    System.out.println("Frase antiga: "+frase);
//	    System.out.println("Frase nova: "+novaFrase);
//	}

// -----------------------------------------------------------------------------------------------------	
// vai tratar exceção 
//	
//	public static void main(String args[])
//	{
//	  String frase = null;
//	  String novaFrase = null;
//	  try
//	  {
//	    novaFrase = frase.toUpperCase();
//	  }
//	  catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
//	  {
//	    //TRATAMENTO DA exceção
//	    System.out.println("O frase inicial está nula,para solucionar tal o problema, foi lhe atribuito um valor default.");
//	    frase = "Frase vazia";
//	    novaFrase = frase.toUpperCase();
//	  }
//	  System.out.println("Frase antiga: "+frase);
//	  System.out.println("Frase nova: "+novaFrase);
//	}

// -----------------------------------------------------------------------------------------------------
// Uso da claúsula FINALLY
//
//	public static void main(String args[])
//	  {
//	    String frase = null;
//	    String novaFrase = null;
//	    try
//	    {
//	      novaFrase = frase.toUpperCase();
//	    }
//	    catch(NullPointerException e)
//	    {
//	      System.out.println("O frase inicial está nula, para solucionar tal o problema, foi lhe atribuito um valor default.");
//	      frase = "Frase vazia";
//	      System.out.println(" ########### passou pelo catch ########### ");
//	    }
//	    finally
//	    {
//	      novaFrase = frase.toUpperCase();
//	      System.out.println(" ########### passou pelo finally ########### ");
//	    }
//	    System.out.println("Frase antiga: "+frase);
//	    System.out.println("Frase nova: "+novaFrase);
//	  }	

// -----------------------------------------------------------------------------------------------------		
//	Execção tratada em outra parte do código, utilizamos o comando THROWS na assinatura do método com a possível exceção que o mesmo poderá a vir lançar
	
//	  private static void aumentarLetras() throws NullPointerException 
//	  {
//	    String frase = null;
//	    String novaFrase = null;
//	    novaFrase = frase.toUpperCase();
//	    System.out.println("Frase antiga: "+frase);
//	    System.out.println("Frase nova: "+novaFrase);
//	  }
//
//	  public static void main(String args[])
//	  {
//	    try
//	    {
//	      aumentarLetras();
//	    }
//	    catch(NullPointerException e)
//	    {
//	      System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() "+e);
//	    }
//	  }		

// -----------------------------------------------------------------------------------------------------		
//  Lançando uma exceção padrão a partir de uma exceção especifica, utilizamos o comando THROW dentro do bloco catch que desejamos converter a exceção.
	
//	private static void aumentarLetras() throws Exception //lançando exceção
//	  {
//	    String frase = null;
//	    String novaFrase = null;
//	    try
//	    {
//	      novaFrase = frase.toUpperCase();
//	    }
//	    catch(NullPointerException e)
//	    {
//	      throw new Exception(e);
//	    }
//	    System.out.println("Frase antiga: "+frase);
//	    System.out.println("Frase nova: "+novaFrase);
//	  }
//	  public static void main(String args[])
//	  {
//	    try
//	    {
//	      aumentarLetras();
//	    }
//	    catch(Exception e)
//	    {
//	      System.out.println("Ocorreu uma exceão ao executar o método aumentarLetras() "+e);
//	    }
//	  }	

	
// -----------------------------------------------------------------------------------------------------
// Criando uma exception, neste exemplo foi definida uma mensagem especifica
	
	  public static void main(String args[]) throws SemLetraBException
	  {
	    String frase = "Sou um teste!";
	    if(!frase.contains("b") || !frase.contains("B"))
	    throw new SemLetraBException();
	  }

	
	
}
