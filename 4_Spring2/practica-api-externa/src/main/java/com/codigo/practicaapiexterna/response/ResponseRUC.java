package com.codigo.practicaapiexterna.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ResponseRUC {

    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
    private String condicion;
    private String direccion;
    private Boolean EsAgenteRetencion;

}
