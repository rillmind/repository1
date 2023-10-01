package pacote;

import java.awt.EventQueue;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {
  public static int pipi = 10;
  private DatagramSocket datagramSocket;
  private InetAddress inetAddress;
  private byte[] buffer;
  
  public Cliente(DatagramSocket datagramSocket, InetAddress inetAddress){
      this.datagramSocket = datagramSocket;
      this.inetAddress = inetAddress;


  }

  public void ClientMethod(){
    while(true){
        try{
          String messageToSend = String.valueOf(JFGameTst1.getInstance().getJogador1());
            buffer = messageToSend.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(buffer , buffer.length , inetAddress , 1111);
            String messageFromClient = new String(datagramPacket.getData(), 0 , datagramPacket.getLength());

            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacket);
            JFGameTst1.getInstance().setJogador2(Integer.parseInt(messageFromClient));;

        } catch(IOException e){
            e.printStackTrace();
            break;

        }
    }
}
    public static void main(String[] args)throws SocketException, UnknownHostException{
     
      EventQueue.invokeLater(new Runnable() {
        public void run() {
          try {
            JFGameTst1 frame = new JFGameTst1(pipi);
            frame.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });

        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName("localhost");
        Cliente client = new Cliente(datagramSocket, inetAddress);
        client.ClientMethod();

    }
    
}

