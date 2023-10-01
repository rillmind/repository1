package pacote;

import java.awt.EventQueue;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Servidor {
  public static int pipi = 10;
  private DatagramSocket datagramSocket;
  private byte[] buffer = new byte[256];

  public Servidor (DatagramSocket datagramSocket) {
    this.datagramSocket = datagramSocket;
    }

    public void ServerMethod() {
        while (true) {
            try {

                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);
                InetAddress InetAddress = datagramPacket.getAddress();
                int port = datagramPacket.getPort(); 
                String messageFromClient = new String(datagramPacket.getData() , 0 , datagramPacket.getLength());

                String messageToSend = String.valueOf(JFGameTst1.getInstance().getJogador1());
                buffer = messageToSend.getBytes();
                datagramPacket = new DatagramPacket(buffer , buffer.length , InetAddress , port);
                datagramSocket.send(datagramPacket);
                JFGameTst1.getInstance().setJogador2(Integer.parseInt(messageFromClient));
                

                
            } catch(IOException e){
                e.printStackTrace();
                break;
                
            }
        }
    }
  


  public static void main(String[] args) throws SocketException {

   


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

    DatagramSocket datagramSocket = new DatagramSocket(1111);
    Servidor server = new Servidor(datagramSocket);
    server.ServerMethod();
  }
}
