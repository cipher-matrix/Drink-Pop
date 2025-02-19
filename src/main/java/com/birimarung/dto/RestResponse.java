package com.birimarung.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


@Getter
@Setter
public class RestResponse<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String message;
    private Integer statusCode;
    private T data;
}
