package Service;

import jakarta.jws.*;

@WebService(name = "CalculWS")
public class CalculatriceWS {
     @WebMethod(operationName="Somme")
     public double somme (@WebParam(name="val1") int val1, @WebParam(name="val2") int val2)
     {
          return val1 + val2;
          }

 }
