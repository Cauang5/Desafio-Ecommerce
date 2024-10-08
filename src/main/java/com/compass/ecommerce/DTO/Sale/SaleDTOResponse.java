package com.compass.ecommerce.DTO.Sale;

import com.compass.ecommerce.DTO.ItemSale.ItemSaleDTOResponse;
import com.compass.ecommerce.model.enums.SaleStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record SaleDTOResponse(Long id,
                              String userName,

                              @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC" )
                              LocalDateTime dateTime,

                              SaleStatus status,

                              @DecimalMin(value = "0.01", message = "O total da venda deve ser maior que zero.")
                              BigDecimal total,
                              List<ItemSaleDTOResponse> itens) {
}
