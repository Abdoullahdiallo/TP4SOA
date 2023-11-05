package server;

import Service.CalculatriceWS;
import jakarta.xml.ws.Endpoint;

public class ServeuJWS {
    public static void main(String[] args) {
        String URL="http://localhost:8084/";

        CalculatriceWS C1 = new CalculatriceWS();
        Endpoint.publish(URL, C1);
        System.out.println(URL);
    }

}
