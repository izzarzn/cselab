import java.net.*;
public class UDPC {
public static void main(String[] args) {
  } }
DatagramSocket skt; try
{
skt=new DatagramSocket(); String msg= "text message "; byte[] b = msg.getBytes();
InetAddress host=InetAddress.getByName("127.0.0.1"); int serverSocket=6788;
DatagramPacket request =new DatagramPacket(b,b.length,host,serverSocket); skt.send(request);
byte[] buffer =new byte[1000];
DatagramPacket reply= new DatagramPacket(buffer,buffer.length); skt.receive(reply);
System.out.println("client received:" +new String(reply.getData())); skt.close();
}
catch(Exception ex) {}
} }

// Server Program

import java.util.Scanner; import java.net.*;
public class UDPS {
public static void main(String[] args) {
DatagramSocket skt=null; String ch;
Scanner input=new Scanner(System.in); try
{
skt=new DatagramSocket(6788); byte[] buffer = new byte[1000]; while(true)
{
DatagramPacket request = new DatagramPacket(buffer,buffer.length); skt.receive(request);
System.out.print("enter the data"); ch=input.nextLine();
byte[] sendMsg= (ch+ " server processed").getBytes(); DatagramPacket reply = new DatagramPacket(sendMsg,sendMsg.length,request.getAddress (),request.getPort());
skt.send(reply);
} }
catch(Exception ex) {}
 } }