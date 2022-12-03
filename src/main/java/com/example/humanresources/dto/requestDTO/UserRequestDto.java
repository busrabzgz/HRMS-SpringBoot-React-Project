package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.dto.AbstractDTO;
import com.example.humanresources.dto.responseDTO.ChargeResponseDto;
import com.example.humanresources.dto.responseDTO.DepartmentResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UserRequestDto extends AbstractDTO {
    private Long id;
    private String firsName;
    private String lastName;
    private String citizenNumber;
    private String position;
    private BigDecimal salary;
    private String  level;
    private String email;

}