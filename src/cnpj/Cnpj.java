package cnpj;

import java.net.URL;
import java.net.*;
import java.io.*;

public class Cnpj {

    public static void main(String[] args) throws Exception {
       
        URL test = new URL("http://receitaws.com.br/v1/cnpj/08004349000103");
        URLConnection yc = test.openConnection();
        String linha = "";

        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));


        linha = in.readLine();
        while (linha != null) {
        System.out.println(linha);
        linha = in.readLine();
        }

        in.close();

    }
    
}


/*
import java.net.URL;
import java.net.*;
import java.io.*;

public class Main {
public static void main(String[]args) throws Exception {
URL test = new URL("http://receitaws.com.br/v1/cnpj/23629677000199");
URLConnection yc = test.openConnection();
String linha = "";

BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));


linha = in.readLine();
while (linha != null) {
System.out.println(linha);
linha = in.readLine();
}

in.close();

}
}
*/