package com.example.anas.demo;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
public class RESTCONT {
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/get_jazz_header")
    public void getJazzHe(
            @RequestHeader Map<String, String> headers, HttpServletResponse response, @RequestParam String vinfo) throws IOException {
        //  log.info("Request Received For get_jazz_header");
        String msisdn = headers.get("msisdn");
        if (msisdn == null) {
            //    log.info("Msisdn Not Found");
            System.out.println("msisdn not found");
            response.sendRedirect("https://game-now.noeticworld.com//index.php?msisdn=not_found&vinfo=" + vinfo);
        } else {
            try {
                //log.info("Msisdn Found: " + msisdn);
                System.out.println("msisdn found");
                response.sendRedirect("https://game-now.noeticworld.com/index.php?msisdn=" + msisdn + "&vinfo=" + vinfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }








}
