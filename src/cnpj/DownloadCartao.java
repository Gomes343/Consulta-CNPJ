package cnpj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DownloadCartao{
    public static void main(String[]args) throws IOException{   
        Scanner sc = new Scanner(System.in);
        String link = "http://receitaws.com.br/v1/cnpj/", CNPJ, linha = "";
        
        System.out.println("Insira o CNPJ que gostaria de baixar: (14 digitos)");
        CNPJ = sc.nextLine();
        link = link.concat(CNPJ);
        
        //arquivos InputStream ou OutputStream funcionam igual a Reader e Writer
        URL url = new URL(link);
        
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
        System.out.println("Arquivo CartaoCNPJ.json baixado!");
    }
}
