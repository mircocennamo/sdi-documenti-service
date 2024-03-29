package it.interno.documenti.entity;

import it.interno.documenti.entity.key.TTipoDocumentoKey;
import lombok.*;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TTIPODOCUMENTO", schema = "DBDOCUM")
@IdClass(TTipoDocumentoKey.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TTipoDocumento {

    @Id
    @Column(name = "TIPODOCUMENTO")
    String tipoDocumento;
    @Id
    @Column(name = "TSINSERIMENTO")
    Timestamp tsInserimento;

    @Column(name = "DESCRIZIONETIPODOCUMENTO")
    String descrizioneTipoDocumento;
    @Column(name = "DATAINIZIOVALIDITA")
    LocalDate dataInizioValidita;
    @Column(name = "DATAFINEVALIDITA")
    LocalDate dataFineValidita;
    @Column(name = "TSCANCELLAZIONE")
    Timestamp tsCancellazione;
    @Column(name = "FLGIDENTITA")
    String flagIdentita;
    @Column(name = "IDMACROCATEGORIADOCUMENTO")
    String idMacroCategoria;

}
