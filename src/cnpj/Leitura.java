package cnpj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {

	public static void main(String[] args) {

		JSONObject jsonObject;
		//Cria o parse de tratamento
		JSONParser parser = new JSONParser();
		//Variaveis que irao armazenar os dados do arquivo JSON
		String nome;
		String situacao;
		String uf;
		String municipio;

		try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader("cartaocnpj.json"));
			
			//Salva nas variaveis os dados retirados do arquivo
			nome = (String) jsonObject.get("nome");
			situacao = (String) jsonObject.get("situacao");
			uf = (String) jsonObject.get("uf");
			municipio = (String) jsonObject.get("municipio");

			System.out.printf("Nome: %s \n"
                                + "Sobrenome: %s\nEstado: %s\nPais: %s\n",
					nome, situacao, uf, municipio);
		} 
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}