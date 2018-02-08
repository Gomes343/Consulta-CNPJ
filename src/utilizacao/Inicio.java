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

        System.out.println(arquivo);    //String total

        System.out.println("------------------------------------------");
        System.out.println("");

        
        //Definindo Arrays para as Atividades!
       
        //Pegando as informações
        //Pegar Atividade Principal
        JSONArray AcharArray1 = json.getJSONArray("atividade_principal");//Achar o Array que quer      
        JSONObject Array1 = AcharArray1.getJSONObject(0);//transformando o Array em um object

        //Pegar Atividades Secundarias - criando os ArrayList que vão armazenar
        ArrayList<String> AtividadesSecundarias = new ArrayList();
        ArrayList<String> CodigoAtivSec = new ArrayList();
        //\/Variavel JSONArray que armazena todas as atividades\/
        JSONArray qt_atv_sec = json.getJSONArray("atividades_secundarias");
        
        //Passando o JSONArray para os ArrayList String armazenadores
        for(int i = 0;i < qt_atv_sec.length(); i++){
            
            JSONObject Array = qt_atv_sec.getJSONObject(i);
            AtividadesSecundarias.add((String) Array.get("text"));
            CodigoAtivSec.add((String) Array.get("code"));
            
        }
    
        
        
        
        String nome = (String) json.get("nome");  
        String fantasia = (String) json.get("fantasia");
        String cnpj = (String) json.get("cnpj");
        String abertura = (String) json.get("abertura");
        String AtividadePrincipal = (String) Array1.get("text");//Pega as coisas normalmente!
        String CodigoAtivPrinc = (String) Array1.get("code");
        String natureza = (String) json.get("natureza_juridica");
        String rua = (String) json.get("logradouro");
        String numero = (String) json.get("numero");
        String bairro = (String) json.get("bairro");
        String cidade = (String) json.get("municipio");
        String estado = (String) json.get("uf");
        String cep = (String) json.get("cep");
        String email = (String) json.get("email");
        String telefone = (String) json.get("telefone");
        String situacao = (String) json.get("situacao");
        String atualizacao = (String) json.get("ultima_atualizacao");
        
        
        
        
        
        
        
        //IMPRIMINDO OS DADOS  
        System.out.println("CNPJ: "+cnpj+"   Data de Abertura: "+abertura+"\n"
                        +   "Nome Empresarial: "+nome+"\n"
                        +   "Nome Fantasia: "+fantasia+"\n"
                        +   "Descrição Atividade Principal: \n"
                        +   AtividadePrincipal+"\n"
                        +   "Código Atividade Principal: "+CodigoAtivPrinc+"\n");

        for(int i = 0 ; i <+ AtividadesSecundarias.size() ; i++){
        System.out.println("Descrição Atividade Secundaria: "+AtividadesSecundarias.get(i)+ "\n"
                + "Código Atividades Secundárias: "+CodigoAtivSec.get(i)
                + "\n");
        }
        System.out.println("Endereço: \n"
                        +   "Rua: "+rua+" Número: "+numero+"\n"
                        +   "Bairro: "+bairro+" Cidade: "+cidade+"-"+estado+"\n"
                        +   "E-mail para Contato: "+email+"\n"
                        +   "Telefone para Contato: "+telefone+"\n"
                        +   "\n"
                        +   "Situação: "+situacao+" Atualização em: "+atualizacao);

        
        /*
        String array1 = catch1.toString();
        JSONArray chose1 = new JSONArray(array1);
        JSONObject test = chose1.getJSONObject(0);
        String test1 = test.toString();
        System.out.println(test1);
        JSONObject cacete = new JSONObject(test1);
        String text = (String) cacete.get("text");
        */
        
  
    }
}
