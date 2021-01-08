package com.example.demo;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

public class ValuteDto {
    @XmlElement(name = "NumCode")
    public Integer numCode;

    @XmlElement(name = "CharCode")
    public String charCode;

    @XmlElement(name = "Nominal")
    public String nominal;

    @XmlElement(name = "Name")
    public String name;

    public BigDecimal valueField;

    @XmlElement(name = "Value")
    public void setValue(String valueField) {
        this.valueField = new BigDecimal(valueField.replace(',', '.'));
    }

    @Override
    public String toString() {
        return "Valute{" +
                "numCode=" + numCode +
                ", charCode='" + charCode + '\'' +
                ", nominal='" + nominal + '\'' +
                ", name='" + name + '\'' +
                ", value='" + valueField + '\'' +
                '}';
    }
}
