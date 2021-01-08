package com.example.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ValCurs")
public class CurrencyDto {
    @XmlElement(name="Valute")
    public List<ValuteDto> valutes;

    @Override
    public String toString() {
        return "CurrencyDto{" +
                "valutes=" + valutes +
                '}';
    }
}
