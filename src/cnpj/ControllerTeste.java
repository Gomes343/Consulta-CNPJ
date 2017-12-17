
package cnpj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ControllerTeste {
   
    public String Baixar() throws FileNotFoundException, IOException, ParseException{
        
        JSONParser parser = new JSONParser(); //Variaveis que irao armazenar os dados do arquivo JSON

	//Salva no oabjeto JSONObject o que o parse tratou do arquivo
        JSONObject obj = (JSONObject) parser.parse(new FileReader("cartaocnpj.json"));
 
        String retorno = obj.toString();
        
        return retorno;
    }
}
