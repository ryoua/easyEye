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
    private String mid;

    private String memoryUnit;
    private Double memoryAll;
    private Double memoryUse;

    private String memorySwapUnit;
    private Double memorySwapAll;
    private Double memorySwapUse;

    private Double cpuLoad;
    private String updateTime;
    private Long updateTimeMills;
}
