/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest_git_ueubung2209;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author gerha
 */
@Path("Zahlen")
public class Resourcen {

    @GET
    @Path("Test")
    @Produces(MediaType.TEXT_PLAIN)
    public String number() {
        int rand = (int) (Math.random() * 100);
        return rand + "";
    }
}
