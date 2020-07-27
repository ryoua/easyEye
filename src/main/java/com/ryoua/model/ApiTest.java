package com.ryoua.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * * @Author: RyouA
 * * @Date: 2020/7/22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiTest {
    private String url;
    private boolean valid;
    private int interval;

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
