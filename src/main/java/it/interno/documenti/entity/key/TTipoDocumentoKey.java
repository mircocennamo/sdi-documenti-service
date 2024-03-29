package it.interno.documenti.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TTipoDocumentoKey implements Serializable {
    private String tipoDocumento;
    private Timestamp tsInserimento;
}
