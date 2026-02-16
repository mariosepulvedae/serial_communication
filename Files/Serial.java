import java.io.IOException;
import java.net.http.*;
import com.fazecast.jSerialComm.SerialPort;
import java.io.InputStream;

public class Serial{
    public static void main(String[] args){
        System.out.println("Hellooou");

        SerialPort serial = SerialPort.getCommPorts()[0];

        InputStream comPortA ;
        int readAscii;

        try{

        }catch(IOException ex){
            System.out.println("Error opening the serial port: "+ex.getMessage());
        }


    }
}