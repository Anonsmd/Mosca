package com.mutiny.demo.dto;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author: Anonsmd
 * @Date: 2020/2/10 12:32
 */
public class CalculateShowCalDTO {
    private Date data;
    private int num;
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public CalculateShowCalDTO() {
    }

    public CalculateShowCalDTO(Date data, int num) {
        this.data = data;
        this.num = num;
    }
}
