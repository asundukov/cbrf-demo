package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class CbrfService {
    @PostConstruct
    public void init() {
        RestTemplate r = new RestTemplate();
        CurrencyDto dto = r.getForEntity("http://www.cbr.ru/scripts/XML_daily.asp", CurrencyDto.class).getBody();
        System.out.println(dto.toString());
    }
}
