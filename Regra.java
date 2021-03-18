import java.util.Date;
import java.text.SimpleDateFormat;


class Regra {

	String getMessage(){

		String mensagem;

		Date agora = new Date(); 
		SimpleDateFormat mascara = new SimpleDateFormat("H");

		String horastr = mascara.format(agora); 
		int hora = Integer.parseInt(horastr) - 3; 

		if (hora < 12)
  		mensagem = "NOVO BOM DIA world!";
		else if (hora > 18) 
			mensagem = "NOVO BOA NOITE world!";
		else
			mensagem = "NOVO BOA TARDE world!";

		return mensagem;
	}


}