/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest_git_ueubung2209;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

/**
 *
 * @author gerha
 *
 *)
 * */

public class REST_Git_Ueubung2209 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:8080/heart");
        server.start();
    }
}
