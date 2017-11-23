package cnpj;

import java.net.URL;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String CNPJ, link = "http://receitaws.com.br/v1/cnpj/", linha = "";
        
        System.out.println("Insira o CNPJ que gostaria de consultar: (14 digitos)");
        CNPJ = sc.nextLine();
        
        link = link.concat(CNPJ);
        URL url = new URL(link);
        URLConnection yc = url.openConnection();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        
        linha = in.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = in.readLine();
        }
        in.close();
    }
}
