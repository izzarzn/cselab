import java.net.*;
import java.io.*;

public class Lserver {
        public static void main(String args[])throws Exception 
        {
            try
            {
                ServerSocket sersock=new ServerSocket(4000);
                System.out.println("Server ready for connection");
                Socket sock= sersock.accept();
                System.out.println("Connection is successful and waitig for chatting");
                InputStream istream=sock.getInputStream();
                BufferedReader fileRead=new BufferedReader(new InputStreamReader(istream));
                String fname=fileRead.readLine();
                BufferedReader ContentRead=new BufferedReader(new FileReader(fname));
                OutputStream ostream=sock.getOutputStream();
                PrintWriter pwrite=new PrintWriter(ostream,true);
                String str;
                while((str=ContentRead.readLine())!=null)
                {
                pwrite.println(str); 
                }
                sock.close();
                sersock.close();
                pwrite.close();
                fileRead.close();
                ContentRead.close();
                
                
            }
            catch(Exception e)
                    {
                        System.out.println("An error occured while opening the file");
                    }
            
             
        }

}

// Client Program

import java.net.*;
import java.io.*;

public class Lclient {
    public static void main(String args[])throws Exception {
        Socket sock=new Socket("127.0.0.1",4000);
        System.out.println("Enter the file name");
        BufferedReader KeyRead=new BufferedReader (new InputStreamReader(System.in));
        String fname=KeyRead.readLine();
        
        try 
        {
            OutputStream ostream=sock.getOutputStream();
            PrintWriter pwrite=new PrintWriter(ostream,true);
            pwrite.println(fname);
            InputStream istream=sock.getInputStream();
            BufferedReader SocketRead=new BufferedReader (new InputStreamReader(istream));
            String str;
            while((str=SocketRead.readLine())!=null)
            {
               System.out.println(str); 
            }
            pwrite.close();
            SocketRead.close();
            KeyRead.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occured while opening the file");
            
        }
    }
}