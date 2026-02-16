import java.io.IOException;
import java.net.http.*;
import com.fazecast.jSerialComm.SerialPort;
import java.io.InputStream;

public class Serial{
    public static void main(String[] args){
        System.out.println("Hellooou");

        SerialPort serial = SerialPort.getCommPorts()[0];

        InputStream message;
        int readAscii;

        try{
            System.out.println("Opening port: "+serial.getSystemPortName());
            serial.openPort();
            message = serial.getInputStream();
            do{
                readAscii = message.read();
                System.out.print((char) readAscii);
            }while(readAscii!=10);
            serial.closePort();

        }catch(IOException ex){
            System.out.println("Error opening the serial port: "+ex.getMessage());
        }


    }
}