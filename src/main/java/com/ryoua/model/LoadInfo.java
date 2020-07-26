package com.ryoua.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * * @Author: RyouA
 * * @Date: 2020/7/26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoadInfo {
    private String oid;
    private double memoryAll;
    private double memoryUse;
    private double memorySwapAll;
    private double memorySwapUse;
    private String memoryUnit;

    private double cpuLoad;
    private String updateTime;
    private long updateTimeMills;
}