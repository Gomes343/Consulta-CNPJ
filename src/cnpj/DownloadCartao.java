package cnpj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadCartao {
    public static void main(String[]args) throws IOException{   
        
        //arquivos InputStream ou OutputStream funcionam igual a Reader e Writer
        URL url = new URL("http://receitaws.com.br/v1/cnpj/23629677000199"); // LINK
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
    }
}
