package cnpj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{

        JSONParser parser = new JSONParser(); //Variaveis que irao armazenar os dados do arquivo JSON
        JSONParser borracha = new JSONParser();
        String nome;
	String situacao;
	String uf;
	String municipio;
        String teste1 = null;

	//Salva no oabjeto JSONObject o que o parse tratou do arquivo
        JSONObject obj = (JSONObject) parser.parse(new FileReader("cartaocnpj.json"));
 
        JSONObject jsonObject = (JSONObject) obj;

			
	//Salva nas variaveis os dados retirados do arquivo
	nome =      (String) jsonObject.get("nome");
	situacao =  (String) jsonObject.get("situacao");
	uf =        (String) jsonObject.get("uf");
	municipio = (String) jsonObject.get("municipio");

	System.out.printf("Nome: %s \n"
                        + "Situação: %s\n"
                        + "Estado: %s\n"
                        + "Cidade: %s\n",nome, situacao, uf, municipio);
    } 
}
