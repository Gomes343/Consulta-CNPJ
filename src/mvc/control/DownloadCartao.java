package mvc.control;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DownloadCartao{
   
    public int baixarCartao(String CNPJ){
        String link = "http://receitaws.com.br/v1/cnpj/";
        
        if(CNPJ.length() < 14){
            System.out.println("(!) ERRO (!) CNPJ Inferior ao desejado");
            return 0;
        }
        else
            link = link.concat(CNPJ);
       
        try{URL url = new URL(link);
        
        URLConnection connection = url.openConnection(); // realizando a conexão com a URL
        InputStream stream = connection.getInputStream();// leitura do fluxo de dados da fonte
        
        BufferedInputStream in = new BufferedInputStream(stream); //passando os dados lidos para o buffer
        
        FileOutputStream file = new FileOutputStream("CartaoCNPJ.json"); //arquivo output
        BufferedOutputStream out = new BufferedOutputStream(file); //pasasndo o buff no Output
       
        int i;
        while((i = in.read()) != -1){
            out.write(i);
        }
        out.flush();
        
        } catch (MalformedURLException ex) {
            System.out.println("URL MALFORMADA");
            Logger.getLogger(DownloadCartao.class.getName()).log(Level.SEVERE, null, ex);
            return 2;
        } catch (IOException ex) {
            System.out.println("ERRO DE CONEXAO?");
            Logger.getLogger(DownloadCartao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Arquivo CartaoCNPJ.json baixado!");
  
        return true;
    }
}