package it.interno.documenti.mapper;

import it.interno.documenti.dto.TTipoDocumentoDto;
import it.interno.documenti.entity.TTipoDocumento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TTipoDocumentoMapper {

    TTipoDocumento toEntity(TTipoDocumentoDto tTipoDocumentoDto) ;

    @InheritInverseConfiguration()
    @Mapping(target = "descrizioneTipoDocumento", expression = "java(tTipoDocumento.getDescrizioneTipoDocumento().trim())")
    TTipoDocumentoDto toDto(TTipoDocumento tTipoDocumento) ;
}
