package com.example.broma;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Broma(String setup, String punchline) {
    public String getJoke() {
        return setup + " " + punchline;
    }
}
