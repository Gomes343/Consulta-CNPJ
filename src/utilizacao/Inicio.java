package utilizacao;

import utilizacao.jsontt.JSONObject;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import cnpj.ControllerTeste;
import java.util.ArrayList;
import utilizacao.jsontt.JSONArray;



public class Inicio {
    public static void main(String[]args) throws IOException, FileNotFoundException, ParseException{
    
        ControllerTeste t = new ControllerTeste(); //Inicio Arquivo central Controller
        String arquivo = t.Baixar(); //Pegando o String convertido pelo parse do arquivo

        JSONObject json = new JSONObject(arquivo); //definindo o String como o qual será buscado
        

        //String total
        System.out.println(arquivo);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Definindo Arrays para as Atividades Secundárias!

        
        //Pegando as informações
        //Inicio Pegar Atividade Principal
        JSONArray AcharArray1 = json.getJSONArray("atividade_principal");//Achar o Array que quer      
        JSONObject Array1 = AcharArray1.getJSONObject(0);//transformando o Array em um object

        //Inicio Pegar Atividades Secundarias
        
        //ArrayList<JSONArray> AcharArrays = new ArrayList();
        ArrayList<String> AtividadesSecundarias = new ArrayList();
        ArrayList<String> CodigoAtivSec = new ArrayList();
        
        
        JSONArray qt_atv_sec = json.getJSONArray("atividades_secundarias");
        
        
        for(int i = 0;i < qt_atv_sec.length(); i++){
            
            //JSONArray AcharArray = qt_atv_sec.getJSONArray(i);
            JSONObject Array = qt_atv_sec.getJSONObject(i);
            AtividadesSecundarias.add((String) Array.get("text"));
            CodigoAtivSec.add((String) Array.get("code"));
            
        }
        
        
        //JSONArray[] AcharArray = json.getJSONArray("atividade_principal");//Achar o Array que quer      
        //JSONObject Arrays[] = AcharArray1.getJSONObject(0);//transformando o Array em um object
        
        //ArrayList<JSONArray> AcharArrays = new ArrayList();
        
        
        
        String nome = (String) json.get("nome");        
        String AtividadePrincipal = (String) Array1.get("text");//Pega as coisas normalmente!
        String CodigoAtivPrinc = (String) Array1.get("code");
        
        
        System.out.println("Descrição Atividade Principal: "+AtividadePrincipal+"\n"
                + "Código Atividade Principal: "+CodigoAtivPrinc);

        
        System.out.println("Descrição Atividade Secundaria: "+AtividadesSecundarias.get(0)+ "\n"
                + "Código Atividades Secundárias: "+CodigoAtivSec.get(0));
        
        /*
        String array1 = catch1.toString();
        JSONArray chose1 = new JSONArray(array1);
        JSONObject test = chose1.getJSONObject(0);
        String test1 = test.toString();
        System.out.println(test1);
        JSONObject cacete = new JSONObject(test1);
        String text = (String) cacete.get("text");
        */
        
        
        System.out.println(nome);
    
    
    }
}
