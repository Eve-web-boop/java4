package POO;

public class Cliente<retornar>
{
	private String primeiroNome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public Cliente (String primeiroNome2, String sobrenome2, int Dia, int M�s, int Ano)
{
		this.primeiroNome=primeiroNome2;
		this.sobrenome=sobrenome2;
		this.dia=Dia;
		this.mes=M�s;
		this.ano=Ano;
		
	}
	
	void setNome (String Nome)
{
		this.primeiroNome=Nome;
	}
	
	String getNome ()
{
		return primeiroNome;
	}
	
	void setDia (int Dia)
{
			this.dia=Dia;
		}
		
		int getDia ()
{
			return dia;
		}

		void setM�s (int M�s)
{
					this.mes=M�s;
				}
				
				int getM�s ()
{
					return mes;
				}
				
				void setAno (int Ano)
{
							this.ano=Ano;
						}
						
						int getAno ()
{
							return ano;
						}
						
				void imprimir ()
{
					System.out.println("Cliente:"+primeiroNome+""+sobrenome+"\nData de marca��o da consulta"+dia+"/"+mes+"/"+ano);
				}
}
	
	