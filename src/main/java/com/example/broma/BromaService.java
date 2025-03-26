package com.example.broma;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BromaService {
    RestTemplate restTemplate = new RestTemplate();

    public String getBromaGeneral() {
        Broma[] b = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/general/random", Broma[].class);
        return (b != null && b.length > 0) ? b[0].getJoke() : "No joke found!";
    }
    public String getBromaKnock() {
        Broma[] b = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/knock-knock/random", Broma[].class);
        return (b != null && b.length > 0) ? b[0].getJoke() : "No joke found!";
    }
    public String getBromaProgramacion() {
        Broma[] b = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/programming/random", Broma[].class);
        return (b != null && b.length > 0) ? b[0].getJoke() : "No joke found!";
    }

    public String getBromaPadre() {
        Broma[] b = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/dad/random", Broma[].class);
        return (b != null && b.length > 0) ? b[0].getJoke() : "No joke found!";
    }
}
