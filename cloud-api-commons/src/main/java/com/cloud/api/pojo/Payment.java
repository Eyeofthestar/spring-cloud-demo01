package com.cloud.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private Integer id;

    private String searial;

    private static final long serialVersionUID = 1L;
}
