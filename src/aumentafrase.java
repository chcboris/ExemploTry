//https://www.devmedia.com.br/tratando-excecoes-em-java/25514

public class aumentafrase {

// -----------------------------------------------------------------------------------------------------	
//	tentativa com erro, vai levantar uma exce��o
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
// vai tratar exce��o 
//	
//	public static void main(String args[])
//	{
//	  String frase = null;
//	  String novaFrase = null;
//	  try
//	  {
//	    novaFrase = frase.toUpperCase();
//	  }
//	  catch(NullPointerException e) //CAPTURA DA POSS�VEL exce��o.
//	  {
//	    //TRATAMENTO DA exce��o
//	    System.out.println("O frase inicial est� nula,para solucionar tal o problema, foi lhe atribuito um valor default.");
//	    frase = "Frase vazia";
//	    novaFrase = frase.toUpperCase();
//	  }
//	  System.out.println("Frase antiga: "+frase);
//	  System.out.println("Frase nova: "+novaFrase);
//	}

// -----------------------------------------------------------------------------------------------------
// Uso da cla�sula FINALLY
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
//	      System.out.println("O frase inicial est� nula, para solucionar tal o problema, foi lhe atribuito um valor default.");
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
//	Exec��o tratada em outra parte do c�digo, utilizamos o comando THROWS na assinatura do m�todo com a poss�vel exce��o que o mesmo poder� a vir lan�ar
	
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
//	      System.out.println("Ocorreu um NullPointerException ao executar o m�todo aumentarLetras() "+e);
//	    }
//	  }		

// -----------------------------------------------------------------------------------------------------		
//  Lan�ando uma exce��o padr�o a partir de uma exce��o especifica, utilizamos o comando THROW dentro do bloco catch que desejamos converter a exce��o.
	
//	private static void aumentarLetras() throws Exception //lan�ando exce��o
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
//	      System.out.println("Ocorreu uma exce�o ao executar o m�todo aumentarLetras() "+e);
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
