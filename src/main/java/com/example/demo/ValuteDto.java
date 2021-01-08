package com.example.demo;

import javax.xml.bind.annotation.XmlElement;

public class ValuteDto {
    @XmlElement(name = "NumCode")
    public Integer numCode;

    @XmlElement(name = "CharCode")
    public String charCode;

    @XmlElement(name = "Nominal")
    public String nominal;

    @XmlElement(name = "Name")
    public String name;

    @XmlElement(name = "Value")
    public String value;

    @Override
    public String toString() {
        return "Valute{" +
                "numCode=" + numCode +
                ", charCode='" + charCode + '\'' +
                ", nominal='" + nominal + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
